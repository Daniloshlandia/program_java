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
    }
}
