package driver;

public class Validation {

    // Validation Methods
    /**
     * Validation for Manager's loginID.
     * Format of manager's loginID is Manager-XX, where X = 0 to 9
     * @param ID
     * @return flag
     */
    static boolean MloginID(String ID) {
        boolean flag = false;
        int length = ID.length();
        if (length == 10) {
            if (ID.charAt(0) == 'M' && ID.charAt(1) == 'a') {
                if (ID.charAt(2) == 'n' && ID.charAt(3) == 'a') {
                    if (ID.charAt(4) == 'g' && ID.charAt(5) == 'e') {
                        if (ID.charAt(6) == 'r' && ID.charAt(7) == '-') {
                            if (ID.charAt(8) >= '0' && ID.charAt(8) <= '9') {
                                if (ID.charAt(9) >= '0' && ID.charAt(9) <= '9') {
                                    flag = true;
                                } else {
                                    flag = false;
                                }
                            }
                        }
                    }
                }
            }
        }
        return flag;
    }

    /**
     * Validation for Manager's password.
     * Manager's password must consist on 8 digits. It can be alphabets, numeric digits or alphanumeric characters.
     * @param password
     * @return flag
     */
    static boolean password(String password) {
        boolean flag = false;
        int length = password.length();
        if (length == 8) {
            for (int i = 0; i < length; i++) {
                if (password.charAt(i) >= 'A' && password.charAt(i) <= 'Z' || password.charAt(i) >= 'a' && password.charAt(i) <= 'z' || password.charAt(i) >= '0' && password.charAt(i) <= '9') {
                    flag = true;
                } else {
                    flag = false;
                    break;
                }
            }
        }
        return flag;
    }

    /**
     * Validation for Employee's loginID.
     * Format of employee's loginID is EMP-X where X = 0 to 9
     * @param ID
     * @return flag
     */
    static boolean EloginID(String ID) {
        boolean flag = false;
        int length = ID.length();
        if (length == 6) {
            if (ID.charAt(0) == 'E' && ID.charAt(1) == 'M') {
                if (ID.charAt(2) == 'P' && ID.charAt(3) == '-') {
                    if (ID.charAt(4) >= '0' && ID.charAt(4) <= '9') {
                        if (ID.charAt(5) >= '0' && ID.charAt(5) <= '9') {
                            flag = true;
                        } else {
                            flag = false;
                        }
                    }
                }
            }
        }
        return flag;
    }

    /**
     * Validation for employee's Contact number.
     * Length of contact number must be 11. Contact Number must be in integers.
     * @param contactNo
     * @return flag
     */
    static boolean contactNo(String contactNo) {
        boolean flag = false;
        int length = contactNo.length();
        if (length == 11) {
            for (int i = 0; i < length; i++) {
                if (contactNo.charAt(i) >= '0' && contactNo.charAt(i) <= '9') {
                    flag = true;
                } else {
                    flag = false;
                    break;
                }
            }
        }
        return flag;
    }

    /**
     * Validation for Employee's department.
     * Department name should consist of only alphabets.
     * @param department
     * @return flag
     */
    static boolean department(String department) {
        boolean flag = true;
        for (int i = 0; i < department.length(); i++) {
            if (!(department.charAt(i) >= 'A' && department.charAt(i) <= 'Z' || department.charAt(i) >= 'a' && department.charAt(i) <= 'z')) {
                flag = false;
                break;
            } else {
                flag = true;
            }
        }
        return flag;
    }
    
    /**
     * Validation for Employee's rank.
     * Item name should consist of only alphabets.
     * @param ItemName
     * @return flag
     */
    static boolean rank(String rank) {
        boolean flag = true;
        for (int i = 0; i < rank.length(); i++) {
            if (!(rank.charAt(i) >= 'A' && rank.charAt(i) <= 'Z' || rank.charAt(i) >= 'a' && rank.charAt(i) <= 'z')) {
                flag = false;
                break;
            } else {
                flag = true;
            }
        }
        return flag;
    }

    /**
     * Validation for Item Name. 
     * Item name should consist of only alphabets.
     * @param ItemName
     * @return flag
     */
    static boolean itemName(String ItemName) {
        boolean flag = true;
        for (int i = 0; i < ItemName.length(); i++) {
            if (!(ItemName.charAt(i) >= 'A' && ItemName.charAt(i) <= 'Z' || ItemName.charAt(i) >= 'a' && ItemName.charAt(i) <= 'z')) {
                flag = false;
                break;
            } else {
                flag = true;
            }
        }
        return flag;
    }

    /**
     * Validation for Item's quantity. 
     * Quantity should consist of only numeric digits.
     * @param Quantity
     * @return flag
     */
    static boolean quantity(String Quantity) {
        boolean flag = false;
        int length = Quantity.length();
        if (length == 1 || length == 2) {
            for (int i = 0; i < length; i++) {
                if (Quantity.charAt(i) >= '0' && Quantity.charAt(i) <= '9') {
                    flag = true;
                } else {
                    flag = false;
                    break;
                }
            }
        }
        return flag;
    }

    /**
     * Validation for Item's company.
     * Company should consist of only alphabets. 
     * @param Company
     * @return flag
     */
    static boolean company(String Company) {
        boolean flag = true;
        for (int i = 0; i < Company.length(); i++) {
            if (!(Company.charAt(i) >= 'A' && Company.charAt(i) <= 'Z' || Company.charAt(i) >= 'a' && Company.charAt(i) <= 'z')) {
                flag = false;
                break;
            } else {
                flag = true;
            }
        }
        return flag;
    }
}
