package teamwork;

public class User {
    
    private int Id;
    private String userName;
    private String password;
    private int isAdmin;
    
    public User(int userId, String userName, String password, int isAdmin){
        this.Id = userId;
        this.userName = userName;
        this.password = password;
        this.isAdmin = isAdmin;
    }

    /**
     * @return the Id
     */
    public int getId() {
        return Id;
    }

    /**
     * @param Id the Id to set
     */
    public void setId(int Id) {
        this.Id = Id;
    }

    /**
     * @return the userName
     */
    public String getUserName() {
        return userName;
    }

    /**
     * @param userName the userName to set
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the isAdmin
     */
    public int getIsAdmin() {
        return isAdmin;
    }

    /**
     * @param isAdmin the isAdmin to set
     */
    public void setIsAdmin(int isAdmin) {
        this.isAdmin = isAdmin;
    }
    public boolean isAdmin(){
        if (isAdmin == 1){
            return true;
        }
        return false;
    }
    
    
    
}