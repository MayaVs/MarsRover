package com.techreturn.mars;

public class Plateau {
    public int topRow;
    public int lastColumn;
    private int[][] plateauGrid;

    public Plateau(int topRow, int lastColumn) throws Exception {
        if(topRow < 0 || lastColumn < 0) throw new Exception("Invalid coordinates.");
            this.topRow = topRow;
            this.lastColumn = lastColumn;
            this.plateauGrid = new int[topRow+1][lastColumn+1];

        for(int i = lastColumn; i>=0; --i){
            for(int j = topRow; j>=0; --j){
                plateauGrid[i][j] = 0;
            }
        }
    }
    public void printPlateau(){
        for(int j = topRow; j >= 0; --j){
            for(int i = 0; i<= lastColumn; ++i) {
                System.out.print(plateauGrid[i][j]);
            }
            System.out.print("\n");
        }
    }
    public boolean isPositionFree(int x, int y) throws Exception {
        boolean isFree = false;
        try{
            isFree = plateauGrid[x][y] == 0;
        } catch (Exception e){
            throw new Exception("Invalid position.");
        }
        return isFree;
    }
    public void setPositionOccupied(int x, int y) throws Exception {
        try{
            plateauGrid[x][y] = 1;
        } catch(Exception e){
            throw new Exception("Invalid position.");
        }

    }

    public void setPositionFree(int x, int y){
        plateauGrid[x][y] = 0;
    }

}
