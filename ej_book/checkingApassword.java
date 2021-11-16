import static java.lang.System.*;
import java.util.Scanner;



public class checkingApassword {


    public static void main(String[] args) {
        out.print("What's the password");

        Scanner.keyboard = new Scanner(in);
        String password = keyboard = keyboard.next();

        out.println("you Typed >>" + password + "<<");
        out.println();

        if (password == "swordfish"){
           out.println("The word you typed is stored"); 
           out.println("The same place as the real");
           out.println("password. You must be a");
           out.println("hacker.");
        } else {
            out.println("The word you typed is not");
            out.println("The stored in the same place as");
            out.println("The real password, but that's");
            out.println("No big deal.");
        }
        out.println();

        if (password.equals("swordfish")) {
            out.println("The word you typed is the");
            out.println("The sama character as the real");
            out.println("Password. You can use our");
            out.println("Precious system.");
        } else{
            out.println("The word you typed is doesn't");
            out.println("The same Character as ");
            out.println("The real password. You can't");
            out.println("USe our Precious system.");
            
        }
        
        keyboard.close();


    }
}
