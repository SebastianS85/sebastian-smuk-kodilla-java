package com.kodilla.testing.shape;


import com.kodilla.testing.com.kodilla.testing.shape.Circle;
import com.kodilla.testing.com.kodilla.testing.shape.ShapeCollector;
import com.kodilla.testing.com.kodilla.testing.shape.Square;
import com.kodilla.testing.com.kodilla.testing.shape.Triangle;

import org.junit.*;

import java.util.ArrayList;


public class ShapeCollectorTestSuite {
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
    public void testAddFigure(){
        //Given
        ShapeCollector testCollector= new ShapeCollector();
        //When
        testCollector.addFigure(new Triangle(2,4));
        testCollector.addFigure(new Square(7));
        System.out.println("testing add figure");
        //Then
        Assert.assertEquals(2,testCollector.getListSize());

    }
    @Test
    public void testRemoveFigure(){
        //Given
        ShapeCollector testCollector= new ShapeCollector();
        //When
        testCollector.addFigure(new Circle(5));
        testCollector.addFigure(new Triangle(8,9));
        testCollector.addFigure(new Circle(6));
        testCollector.addFigure(new Circle(5));
        testCollector.removeFigure(new Circle(5));
        System.out.println("testing removing figure");
        //Then
        Assert.assertEquals(3,testCollector.getListSize());
    }
    @Test
    public void testGetFigure(){
        //Given
        ShapeCollector testCollector= new ShapeCollector();
        //When
        testCollector.addFigure(new Circle(5));
        testCollector.addFigure(new Triangle(8,9));
        testCollector.addFigure(new Circle(6));
        testCollector.addFigure(new Circle(5));
        System.out.println("testing get figure");
        //Then
        Assert.assertEquals(new Circle(6),testCollector.getFigure(2));
    }
    @Test
    public void testShowFigure(){
        //Given
        ShapeCollector testCollector= new ShapeCollector();
        //When
        testCollector.addFigure(new Circle(5));
        testCollector.addFigure(new Triangle(8,9));
        testCollector.addFigure(new Circle(6));
        testCollector.addFigure(new Circle(5));

        ArrayList<String>testList=new ArrayList<>();
        testList.add("circle");
        testList.add("triangle");
        testList.add("circle");
        testList.add("circle");
        System.out.println("testing show figures");
        //Then
        Assert.assertEquals(testList,testCollector.showFigures());

    }
    @Test
    public void testNegativeIndex(){

        //Given
        ShapeCollector testCollector= new ShapeCollector();
        //When
        testCollector.addFigure(new Circle(5));
        testCollector.addFigure(new Triangle(8,9));
        testCollector.addFigure(new Circle(6));
        testCollector.addFigure(new Circle(5));
        System.out.println("testing get figure with negative index");
        //Then
        Assert.assertNull(testCollector.getFigure(-2));

    }
    @Test
    public void testIndexOut(){

        ShapeCollector testCollector= new ShapeCollector();
        //When
        testCollector.addFigure(new Circle(5));
        testCollector.addFigure(new Triangle(8,9));
        testCollector.addFigure(new Circle(6));
        testCollector.addFigure(new Circle(5));
        System.out.println("testing get figure with index out of bounds");
        //Then
        Assert.assertNull(testCollector.getFigure(8));


    }

}
