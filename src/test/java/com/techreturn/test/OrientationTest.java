package com.techreturn.test;

import com.techreturn.mars.Orientation;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OrientationTest {

    @Test
    public void rightWTest(){
        //Arrange
        Orientation orientation = Orientation.W;
        //Act
        Orientation res = orientation.right();
        //Assert
        assertEquals(Orientation.N, res);
    }
    @Test
    public void rightNTest(){
        //Arrange
        Orientation orientation = Orientation.N;
        //Act
        Orientation res = orientation.right();
        //Assert
        assertEquals(Orientation.E, res);
    }

    @Test
    public void leftETest(){
        //Arrange
        Orientation orientation = Orientation.E;
        //Act
        Orientation res = orientation.left();
        //Assert
        assertEquals(Orientation.N, res);
    }

    @Test
    public void leftNTest(){
        //Arrange
        Orientation orientation = Orientation.N;
        //Act
        Orientation res = orientation.left();
        //Assert
        assertEquals(Orientation.W, res);
    }
}
