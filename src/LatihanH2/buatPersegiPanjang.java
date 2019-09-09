/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LatihanH2;

/**
 *
 * @author Niko
 */
public class buatPersegiPanjang {
    Titik T1, T2, T3, T4;//kiri atas
    //kanan bawah
    
    void bacaPersegiPanjang(Titik T1bag2, Titik T2bag2){
//    T1.BacaTitik();
//    T2.BacaTitik();
      T1 = T1bag2;
      T2 = T2bag2;
      
    T3.x=T2.x;
    T3.y=T1.y;
    
    T4.x=T1.x;
    T4.y=T2.y;
    
    }
    
    int panjang(){
        //int p=0;
        return T2.x-T4.x;
        //p=T2.x-T4.x;
        //return T2.x-T4.x;
        //return p;
    }
    
    int lebar(){
        int l=0;
        l=T1.y-T4.y;
        return l;
    }
    
    int luas(){
        
        return panjang()*lebar();
    }
    
    void TulisPersegiPanjang(){
        System.out.println("T1= ");T1.TulisTitik();
        System.out.println("T2= ");T2.TulisTitik();
        System.out.println("T3= ");T3.TulisTitik();
        System.out.println("T4= ");T4.TulisTitik();
    }
}
