/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.kdv;
import java.util.Scanner;
        

/**
 *
 * @author Mihriban Yıldız
 */
public class KDV {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        
        int KDV;
        double fiyat ;
        
        System.out.println("please enter the price");
        fiyat=s.nextDouble();
        
        if (fiyat<1000){
        KDV=18;
        System.out.println("KDV=" + KDV);
        
        fiyat=((fiyat*18)/100)+fiyat;
        System.out.println("KDV dahil fiyat" + fiyat);
        
        }else
        {
        KDV=8;
        System.out.println("KDV=" + KDV); 
        
        fiyat=(fiyat*8/100)+fiyat;
        System.out.println("KDV dahil fiyat" + fiyat);
        
        }
        
               
                        
                                    
        
        
        
    }
}
