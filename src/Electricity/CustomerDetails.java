package Electricity;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class CustomerDetails extends JFrame implements ActionListener {
    JTable t1;
    JButton b1;
    String x[] = {"Customer Name", "Meter Number", "Address", "City", "State", "Email", "Phone"};
    String y[][] = new String[40][8];
    int i=0, j=0;

    CustomerDetails(){
        super("Customer Details");
        setSize(1200, 650);
        setLocation(400, 150);

        try{
            Conn c1 = new Conn();
            String s1 = "select * from customer";
            ResultSet  rs = c1.s.executeQuery(s1);
            while(rs.next()){
                y[i][j++] = rs.getString("name");
                y[i][j++] = rs.getString("meter");
                y[i][j++] = rs.getString("address");
                y[i][j++] = rs.getString("name");
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }


}
