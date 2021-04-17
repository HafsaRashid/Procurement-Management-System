package driver;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
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
    
    // FILE HANDLING
    /*public boolean writeFile(ArrayList<Items> itemList)
    {
        boolean flag = false;
        try{
            FileWriter writeFile = new FileWriter("Items.txt");
            for(int i = 0; i < itemList.size(); i++)
            {
                Items item = new Items();
                item = itemList.get(i);
                writeFile.write(item.getItemName() + "+" + item.getQuantity() + "+" + item.getCompany());
                flag = true;
                item.getItemName();
                item.getQuantity();
                item.getCompany();
            }
            writeFile.close();
        }
        catch(Exception ex)
        {
            System.out.println("File not found");
            flag = false;
        }
        return flag;
    }
    
    public void loadFile()
    {
        try{
            FileReader readFile = new FileReader("Items.txt");
            BufferedReader br = new BufferedReader(readFile);
            String line = br.readLine();
            while(line != null)
            {
                String [] arr = line.split("+");
                item.setItemName(arr[0]);
                item.setQuantity(arr[1]);
                item.setCompany(arr[2]);
                line = br.readLine();
            }
            br.close();
            readFile.close();
        }
        catch(Exception ex)
        {
            System.out.println("File not found");
        }
    }*/
}
