package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;


public class BoardTestSuite {


    @Test
    public void testTaskAdd() {

        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);
        board.addToDoTask("first task");
        board.addToInProgressTask("second task");
        board.addToDone("last task");

        Assert.assertEquals(true, board.getToDoList().tasks.contains("first task"));
        Assert.assertEquals(true, board.getInProgressList().tasks.contains("second task"));
        Assert.assertEquals(true, board.getDoneList().tasks.contains("last task"));


    }
}
