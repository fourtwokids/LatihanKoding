/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LatihanH2;

import java.util.Scanner;

/**
 *
 * @author Niko
 */
public class Titik {
    int x;
    int y;
    
    Titik(){
        x=0;
        y=0;
    }
    Titik(int X,int Y){
        x=X;
        y=Y;
    }
    void BacaTitik(){
        Scanner sc = new Scanner(System.in);
        System.out.print("X: ");x= sc.nextInt();
        System.out.print("Y: ");y= sc.nextInt();
        
        
    }
    
    void TulisTitik(){
        System.out.println("("+x+","+y+")");
    }
    
    int getX(){return x;}
    int getY(){return y;}
}
