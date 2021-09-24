package com.techreturn.mars;

import java.sql.Array;

public class Plateau {
    public int height;
    public int width;
    private int[][] plateauGrid;

    public Plateau(int height, int width){
        this.height = height;
        this.width = width;
        this.plateauGrid = new int[width][height];
        for(int i = 0; i<width; ++i){
            for(int j = 0; j<height; ++j){
                plateauGrid[i][j] = 0;
            }
        }
    }
    public void printPlateau(){
        for(int i = 0; i < width; ++i){
            for(int j = 0; j< height; ++j) {
                System.out.print(plateauGrid[i][j]);
            }
            System.out.print("\n");
        }
    }
    public boolean isPositionFree(int x, int y){
        return plateauGrid[x][y] == 0;
    }
    public void setPositionOccupied(int x, int y) {
        plateauGrid[x][y] = 1;
    }

    public void setPositionFree(int x, int y){
        plateauGrid[x][y] = 0;
    }

}
