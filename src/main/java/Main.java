import com.techreturn.mars.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static Plateau plateau;
    public static Stack<Rover> rovers= new Stack<>();

    public static void main(String[] args) throws IOException {

        askToInitPlateau();

        while(true){
            System.out.println("Would you like to land a rover(yes/no)");
            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(System.in));

            // Reading data using readLine
            String answer = reader.readLine();
            if(answer.equalsIgnoreCase("yes")){
                Rover nextRover = null;
                rovers.add(nextRover);
                askToInitRover();
                askCommandsForRover();
            } else {
                break;
            }
        }
    }

    public static void askToInitPlateau() throws IOException {
        while (true) {
            System.out.println("Please enter the plateau's upper-right coordinates");
            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(System.in));

            // Reading data using readLine
            String[] coordinates = reader.readLine().split(" ");

            try {
                plateau = new Plateau(Integer.parseInt(coordinates[0]), Integer.parseInt(coordinates[1]));
            } catch (Exception e) {
                System.out.println("Invalid parameters. Coordinates for plateau should be positive numbers.");
                continue;
            }
            break;
        }
    }

    public static void askToInitRover() throws IOException {
        while (true) {
            System.out.println("Please enter the rover position and orientation");
            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(System.in));

            // Reading data using readLine
            String[] roverInit = reader.readLine().split(" ");

            try {
                rovers.set(0, new Rover(Integer.parseInt(roverInit[0]), Integer.parseInt(roverInit[1]), Orientation.valueOf(roverInit[2]), plateau));
            } catch (Exception e) {
                System.out.println("Not valid position for Rover.");
                continue;
            }
            break;
        }
    }
    public static void askCommandsForRover() throws IOException {
        while (true) {
            System.out.println("Please enter commands for the rover");
            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(System.in));

            // Reading data using readLine
            String roverCommands = reader.readLine();

            try {
                Rover rover = rovers.firstElement();
                if(!rover.sendCommands(roverCommands)){
                    System.out.println("Can't execute commands.");
                    continue;
                }
            } catch (Exception e) {
                System.out.println("Can't execute commands.");
            }
            plateau.printPlateau();
            rovers.firstElement().printPositionAndOrientation();
            break;
        }
    }
}
