package driver;

public class Employee {

    private String LoginID;
    private String ContactNo;
    private String Department;
    //String ItemCode;
    

    /**
     * Setter for loginID. This sets employee loginID.
     * @param loginID
     */
    public void setLoginID(String loginID) {
        this.LoginID = loginID;
    }

    /**
     * Getter for loginID. It is used to return employee's loginID.
     * @return loginID
     */
    public String getLoginID() {
        return this.LoginID;
    }

    /**
     * Setter for employee's contact number. This sets employee's contact
     * number.
     * @param contactNo
     */
    public void setContactNo(String contactNo) {
        this.ContactNo = contactNo;
    }

    /**
     * Getter for contact number. It is used to return employee's contact
     * number.
     * @return ContactNo
     */
    public String getContactNo() {
        return this.ContactNo;
    }

    /**
     * Setter for department. This sets employee's department.
     * @param department
     */
    public void setDepartment(String department) {
        this.Department = department;
    }

    /**
     * Getter for department. It is used to return employee's department.
     * @return department
     */
    public String getDepartment() {
        return this.Department;
    }

}
