/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.taksimetre;
import java.util.Scanner;

/**
 *
 * @author Mihriban Yıldız
 */
public class Taksimetre {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        
        double km, tutar;
        System.out.println("Gideceğiniz mesafeyi girin");
        km=s.nextDouble();
        
        if (10+ km*2.20<20) {
            System.out.println("ödenecek tutar 20TL");
            
        } else { tutar= 10+ km*2.20;
            System.out.println("ödenecek tutar" + tutar);
                
        }
            
        
        
    }
}
