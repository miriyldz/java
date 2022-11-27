/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.hipotenus_hesabi;
import java.util.Scanner;

/**
 *
 * @author Mihriban Yıldız
 */
public class Hipotenus_hesabi {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a,b;
        
        System.out.println("A kenarını girin");
        a=s.nextInt();
        
        System.out.println("B kenarını girin");
        b=s.nextInt();
        
        double hipo= Math.sqrt(a*a+b*b);
        System.out.println("hipotenüs" + hipo);
                
    }
}
