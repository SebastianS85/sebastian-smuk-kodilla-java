package com.kodilla.stream.forumuser;



import java.util.ArrayList;
import java.util.List;

public final class Forum {
    private final List<ForumUser> theUserList = new ArrayList<>();

    public Forum() {
        theUserList.add(new ForumUser(1,"User1",'M',100,2,10,1985));
        theUserList.add(new ForumUser(2,"User6",'F',10,2,10,2016));
        theUserList.add(new ForumUser(3,"User3",'M',0,2,10,1985));
        theUserList.add(new ForumUser(4,"User4",'F',0,2,10,2009));
        theUserList.add(new ForumUser(5,"User5",'M',18,2,10,1998));
        theUserList.add(new ForumUser(6,"User6",'F',1,2,10,2018));
    }

    public List<ForumUser> getList() {
        return new ArrayList<>(theUserList);
    }
}
