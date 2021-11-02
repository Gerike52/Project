package com.company;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
         showWindow();

    }
public static void showWindow(){
    JFrame frame= new JFrame();
    frame.setSize(500,450);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setLayout(null);
    frame.setVisible(true);
    frame.getContentPane().setBackground(Color.green);           //<----Vissza, nem jó!


    JButton button1 = new JButton();
    button1.setBounds(0,100,200,75);
    button1.setText("Játék");
    button1.setFocusable(false);
    button1.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent arg0 ) {
            frame.setVisible(false);
            Game w3 = new Game();
            w3.Gamex();
            }
        }
    );

    JButton button2 = new JButton();
    button2.setBounds(0,215,200,75);
    button2.setText("Szabályzat");
    button2.setFocusable(false);
    button2.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent arg0 ) {
                frame.setVisible(false);
                szabaly w2 = new szabaly();
                w2.szabaly();
                }
            }
        );


    JButton button3 = new JButton();
    button3.setBounds(0,325,200,75);
    button3.setText("Kilépés"); //彼は死んだが生き残った
    button3.setFocusable(false);
    button3.addActionListener(e -> System.exit(0));

    frame.add(button1);
    frame.add(button2);
    frame.add(button3);

}

}
