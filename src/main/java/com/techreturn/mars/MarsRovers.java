package com.techreturn.mars;

import java.util.ArrayList;

public class MarsRovers {
    public ArrayList<MarsVehicles> vehicles;
    Plateau plateau;

    public MarsRovers(ArrayList<MarsVehicles> vehicles, Plateau plateau){
        this.vehicles = vehicles;
        this.plateau = plateau;
    }
}
