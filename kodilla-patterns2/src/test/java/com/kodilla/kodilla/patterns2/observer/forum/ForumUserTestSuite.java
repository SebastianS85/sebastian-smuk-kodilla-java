package com.kodilla.kodilla.patterns2.observer.forum;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ForumUserTestSuite {

    @Test
    public void testUpdate(){
        //Given
        ForumTopic javaHelpForum= new JavaHelpForumTopic();
        ForumTopic javaToolsForum= new JavaToolsForumTopic();
        ForumUser  johnSmith=new ForumUser("John Smith");
        ForumUser  ivoneEscobar=new ForumUser("Ivone Escobar");
        ForumUser  jessiePinkman=new ForumUser("Jessie Pinkman");
        javaHelpForum.registerObserver(johnSmith);
        javaToolsForum.registerObserver(ivoneEscobar);
        javaToolsForum.registerObserver(jessiePinkman);
        javaHelpForum.registerObserver(jessiePinkman);
        //When
        javaHelpForum.addPost("Hi everyone could somebody help me with for loop?");
        javaHelpForum.addPost("Better use while loop in this case");
        javaToolsForum.addPost("pls help with mySql");
        javaHelpForum.addPost("While why?");
        javaToolsForum.addPost("When i log in -i get bad credentials");
        //Then
        assertEquals(3,johnSmith.getUpdateCount());
        assertEquals(2,ivoneEscobar.getUpdateCount());
        assertEquals(5,jessiePinkman.getUpdateCount());
    }
}
