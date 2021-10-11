package com.techreturn.mars;

import java.util.Locale;

public class Rover implements MarsVehicles{
    public int[] position = new int[2];
    public Orientation orientation;
    public Plateau plateau;

    public Rover(int x, int y, Orientation orientation, Plateau plateau) throws Exception {
        if(plateau.isPositionFree(x, y)){
            plateau.setPositionOccupied(x, y);
        } else {
            throw new Exception("Not valid position for Rover");
        }

        this.position[0] = x;
        this.position[1] = y;
        this.orientation = orientation;
        this.plateau = plateau;
    }

    public boolean execute(char command) throws Exception {
        if(Character.toUpperCase(command) == 'L') {
            orientation = orientation.left();
        }
        else if(Character.toUpperCase(command) == 'R') {
            orientation = orientation.right();
        }
        else {
            int[] newPosition = calculateNewPosition();
            if (plateau.isPositionFree(newPosition[0], newPosition[1])) {
                plateau.setPositionFree(position[0], position[1]);
                this.position = newPosition;
                plateau.setPositionOccupied(position[0], position[1]);
            } else {
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean sendCommands(String commands) throws Exception {

        commands = commands.toUpperCase(Locale.ROOT);
        if (!commands.matches("^[MLR]+$")) {
            throw new Exception("Invalid  commands.");
        }

        for(char c: commands.toCharArray()){
            if(!execute(c)){
                return false;
            }
        }
        return true;
    }
    public int[] calculateNewPosition(){
        int[] newPos = new int[2];
        switch(orientation){
            case N: newPos[0] = position[0]; newPos[1] = position[1] + 1; break;
            case E: newPos[0] = position[0] + 1; newPos[1] = position[1]; break;
            case S: newPos[0] = position[0]; newPos[1] = position[1] - 1;break;
            case W: newPos[0] = position[0] - 1; newPos[1] = position[1]; break;
        }
        return newPos;
    }
    public void printPositionAndOrientation(){
        System.out.println(position[0] + " " + position[1] + " " + orientation.toString());
    }

    public int[] getPosition(){
        return this.position;
    }

    public Orientation getOrientation(){
        return this.orientation;
    }
}
