import static java.lang.System.out;
import java.util.Scanner;
import java.util.Random;

public class guessingGame {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        out.print("Enter an int from 1 to 10: ");

        int inputNumber = keyboard.nextInt();
        int randomNumber = new Random().nextInt(10) + 1;

        if (inputNumber == randomNumber){
            out.println("**********");
            out.println("*You win.*");
            out.println("**********");

        } else {
            out.println("You lose **");
            out.println("The random number was ");
            out.println(randomNumber + ".");
        }
        out.println("Ty for playing bro");
        keyboard.close();
    }
}
