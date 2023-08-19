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
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.sound.midi.MidiDevice;
import javax.swing.*;
import static javax.swing.JOptionPane.showMessageDialog;


/**
 *
 * @author mrezk
 */

public class Registeration extends JFrame {
    JPanel mainPanel= new JPanel();
    JTextField t1 = new JTextField();
    JTextField t2 = new JTextField();
    JTextField t3 = new JTextField();
    JTextField t4 = new JTextField();
    JTextField t5 = new JTextField();
    JTextField t6 = new JTextField();
    JLabel p1 = new JLabel("First name");
    JLabel p2 = new JLabel("Last name");
    JLabel p3 = new JLabel("Password");
    JLabel p4 = new JLabel("Address");
    JLabel p5 = new JLabel("E-mail");
    JLabel p6 = new JLabel("Phone");
    JRadioButton b = new JRadioButton("Male");
    JRadioButton b1 = new JRadioButton("Female");
    ButtonGroup g = new ButtonGroup();
    JButton b5 = new JButton("Submit");
        Color c = new Color(51,153,255);
        
        public static personInfo[] infoP = new personInfo[100];
        static int counter = 0;
        
       public Registeration(){
           
        mainPanel.setBackground(c);
        this.setTitle("Registeration");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setSize(800,800);
        this.setResizable(false);
        this.add(mainPanel);
        mainPanel.setLayout(null);
        p1.setFont(p1.getFont().deriveFont(19.0f));
        p2.setFont(p2.getFont().deriveFont(19.0f));
        p3.setFont(p3.getFont().deriveFont(19.0f));
        p4.setFont(p4.getFont().deriveFont(19.0f));
        p5.setFont(p5.getFont().deriveFont(19.0f));
        p6.setFont(p6.getFont().deriveFont(19.0f));
        b.setFont(b.getFont().deriveFont(17.0f));
        b1.setFont(b1.getFont().deriveFont(17.0f));
        b5.setFont(b1.getFont().deriveFont(18.0f));
       p1.setBounds(40,0,100,100);
        t1.setBounds(160,35,210,33);
        p2.setBounds(420,0,100,100);
        t2.setBounds(530,35,210,33);
       p3.setBounds(40,100,100,100);
        t3.setBounds(160,135,210,33);
        
        p4.setBounds(420,100,100,100);
        t4.setBounds(530,135,210,33);
        
       p5.setBounds(40,200,100,100);
        t5.setBounds(160,235,210,33);
        
        p6.setBounds(420,200,100,100);
        t6.setBounds(530,235,210,33);
       
        b.setBounds(280,335,100,100);
        b1.setBounds(420,335,100,103);
        b5.setBounds(335,470,130,50);
        b.setBackground(c);
        b1.setBackground(c);
        p2.setForeground(Color.white);
        p1.setForeground(Color.white);
        p3.setForeground(Color.white);
        p4.setForeground(Color.white);
        p5.setForeground(Color.white);
        p6.setForeground(Color.white);
        b.setForeground(Color.white);
        b1.setForeground(Color.white);
        g.add(b);
        g.add(b1);
        mainPanel.add(p1);
        mainPanel.add(t1);
        mainPanel.add(p2);
        mainPanel.add(t2);
        mainPanel.add(p3);
        mainPanel.add(t3);
        mainPanel.add(p4);
        mainPanel.add(t4);
        mainPanel.add(p5);
        mainPanel.add(t5);
        mainPanel.add(p6);
        mainPanel.add(t6);
        mainPanel.add(b);
        mainPanel.add(b1);
        mainPanel.add(b5);
        
         b5.addActionListener(new ActionListener (){
            @Override
            public void actionPerformed(ActionEvent e) {
            if(t1.getText().isEmpty() || t2.getText().isEmpty() || t3.getText().isEmpty() || t4.getText().isEmpty() || t5.getText().isEmpty() || t6.getText().isEmpty())
            {
                showMessageDialog(null, "Please enter all required data.");
            }
            else
            {
                
            
                infoP[counter] = new personInfo();
                infoP[counter].fname =  t1.getText();
                infoP[counter].lname =  t2.getText();
                infoP[counter].password =  t3.getText();
                infoP[counter].email =  t5.getText();
                infoP[counter].address =  t4.getText();
                infoP[counter].phone =  t6.getText();   
                counter++;
                close();
                Login log = new Login();
            }
            }
             
         });
       }    
       public void close()
       {
           setVisible(false);
       }
}
