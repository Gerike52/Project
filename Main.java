package com.company;
import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*class GUIx {



    public GUIx (){

        JLabel label =new JLabel();
        label.setText("Rulett főmenü");

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



*/

public class Main {
    public static void main(String[] args) {
         //LaunchPage LaunchPage = new LaunchPage();
         showWindow();

    }
public static void showWindow(){
    JFrame frame= new JFrame();
    frame.setSize(500,450);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setLayout(null);
    frame.setVisible(true);


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
