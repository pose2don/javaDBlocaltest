package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBConnection {
    private Connection con;
    private Statement st;
    private ResultSet rs;

    public DBConnection() {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/BoardCar","user1","1");
            st = con.createStatement();
        }

        catch (Exception e)
        {
            System.out.println("error : " + e.getMessage());
        }
    }

    public boolean isUser(String UserID, String UserPW){
        try
        {
            String SQL = "SELECT * FROM MemberInfo WHERE ID = '" + UserID + "' and PW = '" + UserPW +"'";
            rs = st.executeQuery(SQL);
            if(rs.next())
            {
                return true;
            }
        }
        catch (Exception e)
        {
            System.out.println("error : " + e.getMessage());
        }

        return false;
    }

}
