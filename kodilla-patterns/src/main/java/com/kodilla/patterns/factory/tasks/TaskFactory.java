package com.kodilla.patterns.factory.tasks;

public final class TaskFactory {
    public static final String SHOPPINGTASK = "SHOPPINGTASK";
    public static final String PAINTINGTASK = "PAINTINGTASK";
    public static final String DRIVINGTASK = "DRIVINGTASK";

    public final Task makeTask(String taskClass) {
        switch (taskClass) {

            case SHOPPINGTASK:
                return new ShoppingTask("Shopping", "Shoes", 4.0);
            case PAINTINGTASK:
                return new PaintingTask("Paint", "red", "house");
            case DRIVINGTASK:
                return new DrivingTask("Driving", "New York", "bus");
            default:
                return null;
        }

    }

}
