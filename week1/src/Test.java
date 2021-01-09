//package NSALoginController.java;
import java.util.Scanner;

public class Test
{
    /******************************************
     * MAIN
     *****************************************/
    public static void main(String[] args) throws Exception
    {
        // Instance main variables
        String password = "";
        String salt = "";
        String hash = "";

        // Instance a new User object
        User u = new User(password, salt, hash);

        // Prompt for password using a call to weakPassword()
        WeakPasswordException wpe = new WeakPasswordException();

        // Call User's setPassword to set
        u.setPassword(wpe.weakPassword());

        // Call hashUserPassword and pass it
        // the user object
        NSALoginController.hashUserPassword(u);

        // Output the password for view.
        System.out.println ("Your new hashed and salted password is: " + u.getHashedPassword() + u.getSalt());
        u.setPassword(wpe.weakPassword());
        // Verify the password integrity
        if(NSALoginController.verifyPassword(u) == true)
        {
            System.out.println ("Password verified.");
        } else
        {
            System.out.println ("Password integrity failed.");
        }
    }
}
