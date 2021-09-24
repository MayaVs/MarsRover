import com.techreturn.mars.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Please enter the plateau width and height");

            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(System.in));

            // Reading data using readLine
            String[] size = reader.readLine().split(" ");

            Plateau plateau = new Plateau(Integer.parseInt(size[0]), Integer.parseInt(size[1]));
            plateau.printPlateau();

        }
}
