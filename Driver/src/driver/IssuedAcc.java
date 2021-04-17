/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package driver;
import java.util.*;
public class IssuedAcc {
    private String ItemName;
    private String Quantity;
    private String Company;
    public static ArrayList <IssuedAcc> issueAcc = new ArrayList<IssuedAcc>();
       /**
     * Setter for Item Name. This sets ItemName.
     * @param itemName
     */
    public void setItemName(String itemName) {
        this.ItemName = itemName;
    }

    /**
     * Getter for ItemName. It is used to return ItemName.
     * @return ItemName
     */

    public String getItemName() {
        return this.ItemName;
    }

    /**
     * Setter for quantity. This sets Item's quantity.
     * @param quantity
     */
    public void setQuantity(String quantity) {
        this.Quantity = quantity;
    }

    /**
     * Getter for quantity. It is used to return Item's quantity.
     * @return Quantity
     */

    public String getQuantity() {
        return this.Quantity;
    }

    /**
     * Setter for Company. This sets item's company.
     * @param company
     */
    public void setCompany(String company) {
        this.Company = company;
    }

    /**
     * Getter for Company. It is used to return Item's Company.
     *
     * @return Company
     */

    public String getCompany() {
        return this.Company;
    }
}
