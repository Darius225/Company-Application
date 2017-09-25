package com.company.Classes;

public class Plata {
    private String numeFirma ;
    private int suma ;
    private String data ;
    public Plata ( String numeFirma , int suma , String data )
    {
        this.numeFirma = numeFirma ;
        this.suma = suma ;
        this.data = data ;
    }
    public String getName ( )
    {
        return numeFirma;
    }
    public int getSum ( )
    {
        return suma ;
    }
    public String getDate ( )
    {
        return data ;
    }
}