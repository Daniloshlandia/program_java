
//import javax.swing.JFrame;
import static java.lang.System.out;
import java.util.Scanner;
import java.util.*;

public class elevatorFitter2 {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        
        out.println("introduce peso de personas: ");
        int inputWeightOfPerson = keyboard.nextInt();

        out.println("\nintroduce limite peso de personas: ");
        int inputElevatorWeightLimit = keyboard.nextInt();

        int numberOfPeople = inputElevatorWeightLimit / inputWeightOfPerson;

        //boolean allTenOkay = numberOfPeople >= 10;


        if (numberOfPeople >= 10) {
            out.println("you can fit all ten of the");
            out.println("Brickerchiker dectuplets");
            out.println("on the elevator: ");
        }else{
            out.println(" You can't fit all ten of the");
            out.println(" Brickerchiker dectuplets");
            out.println("on the elevator.");
        }



        keyboard.close();

        //JFrame myFrame = new JFrame();
        //String myTitle = "Danilo Frame";

        /** 
        myFrame.setTitle(myTitle);
        myFrame.setSize(400, 300);
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.setVisible(true);
        
         */

    }
}
    