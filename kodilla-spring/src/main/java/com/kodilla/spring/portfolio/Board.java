package com.kodilla.spring.portfolio;


import org.springframework.stereotype.Component;


public class Board {


    private TaskList toDoList;
    private TaskList inProgressList;
    private TaskList doneList;

    public Board(TaskList toDoList, TaskList inProgressList, TaskList doneList) {
        this.toDoList = toDoList;
        this.inProgressList = inProgressList;
        this.doneList = doneList;
    }

    public TaskList getToDoList() {
        return toDoList;
    }

    public TaskList getInProgressList() {
        return inProgressList;
    }

    public TaskList getDoneList() {
        return doneList;
    }

    public void addToDoTask(String task) {
        toDoList.tasks.add(task);

    }

    public void addToInProgressTask(String task) {
        inProgressList.tasks.add(task);
    }

    public void addToDone(String task) {
        doneList.tasks.add(task);

    }
}
