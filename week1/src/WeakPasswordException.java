import java.util.Scanner;

public class WeakPasswordException extends Exception
{
    private String password;
    boolean hasDigit = false;


    /* Default Constructor */
    public WeakPasswordException()
    {
        //super (violation);
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
            System.out.println ("Password: ");
            //Take the password, convert it to a character array.
            // Store input in [local] password variable
            password = input.nextLine();
            //char[] testPassword = password.toCharArray();

                if (password.matches("[\\S\\s]*\\d+[\\S\\s]*"))
                {
                    hasDigit = true;
                } else
                {
                    System.out.println ("Weak password.");
                    throw new WeakPasswordException();
                }
                if (password.length() >= 8 && hasDigit)
                {
                    return password;
                }
            //}
        } catch (WeakPasswordException e)
        {
            System.out.println ("Password thwarted.");
            weakPassword();
        }
        return password;
    }
}
