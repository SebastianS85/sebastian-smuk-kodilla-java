package com.kodilla.kodilla.patterns2.observer.forum;


public class ForumUser implements Observer {

    private String username;


    public ForumUser(String username) {
        this.username = username;
    }

    private int updateCount;

    public String getUsername() {
        return username;
    }

    public int getUpdateCount() {
        return updateCount;
    }

    @Override
    public void update(ForumTopic forumTopic) {
        System.out.println(username + ": new messages in Topic" + forumTopic.getName() + "\n" +
                "(total: " + forumTopic.getMessages().size() + "messages)");
        updateCount++;
    }

}
