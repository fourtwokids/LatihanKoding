/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LatihanH2;

/**
 *
 * @author Niko
 */
public class LatihanH2 {
    public static void main(String args[]){
        Titik T = new Titik();
        Titik T1 = new Titik(5,3);
        buatPersegiPanjang pp = new buatPersegiPanjang();
        
        System.out.println("Titik Satu");
        T.BacaTitik();
        T.TulisTitik();
        
        System.out.println("Titik dua");
        
        T1.BacaTitik();
        
        System.out.println("X= "+T1.getX());
        System.out.println("Y= "+T1.getY());
        
        System.out.print("Persegi panjang: ");
        pp.bacaPersegiPanjang(T, T1);
        pp.TulisPersegiPanjang();
        System.out.print("Panjang: "+pp.panjang());
        System.out.print("Lebar "+pp.lebar());
        System.out.print("Luas: "+pp.luas());
        
        
    }
    
}
