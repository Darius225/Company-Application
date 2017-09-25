package com.company;

import com.company.Classes.Plata;

import javax.swing.*;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {

    }

//    public static String getPaymentData ( String prompt )
//    {
//        System.out.println(prompt);
//        Scanner sc = new Scanner(System.in) ;
//        return sc.nextLine() ;
//    }
    public static String getCurrentDate ( )
   {
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd/HH:mm:ss");
        Date date = new Date();
        return dateFormat.format(date) ;
    }
    public static void addPayment (String firma , String suma )
    {
        assert check(suma) ;
        int suma1 = Integer.parseInt(suma);
        String data = getCurrentDate() ;
        Plata plata = new Plata ( firma , suma1 , data ) ;
//        System.out.println( plata.getName() + ' ' + plata.getSum() + ' ' + plata.getDate() );
        String targetFile = "Plati/Plati.txt" ;
        try (Writer writer = Files.newBufferedWriter(
                Paths.get( targetFile ), StandardCharsets.UTF_8,
                StandardOpenOption.WRITE,
                StandardOpenOption.APPEND)) {
            writer.write(plata.getName() + ' ' + plata.getSum() + ' ' + plata.getDate() + System.lineSeparator() );
        } catch (IOException e) {
            System.out.println("Nu se poate realiza adaugarea");;
        }
    }
    public static ArrayList <String>  displayPayments ( String s )
    {
        ArrayList <String> filteredFirms = new ArrayList<> () ;
        String sourceFile = "Plati/Plati.txt" ;
        try (
                FileReader fReader = new FileReader(sourceFile) ;
                BufferedReader bReader = new BufferedReader(fReader) ;
                )
        {
            while (true)
            {
                String line = bReader.readLine() ;
                if ( line == null )
                {
                    break ;
                }
                else
                {
                    if ( line.toLowerCase().contains(s.toLowerCase())  || s.equalsIgnoreCase("") )
                    {
                        filteredFirms.add(line) ;
                    }
                }
            }
        }
        catch ( Exception e )
        {
            System.out.println("Nu se poate realiza afisarea ! ");
        }
        return filteredFirms ;
    }
    public static boolean check( String s )
    {
        try {
            Integer.parseInt(s) ;
            return true ;
        }
        catch ( Exception e )
        {
            return false ;
        }
    }
}
