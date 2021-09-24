package com.techreturn.mars;

public class Rover {
    public int[] position;
    public Orientation orientation;

    public Rover(int x, int y, Orientation orientation) {
        this.position = new int[2];
        this.position[0] = x;
        this.position[1] = y;
        this.orientation = orientation;
    }

    public void execute(char command) {
    }
    private int[] calculateNewPosition(int command){
        return new int[2];
    }
    public void printPositionAndOrientation(){
        System.out.println(position[0] + " " + position[1] + " " + orientation.toString());
    }

    public int[] getPosition(){
        return this.position;
    }

}
