package Electricity;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
public class NewCustomer  extends JFrame implements ActionListener{
    JLabel l1, l2, l3, l4, l5, l6, l7, l8, l11;
    JTextField t1, t2, t3, t4, t5, t6, t7;
    JButton b1, b2;

    NewCustomer(){
        setLocation(600, 200);
        setSize(700, 500);

        JPanel p = new JPanel();
        p.setLayout(null);
        p.setBackground(Color.white);
        p.setBackground(new color(173, 216, 230));

        JLabel title = new JLabel("New Customer");
        title.setBounds(180,10,200,261);
        title.setFont(new Font("Tahoma"));
    }
}
