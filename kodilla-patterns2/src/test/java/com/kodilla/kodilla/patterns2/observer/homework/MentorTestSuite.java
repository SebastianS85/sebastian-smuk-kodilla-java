package com.kodilla.kodilla.patterns2.observer.homework;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MentorTestSuite {

    @Test
    public void queueTest() {
        //Given
        RequestQueue javaMentorQueue = new JavaMentorQueue();
        RequestQueue cppMentorQueue = new CppMentorQueue();
        Mentor thomasCook = new Mentor("Thomas Cook");
        Mentor jackSmith = new Mentor("Jack Smith");
        Mentor johnKowalski = new Mentor("John Kowalski");
        cppMentorQueue.registerObserver(thomasCook);
        javaMentorQueue.registerObserver(jackSmith);
        cppMentorQueue.registerObserver(johnKowalski);
        javaMentorQueue.registerObserver(johnKowalski);
        //When
        cppMentorQueue.addRequest("first cpp request");
        javaMentorQueue.addRequest("first java request");
        javaMentorQueue.addRequest("second java request");
        javaMentorQueue.addRequest("third java request");
        //Then
        assertEquals(4,johnKowalski.getUpdateCount());
        assertEquals(1,thomasCook.getUpdateCount());
        assertEquals(3,jackSmith.getUpdateCount());


    }
}



