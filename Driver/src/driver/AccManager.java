package driver;

import java.util.*;
import javax.swing.JOptionPane;
import java.util.ArrayList;

public class AccManager {

    private String LoginID;
    private String Password;
    public Items item;
    public static ArrayList <Items> itemList = new ArrayList<Items>();
    /**
     * Setter for loginID This is used to set Manager's loginID.
     *
     * @param loginID
     */
    public void setLoginID(String loginID) {
        this.LoginID = loginID;
    }

    /**
     * Getter for loginID. This is used to return Manager's loginID.
     *
     * @return loginID
     */
    public String getLoginID() {
        return this.LoginID;
    }

    /**
     * Setter for Manager's password. This is used to set manager's password.
     *
     * @param password
     */
    public void setPassword(String password) {
        this.Password = password;
    }

    /**
     * Getter for Manager's password. This is used to return manager's password.
     *
     * @return password
     */
    public String getPassword() {
        return this.Password;
    }
}
