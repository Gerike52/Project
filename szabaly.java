package com.company;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class szabaly {
    public static void main(String[] args) {
        szabaly();
    }

    public static void szabaly() {
        JFrame frame = new JFrame();
        frame.setSize(800, 800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setVisible(true);

        JButton button1 = new JButton();
        button1.setSize(150,100);
        button1.setText("Vissza");
        button1.setFocusable(false);
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0 ) {
                frame.setVisible(false);
                Main w = new Main();
                w.showWindow();
            }
        });
        frame.add(button1);
    }
}