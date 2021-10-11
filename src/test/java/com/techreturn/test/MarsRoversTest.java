package com.techreturn.test;

import com.techreturn.mars.*;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class MarsRoversTest {

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
}
