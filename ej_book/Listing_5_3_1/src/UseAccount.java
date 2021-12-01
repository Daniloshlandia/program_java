import static java.lang.System.out;

public class UseAccount {
    public static void main(String[] args) {
        Account myAccount;
        Account yourAccount;

        myAccount = new Account();
        yourAccount = new Account();

        myAccount.setName("Barry Burd");
        myAccount.setAddress("222 cyberpunk street");
        myAccount.setBalance(40.23);
        
        yourAccount.setName("Danilo");
        yourAccount.setAddress("3 story street Salem");
        yourAccount.setBalance(5.04);

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
       
        myAccount.display();
        out.print(" plus $");
        out.print(myAccount.getInterest(5.00));
        out.println(" Interest ");
        out.println();
        yourAccount.display();

        double yourInterestRate = 7.00;
        out.print(" plus ");
        double yourInterestAmount = yourAccount.getInterest(yourInterestRate);
        out.printf("$%4.2f", yourInterestAmount);
        out.println(" Interest ");
         */
        out.print(myAccount.getName());
        out.print(" (");
        out.print(myAccount.getAddress());
        out.print(") has $");
        out.println(myAccount.getBalance());


        out.print(yourAccount.getName());
        out.print(" (");
        out.print(yourAccount.getAddress());
        out.print(") has $");
        out.println(yourAccount.getBalance() + 1.00);


    }
}
