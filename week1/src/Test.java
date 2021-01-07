//package NSALoginController.java;
import java.util.Scanner;

public class Test
{
    public static void main(String[] args) throws Exception {
        String password = "";
        String salt = "";
        String hash = "";
        // don't need an NSALoginController object
        // due to static scope
        User u = new User(password, salt, hash); //instance new User object
        Scanner input = new Scanner(System.in); // instance scanner object
        System.out.println ("Password: "); // prompt
        String pass = input.nextLine(); // store input in pass var
        u.setPassword(pass); // store pass in u's password variable
        NSALoginController.hashUserPassword(u);
        System.out.print ("Your password is: " + u.getPassword());
    }
}
