package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Gestiunea extends JFrame {
    private JButton adaugaPlata;
    public JPanel gestiune;
    private JButton cautaFirma;

    public Gestiunea() {
        adaugaPlata.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame  frame = new JFrame("Adaugare plata") ;
                frame.setContentPane( new AdaugaPlata().adaugaPlata ) ;
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE) ;
                frame.pack() ;
                frame.setVisible( true ) ;
            }
        });
        cautaFirma.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame  frame = new JFrame("Cautare firma") ;
                frame.setContentPane( new CautaFirma().cautaFirma) ;
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE) ;
                frame.pack() ;
                frame.setVisible( true ) ;
            }
        });
    }

    public static void main(String[] args) {
        JFrame  frame = new JFrame("Gestiunea") ;
        frame.setContentPane( new Gestiunea().gestiune ) ;
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE) ;
        frame.pack() ;
        frame.setVisible(true) ;
    }

}
