package Electricity;

import java.sql.*;
public class Conn {
    Connection c;
    Statement s;
    public Conn(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql:///ebs", "root", "=Mac56305375$");
            s =c.createStatement();
        }catch(Exception e){
            System.out.println(e);

        }
    }
}
