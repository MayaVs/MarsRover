package com.techreturn.test;

import com.techreturn.mars.Orientation;
import com.techreturn.mars.Plateau;
import com.techreturn.mars.Rover;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.Arrays;

import static org.junit.Assert.assertTrue;

public class RoverTest {

    public Plateau plateau = new Plateau(5, 5);

    @Rule
    public ExpectedException exceptionRule = ExpectedException.none();

    public RoverTest() throws Exception {
    }

    @Test
    public void roverExceptionTest() throws Exception {
        //Arrange
        exceptionRule.expect(Exception.class);

        //Act
        Rover rover = new Rover(-5, 0, Orientation.N, plateau);

        //Assert
        exceptionRule.expectMessage("Not valid position for Rover");
    }

    @Test
    public void executeChangeOrientation() throws Exception {
        //Arrange
        Rover rover = new Rover(0, 0, Orientation.N, plateau);

        //Act
        rover.execute('r');
        Orientation newOrientation = rover.getOrientation();

        //Assert
        assertTrue(Orientation.E == newOrientation);

    }

    @Test
    public void executeChangePosition() throws Exception {
        //Arrange
        Rover rover = new Rover(0, 0, Orientation.N, plateau);

        //Act
        rover.execute('m');
        int[] newPos = rover.getPosition();
        int[] expectedPos = {0, 1};

        //Assert
        assertTrue(Arrays.equals(newPos, expectedPos));

    }

    @Test
    public void executeChangePositionException() throws Exception {
        //Arrange
        Rover rover = new Rover(0, 5, Orientation.N, plateau);
        exceptionRule.expect(Exception.class);

        //Act
        rover.execute('m');

        //Assert
        exceptionRule.expectMessage("Invalid position.");
    }
}
