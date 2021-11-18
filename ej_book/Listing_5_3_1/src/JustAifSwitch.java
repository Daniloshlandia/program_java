import static java.lang.System.out;
import java.util.Scanner;

/*
-> Write a program that inputs the name of a month and outputs 
the 
number of days in that month. 
In this first version of the program, 
assume that February always has 28 days.

-> Make your code even better! Have the user input a month name, 
but also have the user input yes or no in response to the question Is it a leap year?
entre 4 excepto los multiplos de 100 que son multiplos ademas de 400.
*/

public class JustAifSwitch {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        out.println("Elige el mes para ver el numero de dias: ");
        String month = keyboard.next();

        out.println("Es año bisiesto yes or no ");
        int year = keyboard.nextInt();

        if ((year % 4 == 0) && year % 100 != 0) {
            out.println(year+ "Es un año bisiesto");
        }else if ((year % 4 == 0 ) && (year % 100 == 0) && (year % 400 == 0)) {
            out.println(year +  " Es una año bisiesto");
        }else{
            out.println(year + " No es un año bisiesto");
        }

        switch(month){
            case "Enero":
            out.println("31");
            break;

            case "Febrero":
            out.println("28");
            break;

            case "Marzo":
            out.println("30");
            break;

            case "Abril":
            out.println("31");
            break;

            case "Mayo":
            out.println("31");
            break;

            case "Junio":
            out.println("30");
            break;

            case "Julio":
            out.println("31");
            break;

            case "Agosto":
            out.println("30");
            break;
            case "Septiembre":
            out.println("30");
            break;

            case "Octubre":
            out.println("31");
            break;

            case "Noviembre":
            out.println("31");
            break;

            case "Diciembre":
            out.println("31");
            break;

        }
        out.print("Ohhh doc tiene muhcos ");
        keyboard.close();
    }
}
