package com.kodilla.testing.loop;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestLoopAndBreakpointConditions {

    @Test
    public void loopTest(){
    //given
        long sum=0;
        //when
        for(int i =0;i<1000;i++){

            sum +=i;
            System.out.println("["+i+"]" + "Sum equals:  "+sum);


        }
    assertEquals(499500,sum);

    }

}
