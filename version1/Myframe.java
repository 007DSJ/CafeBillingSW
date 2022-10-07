import javax.swing.*;
import javax.swing.plaf.FontUIResource;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Myframe extends JFrame implements ActionListener
{
    JFrame f =new JFrame();
    JLabel l;
    JButton b1,b2;
    JTextField t1,t2,t3;
    JRadioButton r1,r2;
    JComboBox cb1,cb2;
    JCheckBox che1,che2;
    JSpinner sp1,sp2;
    
    int x=0;
    static int a=20;
    Myframe()
    {
      
         l =new JLabel();
         t1=new JTextField();
         t2=new JTextField();
         t3=new JTextField();
         b1=new JButton();
         r1=new JRadioButton("Male");
         r2=new JRadioButton("Female");
         che1=new JCheckBox("Takeaway");
         che2=new JCheckBox("Delivery");


        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(new Dimension(500,500));
        this.setTitle("Billing System");
        this.setLayout(null);
        this.setResizable(false);
        
        l.setText("Billing Program");
        l.setBounds(200, 20, 150, 20);
        l.setVerticalTextPosition(JLabel.TOP);

       b1.setText("Get Bill");
       b1.setBounds(189, 400, 100, 50);
       b1.addActionListener(this);
       
        t1.setBounds(50, 100, 150,20);
        t1.setText("Enter Your Full Name");
        t1.setVisible(true);

        t2.setBounds(50, 150, 150,50);
        t2.setText("Enter Your Full Address");
        t2.setVisible(true);

        SpinnerModel spm1=new SpinnerNumberModel(0,0,10,1);
        sp1=new JSpinner(spm1);
        sp1.setBounds(155, 250, 40,40);
        
        SpinnerModel spm2=new SpinnerNumberModel(0,0,10,1);
        sp2=new JSpinner(spm2);
        sp2.setBounds(325, 250, 40,40);

        ButtonGroup group=new ButtonGroup();
        group.add(r1);
        group.add(r2);

        r1.setBounds(50, 200, 100, 50);
        r2.setBounds(150, 200, 100, 50);
        
        che1.setBounds(50, 300, 100, 50);
        che1.setFocusable(false);

        che2.setBounds(150, 300, 100, 50);
        che2.setFocusable(false);

        String[] food1={"None","Veg Burger","Chicken Burger"};
        cb1=new JComboBox<>(food1);
        cb1.setBounds(50, 250, 100, 50);

        String[] food2={"None","Veg Meal","Chicken Meal"};
        cb2=new JComboBox<>(food2);
        cb2.setBounds(220, 250, 100, 50);

        this.add(b1);
        this.add(t1);
        this.add(t2);
        this.add(l);
        this.add(r1);
        this.add(r2);
        this.add(cb1);
        this.add(cb2);
        this.add(che1);
        this.add(che2);
        this.add(sp1);
        this.add(sp2);
        this.setVisible(true);

               
     
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
       if(e.getSource()==b1)
       {
        
         a=a+1;
         String[] z=new String[10];
         z[0]=t1.getText();

         Integer d=0,d1=0,d2=0;
         Integer s=(Integer)sp1.getValue();
         Integer s1=(Integer)sp2.getValue();
        
         int s2=cb1.getSelectedIndex();
           {  
              if(s2==0)
               d1=0;
                
              if(s2==1) 
                {
                  d1+=72;
                  d1=d1*s;
                }  
              if(s2==2) 
                {
                  d1+=98;
                  d1=d1*s;
                }
           } 
           

           int s3=cb2.getSelectedIndex();
           {
            if(s3==0)
             d2=0;
               
           if(s3==1) 
            {
              d2+=102;
              d2=d2*s1;
            }   
             
           if(s3==2) 
             { 
              d2+=148;
              d2=d2*s1;
             }
              
           }
           d=d1+d2;
           System.out.println(s+" "+s1+" "+s2+" "+s3);
           z[1]=t2.getText();
         new SubFrame(z,d,a);
       }
      }

  }

