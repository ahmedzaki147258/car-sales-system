/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import static javax.swing.JOptionPane.showMessageDialog;


/**
 *
 * @author mrezk
 */
public class Login extends JFrame {
    JFrame viewframe = new JFrame();
    JTextField t1 = new JTextField();
    JPasswordField t2 = new JPasswordField();
    JPanel mainPanel = new JPanel();
    JLabel l1 = new JLabel("Email");
    JLabel l2 = new JLabel("Password");
    JButton b1 = new JButton("Login");
    JButton b2 = new JButton("Register");
    Color c = new Color(51,153,255);
    Border b = new LineBorder(Color.white,1,true);
   public Login()
    {
        this.setTitle("Login");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setSize(800,800);
        this.add(mainPanel);
        this.setResizable(false);
        mainPanel.setLayout(null);
        mainPanel.setBackground(c);
        b1.setBackground(c);
        b1.setForeground(Color.white);
        b2.setBackground(c);
       
        b2.setForeground(Color.white);
        l1.setForeground(Color.white);
        l2.setForeground(Color.white);
        l1.setBounds(190, 123, 100, 100);
        t1.setBounds(360,160,210,33);
        l2.setBounds(190, 215, 100, 100);
        t2.setBounds(360,250,210,33);
        l1.setFont(l1.getFont().deriveFont(19.0f));
        l2.setFont(l1.getFont().deriveFont(19.0f));
        b1.setFont(b1.getFont().deriveFont(16.0f));
        b2.setFont(b2.getFont().deriveFont(16.0f));
        b1.setBounds(300,328,150,40);
        b2.setBounds(300,378,150,40);
        b1.setBorder(b);
        b2.setBorder(b);
        mainPanel.add(l1);
        mainPanel.add(t1);    
        mainPanel.add(l2);
        mainPanel.add(t2);  
        mainPanel.add(b1);
        mainPanel.add(b2);
        
            b1.addActionListener(new ActionListener (){
            @Override
            public void actionPerformed(ActionEvent e) {
                //System.out.println(t1.getText());
                int j = 0;
                if(t1.getText().equals("admin") && t2.getText().equals("admin"))
                {
                    close();
                    Admin admin = new Admin();
                    admin.mainAdmin();
                }
                
                else
                {
                   for(int i = 0 ; i < Registeration.counter ; i++)
                   {
                       if( Registeration.infoP[i].email.equals(t1.getText()) &&  Registeration.infoP[i].password.equals(t2.getText()))
                       {
                           j = 1;
                           close();
                           user user = new user();
                           
                           break;
                       }
                   }

                   if(j!=1)
                   {
                       showMessageDialog(null, "Enter a valid data");
                   }
               }
            }
             
         });
            
            
            b2.addActionListener(new ActionListener (){
            @Override
            public void actionPerformed(ActionEvent e) {
                close();
                Registeration h = new Registeration();

            }
             
         });
            
    }
   
   public void close()
   {
       setVisible(false);
   }
}
