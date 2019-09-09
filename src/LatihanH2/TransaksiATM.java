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
public class TransaksiATM {
    Scanner sc = new Scanner(System.in);
    
    int menu(){
        int pilih;
        System.out.println("1. Deposit");
        System.out.println("2. Withdrawal");
        System.out.println("0. keluar");
        System.out.println("what ur choice? ");pilih=sc.nextInt();
        return pilih;
    }
    
    public static void main(String args[]){  
    int noRek,inputan;
    String Nama;
    double saldo=1000000;
    
    int pil=0;
    
    Scanner sc = new Scanner(System.in);
    System.out.print("pilih: ");pil=sc.nextInt();
    System.out.print("Masukan Nominal: ");inputan=sc.nextInt();
    
    switch(pil){
    case 1:
        
        saldo=saldo+inputan;
        System.out.println("Deposit= "+inputan);
        System.out.print("Uang anda sekarang adalah: "+saldo);break;//Deposit
    case 2:
        System.out.print("Masukan Nominal: ");inputan=sc.nextInt();
        if(saldo-inputan >= 10000) {
        saldo = saldo-inputan;
        System.out.println("Pengambilan= "+inputan);
        System.out.println("Saldo= "+saldo);
        }else{
            do{
            System.out.print("Saldo setelah transaksi <10000");
            System.out.print("Masukkan input: ");inputan=sc.nextInt();
        }while(saldo-inputan<10000);
            }
        System.out.print("Pengambilan");break;//pengambilan}}
    
}
    
}}