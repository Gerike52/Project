package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Game {
    public static void main(String[] args) {
        Gamex();
}

    public static void Gamex() {
        JFrame frame = new JFrame();
        frame.setSize(1300, 800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setVisible(true);

        JButton buttonv = new JButton();
        buttonv.setBounds(1085,697,200,65);
        buttonv.setText("Vissza");
        buttonv.setFocusable(false);
        buttonv.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0 ) {
                frame.setVisible(false);
                Main w = new Main();
                w.showWindow();
            }
        });
        frame.add(buttonv);
    }

}
