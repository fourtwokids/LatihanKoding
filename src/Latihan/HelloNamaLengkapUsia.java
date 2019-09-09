package Latihan;

import java.util.Scanner;


public class HelloNamaLengkapUsia {
    public static void main(String[]args){
    String NamaDep,NamaBel;
    int umur;
    
    Scanner sc = new Scanner(System.in);
    System.out.println("Nama Depan: ");NamaDep = sc.next();
    System.out.println("Nama Belakang: ");NamaBel = sc.next();
    System.out.println("Usia: ");umur = sc.nextInt();
    System.out.println("Hello "+NamaDep+" "+NamaBel+"dan \nUmur anda "+umur+ " tahun");}

}
