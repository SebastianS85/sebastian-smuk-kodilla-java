package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

;

public class TaskFactoryTestSuite {

    @Test
    public void testFactoryShoppingTask() {
        //Given
        TaskFactory myTask = new TaskFactory();
        //When
        Task shoppingTask = myTask.makeTask(TaskFactory.SHOPPINGTASK);
        //Then
        Assert.assertEquals("Shopping", shoppingTask.getTaskName());
        Assert.assertEquals("Shoes", shoppingTask.executeTask());
        Assert.assertTrue(shoppingTask.isTaskExecuted());
    }

    @Test
    public void testPaintingTask() {
        //Given
        TaskFactory myTask = new TaskFactory();
        //When
        Task paintingTask = myTask.makeTask(TaskFactory.PAINTINGTASK);
        //Then
        Assert.assertEquals("Paint", paintingTask.getTaskName());
        Assert.assertEquals("house paint red", paintingTask.executeTask());
        Assert.assertTrue(paintingTask.isTaskExecuted());

    }

    @Test
    public void testDrivingTask() {
        //Given
        TaskFactory myTask = new TaskFactory();
        //When
        Task drivingTask = myTask.makeTask(TaskFactory.DRIVINGTASK);
        //Then
        Assert.assertEquals("Driving", drivingTask.getTaskName());
        Assert.assertEquals("Drive to New York with bus", drivingTask.executeTask());
        Assert.assertTrue(drivingTask.isTaskExecuted());

    }
}
