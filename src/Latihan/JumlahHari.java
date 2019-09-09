
package Latihan;

import java.util.Scanner;


public class JumlahHari {

    
    public static void main(String[] args) {
        int kdB,thn,jhari;
        
        Scanner sc = new Scanner (System.in);
        System.out.print("kode bulan: ");kdB = sc.nextInt();
        System.out.print("Tahun: ");thn = sc.nextInt();
        
        switch(kdB){
        case 1:
        case 3:
        case 5:
        case 7:
        case 8:
        case 10:
        case 4:
        case 6:
        case 9:
        case 12: jhari =31; break;
        case 2: if (thn %4==0)
            jhari = 29;
        else 
            jhari = 28; break;
        default: jhari = 0;
        }
        
    }
    
}
