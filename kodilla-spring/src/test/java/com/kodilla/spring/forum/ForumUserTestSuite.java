package com.kodilla.spring.forum;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import java.applet.AppletContext;

@RunWith(SpringRunner.class)
@SpringBootTest


public class ForumUserTestSuite {

    @Test
    public void testGetUserName() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        ForumUser user = context.getBean(ForumUser.class);
        //When
        String name = user.getUserName();
        //Then
        Assert.assertEquals("John Smith", name);
    }
}
