package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class CautaFirma {
    public JPanel cautaFirma;
    private JButton buton_de_cautare;
    private JTextField firma;
    private JTextArea firme;

    public CautaFirma() {
        buton_de_cautare.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                firme.setText(null) ;
                Main main = new Main() ;
                ArrayList <String> filtered = new ArrayList<>() ;
                String cauta = firma.getText() ;
                filtered = main.displayPayments( cauta ) ;
                for ( String filter : filtered ) {
                    firme.append(filter) ;
                    firme.append(System.lineSeparator() ) ;
                }
            }
        });
    }
}
