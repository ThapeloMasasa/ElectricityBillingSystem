package Electricity;

import javax.swing.*;
import java.awt.*;

public class LastBill {
    TextArea t1  = new TextArea(s, 10, 40, Scrollbar.VERTICAL);
        t1.setEditable(false);
        t1.setBounds(20, 100, 450, 300);
    add(t1);

    Font f1 = new Font("RALEWAY", Font.BOLD, 16);
        t1.setFont(f1);

    Container contentPane = this.getContentPane();
    t1 = new TextArea();

    JLabel l1 = new JLabel("About Projects");
    add(l1);
}
