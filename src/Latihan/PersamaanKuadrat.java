
package Latihan;

import java.util.Scanner;


public class PersamaanKuadrat {

    
    public static void main(String[] args) {
        int a,b,c;
        double x1,x2,D;
        
        Scanner sc= new Scanner(System.in);
        System.out.print("a: ");a=sc.nextInt();
        System.out.print("b: ");b=sc.nextInt();
        System.out.print("c: ");c=sc.nextInt();
       
        
        D=b*b-4*a*c;
        if(D<0)System.out.print("X1 DAN X2 bilangan Imajiner");
        else{x1= ((-b)+Math.sqrt(D))/(2*a);
        x2= ((-b)-Math.sqrt(D))/(2*a);
        System.out.println(x1 + " " +x2);
        }
    }
    
}
