import java.awt.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.swing.*;

public class SubFrame extends JFrame {

     DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
     LocalDateTime now = LocalDateTime.now();

     SubFrame(String[] s, Integer d, int order) {

          JFrame a = new JFrame();
          JLabel l1 = new JLabel();
          JLabel l2 = new JLabel();
          JLabel l3 = new JLabel();
          JLabel l4 = new JLabel();
          JLabel l5 = new JLabel();
          JLabel l6 = new JLabel();
          JLabel l7 = new JLabel();

          a.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
          a.setSize(600, 600);
          a.setLayout(null);
          a.setVisible(true);

          l1.setText("Generated Bill");
          l1.setBounds(250, 1, 100, 20);

          l2.setText("Order No : " + order);
          l2.setBounds(250, 27, 300, 20);

          l3.setText("Customer Name : " + s[0]);
          l3.setBounds(50, 99, 300, 20);

          l4.setText("Address : " + s[1]);
          l4.setBounds(50, 149, 300, 20);

          l5.setText("Payment Amount : " + d);
          l5.setBounds(50, 199, 300, 20);

          l6.setText("Date : " + dtf.format(now));
          l6.setBounds(50, 249, 300, 20);

          l7.setText("Meal :" + s[2]+" x"+s[4] + " ,\n" + s[3]+" x"+s[5]);
          l7.setBounds(50, 299, 300 ,20);

          a.add(l1);
          a.add(l2);
          a.add(l3);
          a.add(l4);
          a.add(l5);
          a.add(l6);
          a.add(l7);

     }
}
