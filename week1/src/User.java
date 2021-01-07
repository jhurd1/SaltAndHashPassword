public class User
{

    String password;
    String salt;
    String hash;
    String hashString;

    // CONSTRUCTORS

    /******************************************
     * CONSTRUCTOR
     * @param password
     * @param salt
     * @param hash
     *****************************************/
    public User(String password, String salt, String hash)
    {
        this.password = password;
        this.salt = salt;
        this.hash = hash;
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
     * @param hash
     *****************************************/
    public void setHash(String hash)
    {
        this.hash = hash;
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
     *****************************************/
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
     * GETHASH
     *****************************************/
    public String getHash()
    {
        return hash;
    }

    /******************************************
     * GETHASHEDPASSWORD
     *****************************************/
    public String getHashedPassword() {return hashString;}

    // OTHER USER DATA MEMBERS
}
