package bank.management.system;
import java.sql.*;
//Conn is a custom class (not shown here) that establishes a database connection.
public class Conn {
    
    Connection c;
    Statement s;
    public Conn(){
        try{          
            c = DriverManager.getConnection("jdbc:mysql:///bankmanagementsystem","root","Prachi@123");
            s = c.createStatement();       
        }catch(Exception e){
            System.out.println(e);
        }
    }
    
}
