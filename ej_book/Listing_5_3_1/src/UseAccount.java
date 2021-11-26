import static java.lang.System.out;

public class UseAccount {
    public static void main(String[] args) {
        Account myAccount;
        Account yourAccount;

        myAccount = new Account();
        yourAccount = new Account();

        myAccount.name = "Barry Burd";
        myAccount.address = "222 cyberpunk street";
        myAccount.balance = 40.23;
        
        yourAccount.name = "Danilo";
        yourAccount.address = "3 story street Salem";
        yourAccount.balance = 5.04;

        /*
        out.print(myAccount.name);
        out.print(" (");
        out.print(myAccount.address);
        out.print(") has $");
        out.print(myAccount.balance);
        out.println();

        out.print(yourAccount.name);
        out.print(" ("); 
        out.print(yourAccount.address);
        out.print(") has $");
        out.print(yourAccount.balance);
        */
        myAccount.display();
        out.print(" plus $");
        out.print(myAccount.getInterest(5.00));
        out.println(" Interest ");
        out.println();
        yourAccount.display();

        double yourInterestRate = 7.00;
        out.print(" plus $");
        double yourInterestAmount = yourAccount.getInterest(yourInterestRate);
        out.print(yourInterestAmount);
        out.println(" Interest ");
    }
}
