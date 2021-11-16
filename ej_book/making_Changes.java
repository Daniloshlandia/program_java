

public class making_Changes {
    public static void main(String[] args) {
        
        int total = 524;
        int quarters = total / 25;
        int whatsLeft = total % 25;

        int dimes = whatsLeft /10;
        whatsLeft = whatsLeft % 10;

        int nickels = whatsLeft / 5;
        whatsLeft = whatsLeft % 5;

        int cheline = whatsLeft / 2;
        whatsLeft = whatsLeft % 2;

        int cents = whatsLeft;
        System.out.println("From " + total + " cents you get");
        System.out.println(quarters + " quarters");
        System.out.println(dimes + " Dimes");
        System.out.println(cents + " cents");
        System.out.println(nickels + " nickels");
        System.out.println(cheline + " chelines");


    }
}
