package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;


public class Game {
    static Integer n;
    static Integer f=0;
    static Integer osszeg=1500;

    public static void main(String[] args) {
        Gamex();
}

    public static void Gamex() {

        JFrame frame = new JFrame();
        frame.setSize(1300, 800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.getContentPane().setBackground(Color.green);

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

        /*------------------------------Asztal------------------------------*/


        ArrayList<Integer> v =new ArrayList<Integer>();
        ArrayList<Integer> t =new ArrayList<Integer>();
        ArrayList<Integer> p = new ArrayList<Integer>();

        t.add(10);

        JButton g1 = new JButton();
        g1.setBounds(1000,155,50,50);
        g1.setText("1");
        g1.setBackground(Color.BLACK);
        g1.setForeground(Color.WHITE);
        g1.setFocusable(false);
        g1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e ) {
                    if(e.getSource()== g1) {
                        osszeg=osszeg-t.get(0);
                        v.add(1);
                        g1.setEnabled(false);
                    }
            }
        });

        JButton g2 = new JButton();
        g2.setBounds(1055,155,50,50);
        g2.setText("2");
        g2.setBackground(Color.RED);
        g2.setForeground(Color.WHITE);
        g2.setFocusable(false);
        g2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e ) {
                if(e.getSource()== g2) {
                    osszeg=osszeg-t.get(0);
                    v.add(2);
                    g2.setEnabled(false);
                }
            }
        });

        JButton g3 = new JButton();
        g3.setBounds(1110,155,50,50);
        g3.setText("3");
        g3.setBackground(Color.BLACK);
        g3.setForeground(Color.WHITE);
        g3.setFocusable(false);
        g3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e ) {
                if(e.getSource()== g3) {
                    osszeg=osszeg-t.get(0);
                    v.add(3);
                    g3.setEnabled(false);
                }
            }
        });

        JButton g4 = new JButton();
        g4.setBounds(1165,155,50,50);
        g4.setText("4");
        g4.setBackground(Color.RED);
        g4.setForeground(Color.WHITE);
        g4.setFocusable(false);
        g4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e ) {
                if(e.getSource()== g4) {
                    osszeg=osszeg-t.get(0);
                    v.add(4);
                    g4.setEnabled(false);
                }
            }
        });

        JButton g5 = new JButton();
        g5.setBounds(1000,210,50,50);
        g5.setText("5");
        g5.setBackground(Color.BLACK);
        g5.setForeground(Color.WHITE);
        g5.setFocusable(false);
        g5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e ) {
                if(e.getSource()== g5) {
                    osszeg=osszeg-t.get(0);
                    v.add(5);
                    g5.setEnabled(false);
                }
            }
        });

        JButton g6 = new JButton();
        g6.setBounds(1055,210,50,50);
        g6.setText("6");
        g6.setBackground(Color.RED);
        g6.setForeground(Color.WHITE);
        g6.setFocusable(false);
        g6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e ) {
                if(e.getSource()== g6) {
                    osszeg=osszeg-t.get(0);
                    v.add(6);
                    g6.setEnabled(false);
                }
            }
        });

        JButton g7 = new JButton();
        g7.setBounds(1110,210,50,50);
        g7.setText("7");
        g7.setBackground(Color.BLACK);
        g7.setForeground(Color.WHITE);
        g7.setFocusable(false);
        g7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e ) {
                if(e.getSource()== g7) {
                    osszeg=osszeg-t.get(0);
                    v.add(7);
                    g7.setEnabled(false);
                }
            }
        });

        JButton g8 = new JButton();
        g8.setBounds(1165,210,50,50);
        g8.setText("8");
        g8.setBackground(Color.RED);
        g8.setForeground(Color.WHITE);
        g8.setFocusable(false);
        g8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e ) {
                if(e.getSource()== g8) {
                    osszeg=osszeg-t.get(0);
                    v.add(8);
                    g8.setEnabled(false);
                }
            }
        });

        JButton g9 = new JButton();
        g9.setBounds(1000,265,50,50);
        g9.setText("9");
        g9.setBackground(Color.BLACK);
        g9.setForeground(Color.WHITE);
        g9.setFocusable(false);
        g9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e ) {
                if(e.getSource()== g9) {
                    osszeg=osszeg-t.get(0);
                    v.add(9);
                    g9.setEnabled(false);
                }
            }
        });

        JButton g10 = new JButton();
        g10.setBounds(1055,265,50,50);
        g10.setText("10");
        g10.setBackground(Color.RED);
        g10.setForeground(Color.WHITE);
        g10.setFocusable(false);
        g10.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e ) {
                if(e.getSource()== g10) {
                    osszeg=osszeg-t.get(0);
                    v.add(10);
                    g10.setEnabled(false);
                }
            }
        });

        JButton g11 = new JButton();
        g11.setBounds(1110,265,50,50);
        g11.setText("11");
        g11.setBackground(Color.BLACK);
        g11.setForeground(Color.WHITE);
        g11.setFocusable(false);
        g11.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e ) {
                if(e.getSource()== g11) {
                    osszeg=osszeg-t.get(0);
                    v.add(11);
                    g11.setEnabled(false);
                }
            }
        });

        JButton g12 = new JButton();
        g12.setBounds(1165,265,50,50);
        g12.setText("12");
        g12.setBackground(Color.RED);
        g12.setForeground(Color.WHITE);
        g12.setFocusable(false);
        g12.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e ) {
                if(e.getSource()== g12) {
                    osszeg=osszeg-t.get(0);
                    v.add(12);
                    g12.setEnabled(false);
                }
            }
        });

        JButton g13 = new JButton();
        g13.setBounds(1000,320,50,50);
        g13.setText("13");
        g13.setBackground(Color.BLACK);
        g13.setForeground(Color.WHITE);
        g13.setFocusable(false);
        g13.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e ) {
                if(e.getSource()== g13) {
                    osszeg=osszeg-t.get(0);
                    v.add(13);
                    g13.setEnabled(false);
                }
            }
        });

        JButton g14 = new JButton();
        g14.setBounds(1055,320,50,50);
        g14.setText("14");
        g14.setBackground(Color.RED);
        g14.setForeground(Color.WHITE);
        g14.setFocusable(false);
        g14.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e ) {
                if(e.getSource()== g14) {
                    osszeg=osszeg-t.get(0);
                    v.add(14);
                    g14.setEnabled(false);
                }
            }
        });

        JButton g15 = new JButton();
        g15.setBounds(1110,320,50,50);
        g15.setText("15");
        g15.setBackground(Color.BLACK);
        g15.setForeground(Color.WHITE);
        g15.setFocusable(false);
        g15.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e ) {
                if(e.getSource()== g15) {
                    osszeg=osszeg-t.get(0);
                    v.add(15);
                    g15.setEnabled(false);
                }
            }
        });

        JButton g16 = new JButton();
        g16.setBounds(1165,320,50,50);
        g16.setText("16");
        g16.setBackground(Color.RED);
        g16.setForeground(Color.WHITE);
        g16.setFocusable(false);
        g16.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e ) {
                if(e.getSource()== g16) {
                    osszeg=osszeg-t.get(0);
                    v.add(16);
                    g16.setEnabled(false);
                }
            }
        });

        JButton g17 = new JButton();
        g17.setBounds(1000,375,50,50);
        g17.setText("17");
        g17.setBackground(Color.BLACK);
        g17.setForeground(Color.WHITE);
        g17.setFocusable(false);
        g17.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e ) {
                if(e.getSource()== g17) {
                    osszeg=osszeg-t.get(0);
                    v.add(17);
                    g17.setEnabled(false);
                }
            }
        });

        JButton g18 = new JButton();
        g18.setBounds(1055,375,50,50);
        g18.setText("18");
        g18.setBackground(Color.RED);
        g18.setForeground(Color.WHITE);
        g18.setFocusable(false);
        g18.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e ) {
                if(e.getSource()== g18) {
                    osszeg=osszeg-t.get(0);
                    v.add(18);
                    g18.setEnabled(false);
                }
            }
        });

        JButton g19 = new JButton();
        g19.setBounds(1110,375,50,50);
        g19.setText("19");
        g19.setBackground(Color.BLACK);
        g19.setForeground(Color.WHITE);
        g19.setFocusable(false);
        g19.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e ) {
                if(e.getSource()== g19) {
                    osszeg=osszeg-t.get(0);
                    v.add(19);
                    g19.setEnabled(false);
                }
            }
        });

        JButton g20 = new JButton();
        g20.setBounds(1165,375,50,50);
        g20.setText("20");
        g20.setBackground(Color.RED);
        g20.setForeground(Color.WHITE);
        g20.setFocusable(false);
        g20.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e ) {
                if(e.getSource()== g20) {
                    osszeg=osszeg-t.get(0);
                    v.add(20);
                    g20.setEnabled(false);
                }
            }
        });

        JButton g21 = new JButton();
        g21.setBounds(1000,430,50,50);
        g21.setText("21");
        g21.setBackground(Color.BLACK);
        g21.setForeground(Color.WHITE);
        g21.setFocusable(false);
        g21.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e ) {
                if(e.getSource()== g21) {
                    osszeg=osszeg-t.get(0);
                    v.add(21);
                    g21.setEnabled(false);
                }
            }
        });

        JButton g22 = new JButton();
        g22.setBounds(1055,430,50,50);
        g22.setText("22");
        g22.setBackground(Color.RED);
        g22.setForeground(Color.WHITE);
        g22.setFocusable(false);
        g22.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e ) {
                if(e.getSource()== g22) {
                    osszeg=osszeg-t.get(0);
                    v.add(22);
                    g22.setEnabled(false);
                }
            }
        });

        JButton g23 = new JButton();
        g23.setBounds(1110,430,50,50);
        g23.setText("23");
        g23.setBackground(Color.BLACK);
        g23.setForeground(Color.WHITE);
        g23.setFocusable(false);
        g23.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e ) {
                if(e.getSource()== g23) {
                    osszeg=osszeg-t.get(0);
                    v.add(23);
                    g23.setEnabled(false);
                }
            }
        });

        JButton g24 = new JButton();
        g24.setBounds(1165,430,50,50);
        g24.setText("24");
        g24.setBackground(Color.RED);
        g24.setForeground(Color.WHITE);
        g24.setFocusable(false);
        g24.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e ) {
                if(e.getSource()== g24) {
                    osszeg=osszeg-t.get(0);
                    v.add(24);
                    g24.setEnabled(false);
                }
            }
        });

        JButton g25 = new JButton();
        g25.setBounds(1000,485,50,50);
        g25.setText("25");
        g25.setBackground(Color.BLACK);
        g25.setForeground(Color.WHITE);
        g25.setFocusable(false);
        g25.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e ) {
                if(e.getSource()== g25) {
                    osszeg=osszeg-t.get(0);
                    v.add(9);
                    g25.setEnabled(false);
                }
            }
        });

        JButton g26 = new JButton();
        g26.setBounds(1055,485,50,50);
        g26.setText("26");
        g26.setBackground(Color.RED);
        g26.setForeground(Color.WHITE);
        g26.setFocusable(false);
        g26.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e ) {
                if(e.getSource()== g26) {
                    osszeg=osszeg-t.get(0);
                    v.add(26);
                    g26.setEnabled(false);
                }
            }
        });

        JButton g27 = new JButton();
        g27.setBounds(1110,485,50,50);
        g27.setText("27");
        g27.setBackground(Color.BLACK);
        g27.setForeground(Color.WHITE);
        g27.setFocusable(false);
        g27.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e ) {
                if(e.getSource()== g27) {
                    osszeg=osszeg-t.get(0);
                    v.add(27);
                    g27.setEnabled(false);
                }
            }
        });

        JButton g28 = new JButton();
        g28.setBounds(1165,485,50,50);
        g28.setText("28");
        g28.setBackground(Color.RED);
        g28.setForeground(Color.WHITE);
        g28.setFocusable(false);
        g28.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e ) {
                if(e.getSource()== g28) {
                    osszeg=osszeg-t.get(0);
                    v.add(28);
                    g28.setEnabled(false);
                }
            }
        });

        JButton g29 = new JButton();
        g29.setBounds(1000,540,50,50);
        g29.setText("29");
        g29.setBackground(Color.BLACK);
        g29.setForeground(Color.WHITE);
        g29.setFocusable(false);
        g29.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e ) {
                if(e.getSource()== g29) {
                    osszeg=osszeg-t.get(0);
                    v.add(29);
                    g29.setEnabled(false);
                }
            }
        });

        JButton g30 = new JButton();
        g30.setBounds(1055,540,50,50);
        g30.setText("30");
        g30.setBackground(Color.RED);
        g30.setForeground(Color.WHITE);
        g30.setFocusable(false);
        g30.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e ) {
                if(e.getSource()== g30) {
                    osszeg=osszeg-t.get(0);
                    v.add(30);
                    g30.setEnabled(false);
                }
            }
        });

        JButton g31 = new JButton();
        g31.setBounds(1110,540,50,50);
        g31.setText("31");
        g31.setBackground(Color.BLACK);
        g31.setForeground(Color.WHITE);
        g31.setFocusable(false);
        g31.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e ) {
                if(e.getSource()== g31) {
                    osszeg=osszeg-t.get(0);
                    v.add(31);
                    g31.setEnabled(false);
                }
            }
        });

        JButton g32 = new JButton();
        g32.setBounds(1165,540,50,50);
        g32.setText("32");
        g32.setBackground(Color.RED);
        g32.setForeground(Color.WHITE);
        g32.setFocusable(false);
        g32.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e ) {
                if(e.getSource()== g32) {
                    osszeg=osszeg-t.get(0);
                    v.add(32);
                    g32.setEnabled(false);
                }
            }
        });

        JButton g33 = new JButton();
        g33.setBounds(1000,595,50,50);
        g33.setText("33");
        g33.setBackground(Color.BLACK);
        g33.setForeground(Color.WHITE);
        g33.setFocusable(false);
        g33.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e ) {
                if(e.getSource()== g33) {
                    osszeg=osszeg-t.get(0);
                    v.add(33);
                    g33.setEnabled(false);
                }
            }
        });

        JButton g34 = new JButton();
        g34.setBounds(1055,595,50,50);
        g34.setText("34");
        g34.setBackground(Color.RED);
        g34.setForeground(Color.WHITE);
        g34.setFocusable(false);
        g34.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e ) {
                if(e.getSource()== g34) {
                    osszeg=osszeg-t.get(0);
                    v.add(34);
                    g34.setEnabled(false);
                }
            }
        });

        JButton g35 = new JButton();
        g35.setBounds(1110,595,50,50);
        g35.setText("35");
        g35.setBackground(Color.BLACK);
        g35.setForeground(Color.WHITE);
        g35.setFocusable(false);
        g35.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e ) {
                if(e.getSource()== g35) {
                    osszeg=osszeg-t.get(0);
                    v.add(35);
                    g35.setEnabled(false);
                }
            }
        });

        JButton g36 = new JButton();
        g36.setBounds(1165,595,50,50);
        g36.setText("36");
        g36.setBackground(Color.RED);
        g36.setForeground(Color.WHITE);
        g36.setFocusable(false);
        g36.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e ) {
                if(e.getSource()== g36) {
                    osszeg=osszeg-t.get(0);
                    v.add(36);
                    g36.setEnabled(false);
                }
            }
        });

        JButton g0 = new JButton();
        g0.setBounds(1000,100,160,50);
        g0.setText("0");
        g0.setBackground(Color.GREEN);
        g0.setForeground(Color.BLACK);
        g0.setFocusable(false);
        g0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e ) {
                if(e.getSource()== g0) {
                    osszeg=osszeg-t.get(0);
                    v.add(0);
                    g0.setEnabled(false);
                }
            }
        });

        /*---------------T??tek----------------*/

        JButton t50 = new JButton();
        t50.setBounds(100,695,200,68);
        t50.setText("50");
        t50.setBackground(Color.DARK_GRAY);
        t50.setForeground(Color.white);
        t50.setFocusable(false);
        t50.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e ) {
                if(e.getSource()== t50) {
                    t.remove(0);
                    t.add(50);
                }
            }
        });

        JButton t100 = new JButton();
        t100.setBounds(325,695,200,68);
        t100.setText("100");
        t100.setBackground(Color.DARK_GRAY);
        t100.setForeground(Color.white);
        t100.setFocusable(false);
        t100.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e ) {
                if(e.getSource()== t100) {
                    t.remove(0);
                    t.add(100);
                }
            }
        });

        JButton t250 = new JButton();
        t250.setBounds(550,695,200,68);
        t250.setText("250");
        t250.setBackground(Color.DARK_GRAY);
        t250.setForeground(Color.white);
        t250.setFocusable(false);
        t250.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e ) {
                if(e.getSource()== t250) {
                    t.remove(0);
                    t.add(250);
                }
            }
        });

        JButton t500 = new JButton();
        t500.setBounds(775,695,200,68);
        t500.setText("500");
        t500.setBackground(Color.DARK_GRAY);
        t500.setForeground(Color.white);
        t500.setFocusable(false);
        t500.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e ) {
                if(e.getSource()== t500) {
                    t.remove(0);
                    t.add(500);
                }
            }
        });



        /*-----------------------------------------------*/

        JButton piros = new JButton();
        piros.setBounds(945,300,50,100);
        piros.setText("");
        piros.setBackground(Color.RED);
        piros.setFocusable(false);
        piros.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e ) {
                if(e.getSource()== piros) {

                    Integer i=0;
                    if (n % 2==0){
                       f=f+1;
                    }
                }
            }
        });
        JButton fekete = new JButton();
        fekete.setBounds(945,405,50,100);
        fekete.setText("");
        fekete.setBackground(Color.BLACK);
        fekete.setFocusable(false);
        fekete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e ) {
                if(e.getSource()== fekete) {
                    Integer i=0;
                    if (n % 2==1){
                        f=f+1;
                    }

                }
            }
        });
        
        frame.add(g1);
        frame.add(g2);
        frame.add(g3);
        frame.add(g4);
        frame.add(g5);
        frame.add(g6);
        frame.add(g7);
        frame.add(g8);
        frame.add(g9);
        frame.add(g10);
        frame.add(g11);
        frame.add(g12);
        frame.add(g13);
        frame.add(g14);
        frame.add(g15);
        frame.add(g16);
        frame.add(g17);
        frame.add(g18);
        frame.add(g19);
        frame.add(g20);
        frame.add(g21);
        frame.add(g22);
        frame.add(g23);
        frame.add(g24);
        frame.add(g25);
        frame.add(g26);
        frame.add(g27);
        frame.add(g28);
        frame.add(g29);
        frame.add(g30);
        frame.add(g31);
        frame.add(g32);
        frame.add(g33);
        frame.add(g34);
        frame.add(g35);
        frame.add(g36);
        frame.add(g0);
        frame.add(t50);
        frame.add(t100);
        frame.add(t250);
        frame.add(t500);
        frame.add(piros);
        frame.add(fekete);

        /*----------------------------------------------*/

        JButton j??t??k = new JButton();
        j??t??k.setBounds(500,100,160,50);
        j??t??k.setText("j??t??k");
        j??t??k.setBackground(Color.LIGHT_GRAY);
        j??t??k.setForeground(Color.white);
        j??t??k.setFocusable(false);
        j??t??k.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e ) {
                if(e.getSource()== j??t??k) {

                    ArrayList<Integer> z =new ArrayList<Integer>();
                    Random random = new Random();
                    int x = random.nextInt(37);
                    Integer ix = Integer.valueOf(x);
                    n=ix;                               // van egy pici hiba
                    z.add(ix);

                    Integer i=0;
                    if (f>=1){
                        i +=1;
                    }
                    else i=0;

                    Integer kp2=0;
                    kp2=i*t.get(0)*2;
                    osszeg=osszeg+kp2;

                    Integer Tal= 0;

                    Integer y;
                    for(y=0;y<v.size();y++){
                        if ( v.equals(z)){
                            Tal= Tal+1;
                            System.out.println("tal??latok szama"+Tal);

                    }}

                    Tal=Tal+i;
                    Integer kp;
                    kp=t.get(0)*Tal*2;
                    osszeg=osszeg+kp;

                    if (Tal>0){
                        JOptionPane.showMessageDialog(null,"Az ??n nyerem??nye "+kp,"Nyert",JOptionPane.INFORMATION_MESSAGE);
                    }
                    else
                    JOptionPane.showMessageDialog(null,"Sajn??ljuk de nem nyert. A nyer?? sz??m: "+z,"Nem nyert!",JOptionPane.WARNING_MESSAGE);

                    if (osszeg <= 0){
                        JOptionPane.showMessageDialog(null,"Nincs t??bb ??rm??je","Ki fogyott",JOptionPane.WARNING_MESSAGE);
                    }

                    g0.setEnabled(true); g1.setEnabled(true); g2.setEnabled(true);g4.setEnabled(true); g5.setEnabled(true); g6.setEnabled(true);
                    g7.setEnabled(true); g8.setEnabled(true); g9.setEnabled(true);g10.setEnabled(true); g11.setEnabled(true); g12.setEnabled(true);
                    g13.setEnabled(true); g14.setEnabled(true); g15.setEnabled(true);g16.setEnabled(true); g17.setEnabled(true); g18.setEnabled(true);
                    g19.setEnabled(true); g20.setEnabled(true); g21.setEnabled(true);g22.setEnabled(true); g23.setEnabled(true); g24.setEnabled(true);
                    g25.setEnabled(true); g26.setEnabled(true); g27.setEnabled(true);g28.setEnabled(true); g29.setEnabled(true); g30.setEnabled(true);
                    g31.setEnabled(true); g32.setEnabled(true); g33.setEnabled(true);g34.setEnabled(true); g35.setEnabled(true); g36.setEnabled(true);
                    g3.setEnabled(true);

                    v.clear();
                    frame.repaint();
                    System.out.println(z);
                    System.out.println(osszeg);
                    f=0;
                }
            }
        });
        frame.add(j??t??k);

    }
}