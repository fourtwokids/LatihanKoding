package Latihan;

import java.util.Scanner;


public class HelloNamaGabungan {
    public static void main(String[]args){
    String NamaDep,NamaBel;
    
    Scanner sc = new Scanner(System.in);
    System.out.println("Nama Depan: ");NamaDep = sc.next();
    System.out.println("Nama Belakang: ");NamaBel = sc.next();
    System.out.println("Hello "+NamaDep+" "+NamaBel);}

}
