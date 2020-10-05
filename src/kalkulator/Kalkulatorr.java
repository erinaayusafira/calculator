/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kalkulator;

/**
 *
 * @author USER
 */
class Kalkulator implements Operasi{
    public double Bil1,Bil2;
    //parameter
    public Kalkulator(double Bil1,double Bil2)
    {   //setter
        this.Bil1=Bil1;
        this.Bil2=Bil2;
    }
    public double Penjumlahan(){
        return Bil1+Bil2;
    }
    public double Pengurangan()
    {
        return Bil1-Bil2;
    }
    public double Perkalian(){
        return Bil1*Bil2;
    }
    public double Pembagian(){
        return Bil1/Bil2;
    }

}

