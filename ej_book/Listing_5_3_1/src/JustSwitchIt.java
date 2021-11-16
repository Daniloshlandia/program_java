import static java.lang.System.out;
import java.util.Scanner;
//Listing 5-6


public class JustSwitchIt {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        out.print("which verse ");
        String  verse = keyboard.next();

        switch (verse){
            case "one":
            out.println("That's because he has no brain.");
            break;
            case "Two":
            out.println("That's because he is a pain.");
            break;
            case "Three": 
            out.println("Cause this is the last refrain.");
            break;

            default:
            out.println("No such verse. Please try again.");
            break;
        }

        out.println("OH ........");

        keyboard.close();


    }
    
}
