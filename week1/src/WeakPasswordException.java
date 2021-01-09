import java.util.Scanner;

public class WeakPasswordException extends Exception
{
    private String password;
    private String salt;
    private String hash;
    boolean hasDigit = false;


    /* Default Constructor */
    public WeakPasswordException()
    {
        //super (password);
    }

    /*Non-default Constructor*/
    public WeakPasswordException(String password)
    {
        this.password = password;
    }

    public String weakPassword ()
    {
        // Java requires this to watch for your input
        Scanner input = new Scanner(System.in);

        try
        {
            System.out.print ("Password: ");

            // Store input in [local] password variable
            password = input.nextLine();
            User u = new User(password, salt, hash);

                if (password.matches("[\\S\\s]*\\d+[\\S\\s]*"))
                {
                    hasDigit = true;
                    System.out.println ("Your current hashed and salted password is: " + password + " " +
                            u.getHashedPassword() + " " + u.getSalt());
                } else
                {
                    throw new WeakPasswordException();
                }
                if (password.length() >= 8 && hasDigit)
                {
                    return password;
                }

        } catch (WeakPasswordException e)
        {
            System.out.println ("Password weak.");
            weakPassword();
        }
        return password;
    }
}
