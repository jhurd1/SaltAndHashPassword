//package NSALoginController.java;
import java.util.Scanner;

public class Test
{
    public static void main(String[] args) throws Exception
    {
        // Instance main variables
        // Initializing them is enforced by the compiler
        String password = "";
        String salt = "";
        String hash = "";


        // Instance a new User object
        User u = new User(password, salt, hash);

        // Prompt for password using a call to weakPassword()
        WeakPasswordException wpe = new WeakPasswordException();
        // Call User's setPassword to set
        // User's password private variable
        // equivalent to the local variable's value
        u.setPassword(wpe.weakPassword());

        // Accessor for password did not work
        // therefore, pass in the password variable itself
        System.out.println ("password: " + password + " " + u.getHashedPassword() + " " + u.getSalt());

        // Access the NSA object's function
        // and call it against local, new User object.
        NSALoginController.hashUserPassword(u);

        // Output the password for view.
        System.out.println ("Your password is: " + password);
        System.out.println ("Your hash is: " + u.getHashedPassword() + "or: " + hash);
        System.out.println ("Your salt is: " + u.getSalt());

        // Verify the password matches the original
        NSALoginController.verifyPassword(u);
    }
}
