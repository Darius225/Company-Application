package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AdaugaPlata extends JFrame {
    public JPanel adaugaPlata;
    private JTextField numeFirma;
    private JButton button1;
    private JTextField suma;

    public AdaugaPlata() {
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"S-a reusit introducerea datelor ! ");
                Main main = new Main() ;
                String name = numeFirma.getText() ;
                String sum = suma.getText() ;
                main.addPayment( name , sum );
                JFrame  frame = new JFrame("Gestiunea") ;
                frame.setContentPane( new Gestiunea().gestiune ) ;
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE) ;
                frame.pack() ;
                frame.setVisible(true) ;
            }
        });
    }
}
