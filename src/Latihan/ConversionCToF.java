
package Latihan;

import java.util.Scanner;

/**
 *
 * @author Niko
 */
public class ConversionCToF {
    public static void main(String args[]){
    float c,f;
    Scanner sc= new Scanner(System.in);
    System.out.println("C: ");c=sc.nextInt();
    f=(9*c)/5+32;
    //f=(float)9/5*c+32;
    System.out.println("F: "+f);
    }
}
