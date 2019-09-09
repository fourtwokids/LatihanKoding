package Latihan;

import java.util.Scanner;


public class While_nama {
    public static void main(String[]args){
    String nomor;
    int i=0;
     Scanner sc = new Scanner(System.in);
     System.out.print(i+1+". Nomor: ");nomor = sc.next();
    if(!nomor.equalsIgnoreCase("999")){
        i=0;
            while(!nomor.equalsIgnoreCase("999"));{
                i++;
        System.out.println(" Dapat Nomor "+nomor);
    }
            System.out.println("Jumlah pengulangan: "+i);
    }
    }
   
}
