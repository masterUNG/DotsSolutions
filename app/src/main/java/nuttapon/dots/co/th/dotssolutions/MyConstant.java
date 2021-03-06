package nuttapon.dots.co.th.dotssolutions;

public class MyConstant {

//    URL
    private String urlGetUserWhereCustID = "https://www.dots.co.th/App/getUserWherePhone.php";
    private String urlGetBalanceAWhereCustIDAnIsCancel = "https://www.dots.co.th/App/getBalanceAWhereCustID_iscancel.php";

    private int[] iconInts = new int[]{
            R.drawable.ic_action_dash,
            R.drawable.ic_action_package,
            R.drawable.ic_action_ebill,
            R.drawable.ic_action_billcycler,
            R.drawable.ic_action_service,
            R.drawable.ic_action_exit
    };



    //  Array
    private String[] titleMenuStrings = new String[]{
            "Dash Board",
            "Package",
            "eBil",
            "Billing Cycle",
            "Service",
            "Exit"
    };

    private String[] columnTcust = new String[]{
            "CustID",
            "Fname",
            "Lname",
            "Mobile",
            "CustStatusName",
            "CustStatusSubName"
    };






//    Getter


    public String getUrlGetBalanceAWhereCustIDAnIsCancel() {
        return urlGetBalanceAWhereCustIDAnIsCancel;
    }

    public int[] getIconInts() {
        return iconInts;
    }

    public String[] getTitleMenuStrings() {
        return titleMenuStrings;
    }

    public String[] getColumnTcust() {
        return columnTcust;
    }

    public String getUrlGetUserWhereCustID() {
        return urlGetUserWhereCustID;
    }
}// Main Class
