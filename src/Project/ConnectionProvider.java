package Project;
import java.sql.*;
public class ConnectionProvider 
{
static Connection con;
public static Connection getcon()
{
try
{
Class.forName("com.mysql.cj.jdbc.Driver");
String user = "root";
String pass = "rootpassword1@";
String url = "jdbc:mysql://localhost:3306/bms";
con = DriverManager.getConnection(url,user,pass);
return con;
}
catch(Exception e)
{
return null;
}

}    

    public static Connection getCon() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
