package com.techreturn.test;

import com.techreturn.mars.*;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.ArrayList;
import java.util.List;

public class MarsRoversTest {

    @Rule
    public ExpectedException exceptionRule = ExpectedException.none();

    @Test
    public void MultipleRoverTest() throws Exception {
        Plateau plateau = new Plateau(5, 5);
        ArrayList<MarsVehicles> roversList = new ArrayList<>();
        Rover rover1 = new Rover(0, 0, Orientation.W, plateau);
        Rover rover2 = new Rover(1, 1, Orientation.N, plateau);
        roversList.add(rover1);
        roversList.add(rover2);

        MarsRovers marsRovers = new MarsRovers(roversList, plateau);

    }

    @Test
    public void MultipleRoverCrushTest() throws Exception {
        exceptionRule.expect(Exception.class);


        Plateau plateau = new Plateau(5, 5);
        ArrayList<MarsVehicles> roversList = new ArrayList<>();
        Rover rover1 = new Rover(0, 0, Orientation.W, plateau);
        Rover rover2 = new Rover(0, 0, Orientation.N, plateau);
        roversList.add(rover1);
        roversList.add(rover2);

        MarsRovers marsRovers = new MarsRovers(roversList, plateau);

        //Assert
        exceptionRule.expectMessage("Not valid position for Rover");

    }
}
