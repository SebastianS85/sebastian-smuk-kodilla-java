package com.kodilla.kodilla.patterns2.observer.homework;

public class Mentor implements Observer {

    private String mentorName;
    private int updateCount;

    public Mentor(String mentorName) {
        this.mentorName = mentorName;
    }

    public String getMentorName() {
        return mentorName;
    }

    public int getUpdateCount() {
        return updateCount;
    }

    @Override
    public void update(RequestQueue requestQueue) {
        System.out.println(mentorName + ": new request in queue" + requestQueue.getName() + "\n" +
                "(total: " + requestQueue.getRequests().size() + " requests)");
        updateCount++;
    }
}
