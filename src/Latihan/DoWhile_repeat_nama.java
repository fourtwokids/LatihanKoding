package Latihan;

import java.util.Scanner;


public class DoWhile_repeat_nama {
    public static void main(String[]args){
    String nomor;
    int i=0;
     Scanner sc = new Scanner(System.in);
     System.out.print(i+1+". Nomor: ");nomor = sc.next();
    if(!nomor.equalsIgnoreCase("999")){
        i=0;
            do{
                i++;
        System.out.println(" Dapat Nomor "+nomor);
    }while(!nomor.equalsIgnoreCase("999"));
            System.out.println("Jumlah pengulangan: "+i);
    }
    }
   
}
