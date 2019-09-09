
package Latihan;

import java.util.Scanner;


public class GanjilGenap {

    
    public static void main(String[] args) {
        int bil;
        
        Scanner sc= new Scanner(System.in);
        System.out.println("Bilangan: ");bil=sc.nextInt();
        
        if(bil%2==0)
        System.out.println("Bilangan ganjil");
        else System.out.println("Bilangan genap");
                
    }
    
}
