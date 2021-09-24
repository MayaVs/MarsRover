import com.techreturn.mars.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static Plateau plateau;
    public static Rover rover;
    public static void main(String[] args) throws IOException {
            while(true){
                System.out.println("Please enter the plateau's upper-right coordinates");
                BufferedReader reader = new BufferedReader(
                        new InputStreamReader(System.in));

                // Reading data using readLine
                String[] size = reader.readLine().split(" ");

                try{
                    plateau = new Plateau(Integer.parseInt(size[0]), Integer.parseInt(size[1]));
                    plateau.printPlateau();
                }
                catch (Exception e){
                    System.out.println("Invalid parameters. Both width and height for plateau should be positive numbers.");
                    continue;
                }
                break;
            }

        while(true){
            System.out.println("Please enter the rover position and orientation");
            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(System.in));

            // Reading data using readLine
            String[] roverInit = reader.readLine().split(" ");

            try{
                rover =  new Rover(Integer.parseInt(roverInit[0]), Integer.parseInt(roverInit[1]), Orientation.valueOf(roverInit[2]));
                int[] currentPosition = rover.getPosition();
                if(plateau.isPositionFree(currentPosition[0], currentPosition[1])) plateau.setPositionOccupied(currentPosition[0], currentPosition[1]);
                plateau.printPlateau();
            }
            catch (Exception e){
                System.out.println("Invalid parameters. Both width and height for plateau should be positive numbers.");
                continue;
            }
            break;
        }
        }
}
