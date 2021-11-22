import static java.lang.System.out;
import java.util.Scanner;

import java.util.Random;


//Listing 6-1 

public class Guessing {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int numGuess = 0;
        int randomNumber = new Random().nextInt(100) + 1;

        out.println(" ************ ");
        out.println("Welcome to the Guessing Game");
        out.println(" ************ "); 
        out.println();

        out.print("Enter an int from 1 to 100: ");
        int inputNumber = keyboard.nextInt();
        numGuess++;
        
        
            
        

      do {
        if (inputNumber > randomNumber )  {
            out.println("Estas un poco alto ");
            out.println();
            out.println("Try again...");
            inputNumber = keyboard.nextInt();
            out.print(inputNumber);
            numGuess++;

        }else if (inputNumber < randomNumber ) {
            
            out.print(" Esta un poco abajo ");
            out.println();
            out.println("Try again...");
            inputNumber = keyboard.nextInt();
            out.print(inputNumber);
            numGuess++;

        }else{
            
            out.print("You win after ");
            out.println();
      
        }

            
          
      } while (inputNumber != randomNumber && inputNumber >= 0);  

        out.println(inputNumber + "Este numero no es positivo");
        out.println(numGuess + " guess.");

        keyboard.close();
    }
    
}
