package com.kodilla.patterns.strategy.social;

import com.kodilla.patterns.strategy.publisher.SnapchatPublisher;
import com.kodilla.patterns.strategy.publisher.TwitterPublisher;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class UserTestSuite {
    @Before
    public void before() {
        System.out.println("Test ist starting...");
    }

    @Test
    public void testDefaultSharingStrategies() {

        //Given
        User steven = new Millenials("Steven Smith");
        User mark = new YGeneration("Mark Mitty");
        User john = new ZGeneration("John Deere");

        //When

        String stevenPublish = steven.sharePost();
        System.out.println(steven.getName() + " " + stevenPublish);
        String markPublish = mark.sharePost();
        System.out.println(mark.getName() + " " + markPublish);
        String johnPublish = john.sharePost();
        System.out.println(john.getName() + " " + johnPublish);

        //Then
        Assert.assertEquals("publish on Facebook", stevenPublish);
        Assert.assertEquals("publish on Twitter", markPublish);
        Assert.assertEquals("publish on Snapchat", johnPublish);

    }

    @Test
    public void testIndividualSharingStrategy() {
        //Given
        User steven = new Millenials("Steven Smith");
        //When
        steven.setSocialPublisher(new SnapchatPublisher());
        String stevenPublisher = steven.sharePost();
        System.out.println(steven.getName() + " " + stevenPublisher);
        //Then
        Assert.assertEquals("publish on Snapchat", stevenPublisher);

    }
}
