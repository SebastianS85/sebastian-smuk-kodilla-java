package com.kodilla.testing.forum.statistics;


import org.junit.*;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ForumTestSuite {
    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }
   @Test
   public void postEqualZero(){
       Statistics statisticsMock=mock(Statistics.class);
       List<String> users=new ArrayList<>();
       for(int i=0;i<900;i++){

           users.add("User"+i);
       }
       when(statisticsMock.usersNames()).thenReturn(users);
       when(statisticsMock.postsCount()).thenReturn(0);

       ForumStatistic data=new ForumStatistic();
       data.calculateAdvStatistics(statisticsMock);
       data.showStatistics();
       Assert.assertEquals(0.0,data.getMeanPostPUser(),0.0);
    }
    @Test
    public void postEqualThousand(){
        Statistics statisticsMock=mock(Statistics.class);
        List<String> users=new ArrayList<>();
        for(int i=0;i<1000;i++){

            users.add("User"+i);
        }
        when(statisticsMock.usersNames()).thenReturn(users);
        when(statisticsMock.postsCount()).thenReturn(100);
        when(statisticsMock.commentsCount()).thenReturn(120);
        ForumStatistic data=new ForumStatistic();
        data.calculateAdvStatistics(statisticsMock);
        data.showStatistics();
        Assert.assertEquals(0.1,data.getMeanPostPUser(),0.0);
        Assert.assertEquals(1.2,data.getMeanCommentsPPost(),0.0);
        Assert.assertEquals(0.12,data.getMeanCommentsPUser(),0.0);
    }
    @Test
    public void commentsEqualsZero(){
        Statistics statisticsMock=mock(Statistics.class);
        List<String> users=new ArrayList<>();
        for(int i=0;i<1000;i++){

            users.add("User"+i);
        }
        when(statisticsMock.usersNames()).thenReturn(users);
        when(statisticsMock.postsCount()).thenReturn(100);
        when(statisticsMock.commentsCount()).thenReturn(0);
        ForumStatistic data=new ForumStatistic();
        data.calculateAdvStatistics(statisticsMock);
        data.showStatistics();
        Assert.assertEquals(0.1,data.getMeanPostPUser(),0.0);
        Assert.assertEquals(0.0,data.getMeanCommentsPPost(),0.0);
        Assert.assertEquals(0.0,data.getMeanCommentsPUser(),0.0);
    }
    @Test
    public void commentsLowerThanPosts(){
        Statistics statisticsMock=mock(Statistics.class);
        List<String> users=new ArrayList<>();
        for(int i=0;i<100;i++){

            users.add("User"+i);
        }
        when(statisticsMock.usersNames()).thenReturn(users);
        when(statisticsMock.postsCount()).thenReturn(100);
        when(statisticsMock.commentsCount()).thenReturn(50);
        ForumStatistic data=new ForumStatistic();
        data.calculateAdvStatistics(statisticsMock);
        data.showStatistics();
        Assert.assertEquals(1.0,data.getMeanPostPUser(),0.0);
        Assert.assertEquals(0.5,data.getMeanCommentsPPost(),0.0);
        Assert.assertEquals(0.5,data.getMeanCommentsPUser(),0.0);
    }
    @Test
    public void commentsHigherThanPosts(){
        Statistics statisticsMock=mock(Statistics.class);
        List<String> users=new ArrayList<>();
        for(int i=0;i<100;i++){

            users.add("User"+i);
        }
        when(statisticsMock.usersNames()).thenReturn(users);
        when(statisticsMock.postsCount()).thenReturn(50);
        when(statisticsMock.commentsCount()).thenReturn(100);
        ForumStatistic data=new ForumStatistic();
        data.calculateAdvStatistics(statisticsMock);
        data.showStatistics();
        Assert.assertEquals(0.5,data.getMeanPostPUser(),0.0);
        Assert.assertEquals(2.0,data.getMeanCommentsPPost(),0.0);
        Assert.assertEquals(1.0,data.getMeanCommentsPUser(),0.0);
    }
    @Test
    public void userEqualsZero(){
        Statistics statisticsMock=mock(Statistics.class);
        List<String> users=new ArrayList<>();

        when(statisticsMock.usersNames()).thenReturn(users);
        when(statisticsMock.postsCount()).thenReturn(50);
        when(statisticsMock.commentsCount()).thenReturn(100);
        ForumStatistic data=new ForumStatistic();
        data.calculateAdvStatistics(statisticsMock);
        data.showStatistics();
        Assert.assertEquals(0.0,data.getMeanPostPUser(),0.0);
        Assert.assertEquals(0.0,data.getMeanCommentsPPost(),0.0);
        Assert.assertEquals(0.0,data.getMeanCommentsPUser(),0.0);
    }
    @Test
    public void usersEqualsHundred(){
        Statistics statisticsMock=mock(Statistics.class);
        List<String> users=new ArrayList<>();
        for(int i=0;i<100;i++){

            users.add("User"+i);
        }
        when(statisticsMock.usersNames()).thenReturn(users);
        when(statisticsMock.postsCount()).thenReturn(80);
        when(statisticsMock.commentsCount()).thenReturn(150);
        ForumStatistic data=new ForumStatistic();
        data.calculateAdvStatistics(statisticsMock);
        data.showStatistics();
        Assert.assertEquals(0.8,data.getMeanPostPUser(),0.0);
        Assert.assertEquals(1.875,data.getMeanCommentsPPost(),0.0);
        Assert.assertEquals(1.5,data.getMeanCommentsPUser(),0.0);
    }



}
