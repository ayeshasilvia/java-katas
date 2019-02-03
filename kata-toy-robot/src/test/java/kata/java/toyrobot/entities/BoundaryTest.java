package kata.java.toyrobot.entities;//package com.reagroup.robot.validations;
//
//
//import com.reagroup.robot.entities.Boundary;
//import org.junit.Before;
//import org.junit.Test;
//
//import static org.junit.Assert.assertEquals;
//
//public class BoundaryTest {
//
//    private Boundary boundary;
//
//    @Before
//    public void setup()
//    {
//        boundary = new Boundary(0, 5, 1, 4);
//    }
//
//    @Test
//    public void allArgsConstructorInstantiatesCorrectly()
//    {
//        assertEquals(0, boundary.getMinX());
//        assertEquals(5, boundary.getMaxX());
//        assertEquals(1, boundary.getMinY());
//        assertEquals(4, boundary.getMaxY());
//    }
//
//    @Test
//    public void twoArgsConstructorInstantiatesCorrectly()
//    {
//        Boundary newBoundary = new Boundary(7, 8);
//        assertEquals(new Boundary(0, 7, 0,8), newBoundary);
//    }
//}