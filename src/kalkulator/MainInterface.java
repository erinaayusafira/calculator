/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kalkulator;
import java.util.Scanner;
/**
 *
 * @author USER
 */
public class MainInterface {
    public static void main(String[]args)throws Exception{
        Scanner scn = new Scanner(System.in);
        System.out.print("Masukkan Bilangan Pertama : ");
        int x = scn.nextInt();
        System.out.print("Masukkan Bilangan Kedua   : ");
        int y = scn.nextInt();
        System.out.println();
        Kalkulator k = new Kalkulator(x,y);
        System.out.println("Hasil Penjumlahan = "+k.Penjumlahan());
        System.out.println("Hasil Pengurangan = "+k.Pengurangan());
        System.out.println("   Hasil Perkalian = "+k.Perkalian());
        System.out.println("Hasil Pembagian = "+k.Pembagian());
         
    }
    
}
