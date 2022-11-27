/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.cevreden_alan_bulma_ucgen;
import java.util.Scanner;

/**
 *
 * @author Mihriban Yıldız
 */
public class Cevreden_alan_bulma_ucgen {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        
        int a, b, c, cevre;
        
        System.out.println("birinci kenarı girin");
        a=s.nextInt();
        
        System.out.println("ikinci kenarı girin");
        b=s.nextInt();
        
        System.out.println("üçüncü kenarı girin");
        c=s.nextInt();
        
        cevre= (a+b+c);
        int u = cevre/2 ;//ikiye bölmemek için iki katını aldım
        
        double alan= u*(u-a)*(u-b)*(u-c);  //𝑢 * (𝑢 − 𝑎)* (𝑢 − 𝑏) * (𝑢 − 𝑐)
        System.out.println("Alan=" + Math.sqrt(alan));
                
        
    }
}
