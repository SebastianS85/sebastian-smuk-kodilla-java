package com.kodilla.hibernate.tasklist.dao;


import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskListDaoTestSuite {

    @Autowired
    TaskListDao taskListDao;
    private static final String DESCRIPTION = "Test: My Description";

    @Test
    public void testFindByListName() {
        //Given
        TaskList taskList = new TaskList("first list", DESCRIPTION);
        taskListDao.save(taskList);
        String name = taskList.getListName();

        //When
        List<TaskList> nameList = taskListDao.findByListName(name);
        //
        Assert.assertEquals("first list", nameList.get(0).getListName());
        //Clean up
        int id = nameList.get(0).getId();
        taskListDao.deleteById(id);
    }

}



