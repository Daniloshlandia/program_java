import static java.lang.System.out;
import java.util.Scanner;

// listing program 5-5

public class Authenticator2 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);


        out.print("Username: ");
        String username = keyboard.next();

        if (username.equals("dash")){
            out.print("Password: ");
            String password = keyboard.next();

            if (password.equals("modobiju")) {
                out.println("Esta en el sitema doc");

            } else {
                out.println("Password denegado ");

            }
        } else {
            out.println("User desconocido");
        }
        keyboard.close();
    }
}
