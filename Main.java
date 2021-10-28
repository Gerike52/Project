package com.company;

import javax.swing.*;
import java.awt.*;



class GUIx {



    public GUIx (){

        JLabel label =new JLabel();
        label.setText("Rülett főmenü");

        JButton button1 = new JButton();
        button1.setSize(150,100);
        button1.setText("Játék");
        button1.setFocusable(false);

        JButton button2 = new JButton();
        button2.setSize(150,100);
        button2.setText("Játék Szabályzat");
        button2.setFocusable(false);

        JButton button3 = new JButton();
        button3.setSize(150,100);
        button3.setText("Kilépés"); //彼は死んだが生き残った
        button3.setFocusable(false);
        button3.addActionListener(e -> System.exit(0));

        JPanel panel=new JPanel();
        panel.setVisible(true);
        panel.setLayout(new GridLayout(3,1,10,50));
        panel.setPreferredSize(new Dimension(250,150));
        panel.add(button1);
        panel.add(button2);
        panel.add(button3);

        JPanel fpanel =new JPanel();
        fpanel.setVisible(true);
        fpanel.setPreferredSize(new Dimension(100,100));
        fpanel.add(label);

        JPanel lpanel =new JPanel();
        lpanel.setVisible(true);
        lpanel.setPreferredSize(new Dimension(100,100));

        JFrame frame= new JFrame();
        frame.setSize(700,600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setTitle("Rulett");
        frame.setVisible(true);
        frame.add(panel,BorderLayout.WEST);
        frame.add(fpanel,BorderLayout.NORTH);
        frame.add(lpanel,BorderLayout.SOUTH);
    }
}




public class Main {
    public static void main(String[] args) {
        new GUIx();


    }
}