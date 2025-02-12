package Electricity;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.border.Border;

public class About extends JFrame implements ActionListener {

    JButton b1;
    JLabel l1;
    Font f, f1, f2;
    TextArea t1;
    String s;

    public About(){
        setLayout(null);
        JButton b1 = new JButton("Exit");
        add(b1);
        b1.setBounds(180, 430,120, 20);
        b1.addActionListener(this);


        Font f = new Font("RALEWAY", Font.BOLD, 180);
        setFont(f);

        s = "                        About Project                     " +
                "\nElectricity Billing System is a Software that is designed "
                +" \ndeal with all the calculations and regulations involving"
              + " \n electricty. This includes purchases of units, display of " +
                "\n remaining amount and also the taxations necessary in the " +
                "\npurhcases made";


        l1.setBounds(170, 10, 180, 80);
        l1.setForeground(Color.red);

        Font f2 = new Font("RALEWAY", Font.BOLD, 20);
        l1.setFont(f2);

        setBounds(700, 220, 500, 550);

        setLayout(null);
        setVisible(true);

    }
    public void actionPerformed(ActionEvent e){
        dispose();
    }

    public static void main(String args[]){
        new About().setVisible(true);
    }
}
