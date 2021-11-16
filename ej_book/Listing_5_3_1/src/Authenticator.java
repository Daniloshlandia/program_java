import javax.swing.JOptionPane;
// Listing program 5-4 

public class Authenticator {
    public static void main(String[] args) {
        
        String username = JOptionPane.showInputDialog("Username: ");
        String password = JOptionPane.showInputDialog("Password: ");
        
       

        if (!(username == null || password == null) &&
        (
            (username.equals("bburd") && password.equals("swordfish")) ||
            (username.equals("hritter") && password.equals("preakston")) || username.equals(username.toUpperCase())
        
        )
    )
        {
            JOptionPane.showMessageDialog(null, "You are in.");
        } else {
            JOptionPane.showMessageDialog(null, "You are suspicious. ");
        }
    }
}
