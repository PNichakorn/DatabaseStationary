import java.sql.*;
public class Connect {
        public static Connection ConnectDB(){
            try{
               Class.forName("com.mysql.jdbc.Driver");
               String url = "jdbc:mysql://localhost/datastationary";
               Connection con = DriverManager.getConnection(url,"root","1234");
               return con;
            } catch(Exception e){
                e.printStackTrace();
            }
            return null;
         }  
}
  

