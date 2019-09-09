
package Latihan;

import java.util.Scanner;
import static javax.management.Query.div;

/**
 *
 * @author Niko
 */
public class ConversionTime {
    public static void main(String args[]){
    int J,sisaJ,m,d;
    int TotalW=32777;
    
    Scanner sc= new Scanner(System.in);
    System.out.println("Total Waktu: " +TotalW);
    
    J=TotalW /3600;
    sisaJ=TotalW % 3600;
    m= sisaJ / 60;
    d =sisaJ %60;
    
    System.out.println("J: "+J);
    System.out.println("Sisa J: "+sisaJ);
    System.out.println("m: "+m);
    System.out.println("d: "+d);

    }
}
