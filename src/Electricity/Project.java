package Electricity;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Project extends JFrame implements ActionListener {
    String meter;
    Project(String meter, String person){
        super("Electricity Billing System");
        this.meter = meter;

        setSize(1920, 1030);
        /* adding the background Image */
        ImageIcon ic = new ImageIcon(ClassLoader.getSystemResource("icon/elect1.jpg"));
        Image i3 =  ic.getImage().getScaledInstance(1900, 950, Image.SCALE_DEFAULT);
        ImageIcon icc3 = new ImageIcon(i3);
        JLabel l1 = new JLabel(icc3);
        add(l1);
        /* First Column*/
        JMenuBar mb  = new JMenuBar();
        JMenu master = new JMenu("Master");
        JMenuItem m1 = new JMenuItem("New Customer");
        JMenuItem m2 = new JMenuItem("Customer Details");
        JMenuItem m3 = new JMenuItem("Deposit Details");
        JMenuItem m4 = new JMenuItem("Calculate Bill");
        master.setForeground(Color.BLUE);

        /* ---------Customer Details--------*/
        m1.setFont(new Font("monospaced", Font.PLAIN, 12));
        ImageIcon icon1 = new ImageIcon(ClassLoader.getSystemResource("icon/icon1.png"));
        Image image1 = icon1.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);

        m1.setIcon(new ImageIcon(image1));
        m1.setMnemonic('D');
        m1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D, ActionEvent.CTRL_MASK));
        m1.setBackground(Color.WHITE);

        /* ---------Meter Details-------*/

        m2.setFont(new Font("monospaced", Font.PLAIN, 12));
        ImageIcon icon2 = new ImageIcon(ClassLoader.getSystemResource("icon/icon2.png"));
        Image image2 = icon2.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
        m2.setIcon(new ImageIcon(image2));
        m2.setMnemonic('M');
        m2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_M, ActionEvent.CTRL_MASK));
        m2.setBackground(Color.WHITE);


        /* ---------Deposit Details--------*/
        m3.setFont(new Font("monospaced", Font.PLAIN, 12));
        ImageIcon icon3 = new ImageIcon(ClassLoader.getSystemResource("icon/icon3.png"));
        Image image3 = icon3.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
        m3.setIcon(new ImageIcon(image3));
        m3.setMnemonic('N');
        m3.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_M, ActionEvent.CTRL_MASK));
        m3.setBackground(Color.WHITE);

        m4.setFont(new Font("monospaced", Font.PLAIN, 12));
        ImageIcon icon5 = new ImageIcon(ClassLoader.getSystemResource("icon/icon5.png"));
        Image image5 = icon5.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
        m4.setIcon(new ImageIcon(image5));
        m4.setMnemonic('B');
        m4.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_M, ActionEvent.CTRL_MASK));
        m4.setBackground(Color.WHITE);


        m1.addActionListener(this);
        m2.addActionListener(this);
        m3.addActionListener(this);
        m4.addActionListener(this);



        /*--------------------------*/

        /*-----------Second Column---------------*/
        JMenu info = new JMenu("Information");
        JMenuItem info1 = new JMenuItem("Update Information");
        JMenuItem info2 = new JMenuItem("View Information");

        info.setForeground(Color.RED);

        /*------------Pay Bill--------------*/
        info1.setFont(new Font("monospaced", Font.PLAIN, 12));
        ImageIcon icon41 = new ImageIcon(ClassLoader.getSystemResource("icon/icon4.png"));
        Image image41 = icon41.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
        info1.setIcon(new ImageIcon(image41));
        info1.setMnemonic('P');
        info1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_M, ActionEvent.CTRL_MASK));
        info1.setBackground(Color.WHITE);

        /*------------Last Bill--------------*/
        info2.setFont(new Font("monospaced", Font.PLAIN, 12));
        ImageIcon icon42 = new ImageIcon(ClassLoader.getSystemResource("icon/icon6.png"));
        Image image42 = icon42.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
        info2.setIcon(new ImageIcon(image42));
        info2.setMnemonic('L');
        info2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_M, ActionEvent.CTRL_MASK));
        info2.setBackground(Color.WHITE);

        info1.addActionListener(this);
        info2.addActionListener(this);




        /*-----------*/

        JMenu user = new JMenu("User");
        JMenuItem u1 = new JMenuItem("Pay Bill");

        JMenuItem u3 = new JMenuItem("Bill Details");
        user.setForeground(Color.RED);

        /*-----Pay Bill------*/
        u1.setFont(new Font("monospaced", Font.PLAIN, 12));
        ImageIcon icon4 = new ImageIcon(ClassLoader.getSystemResource("icon/icon4.png"));
        Image image4 = icon4.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
        u1.setIcon(new ImageIcon(image4));
        u1.setMnemonic('P');
        u1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_M, ActionEvent.CTRL_MASK));
        u1.setBackground(Color.WHITE);

        /*-----Last Bill------*/
        u3.setFont(new Font("monospaced", Font.PLAIN, 12));
        ImageIcon icon6 = new ImageIcon(ClassLoader.getSystemResource("icon/icon6.png"));
        Image image6 = icon6.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
        u3.setIcon(new ImageIcon(image6));
        u3.setMnemonic('L');
        u3.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_M, ActionEvent.CTRL_MASK));
        u3.setBackground(Color.WHITE);


        u1.addActionListener(this);
        u3.addActionListener(this);


        /*-----Third Column------*/
        JMenu report = new JMenu("Report");
        JMenuItem r1 = new JMenuItem("Generate Bill");
        report.setForeground(Color.BLUE);

        /*-----Report------*/
        r1.setFont(new Font("monospaced", Font.PLAIN, 12));
        ImageIcon icon7 = new ImageIcon(ClassLoader.getSystemResource("icon/icon7.png"));
        Image image7 = icon6.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
        r1.setIcon(new ImageIcon(image7));
        r1.setMnemonic('R');
        r1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_M, ActionEvent.CTRL_MASK));
        r1.setBackground(Color.WHITE);

        r1.addActionListener(this);


        /*-----Fourth Column----*/
        JMenu utility = new JMenu("Utility");
        JMenuItem ut1 = new JMenuItem("Notepad");
        JMenuItem ut2 = new JMenuItem("Calculator");
        JMenuItem ut3 = new JMenuItem("Web Browser");


















    }
}
