//package NSALoginController.java;
import java.util.Scanner;

public class Test
{
    public static void main(String[] args) throws Exception
    {
        // Instance main variables
        String password = "";
        String salt = "";
        String hash = "";

        
        User u = new User(password, salt, hash); //instance new User object
        Scanner input = new Scanner(System.in); // instance scanner object
        System.out.println ("Password: "); // prompt
        password = input.nextLine(); // store input in password var
        u.setPassword(password); // store password in u's password variable

        System.out.println ("password: " + password);
        NSALoginController.hashUserPassword(u);
        System.out.print ("Your password is: " + password);
    }
}
