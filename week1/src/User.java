public class User
{

    private String password;
    private String salt;
    private String hashString;

    // CONSTRUCTORS

    /******************************************
     * CONSTRUCTOR
     * @param password
     * @param salt
     * @param hashString
     *****************************************/
    public User(String password, String salt, String hashString)
    {
        this.password = password;
        this.salt = salt;
        this.hashString = hashString;
    }

    // ACCESSORS AND MUTATORS

    /******************************************
     * SETPASSWORD
     * @param password
     *****************************************/
    public void setPassword(String password)
    {
        this.password = password;
    }

    /******************************************
     * SETSALT
     * @param salt
     *****************************************/
    public void setSalt(String salt) {
        this.salt = salt;
    }

    /******************************************
     * SETHASH
     * @param hashString
     *****************************************/
    public void setHash(String hashString)
    {
        this.hashString = hashString;
    }

    /******************************************
     * SETHASHPASSWORD
     * @param hashString
     *****************************************/
    public void setHashedPassword(String hashString)
    {
        this.hashString = hashString;
    }

    /******************************************
     * GETPASSWORD
     ****************************************
     * @return*/
    public String getPassword()
    {
        return password;
    }

    /******************************************
     * GETSALT
     *****************************************/
    public String getSalt()
    {
        return salt;
    }

    /******************************************
     * GETHASHEDPASSWORD
     *****************************************/
    public String getHashedPassword()
    {
        return hashString;
    }

    // OTHER USER DATA MEMBERS
}
