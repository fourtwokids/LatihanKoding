/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LatihanH2;

import java.util.Scanner;

/**
 *
 * @author Niko
 */
public class nasabah {
    int saldo=10000000;
    int norek;
    String nama;
    
    nasabah(){
        norek=0;
        saldo=0;
    }
    
    nasabah(int norek, String nasabah, int saldo){
        norek=0;
        saldo=0;
    }
    
    void baca(){
            Scanner sc= new Scanner(System.in);
           System.out.println("Nama Nasabah: "+nama);nama=sc.next();
             System.out.println("No Rekening:  "+norek);norek = sc.nextInt();
               System.out.println("Saldo Sekarang: "+nama);saldo=sc.nextInt();
    }
   
    void tulis(){
        
           System.out.println("Nama Nasabah: "+nama);
             System.out.println("No Rekening:  "+norek );
               System.out.println("Saldo Sekarang: "+saldo);
        
        
    }
    
    int getSaldo(){
    return saldo;
    }
    
    String getNama(){
        return nama;
    }
    
    int getNorek(){
        return norek;
    }
    
    public static void main(String args[]){
    nasabah N = new nasabah();
    N.baca();
    N.tulis();
        
    }
    
    
}
