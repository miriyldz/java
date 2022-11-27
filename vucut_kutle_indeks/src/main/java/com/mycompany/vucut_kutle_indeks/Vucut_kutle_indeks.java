/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.vucut_kutle_indeks;
import java.util.Scanner;

/**
 *
 * @author Mihriban Yıldız
 */
public class Vucut_kutle_indeks {

    public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    
    double kutle, boy;
    
        System.out.println("kilonuzu girin(kg)");
        kutle=s.nextDouble();
        
        System.out.println("boyunuzu girin(m)");
        boy=s.nextDouble();
        
    double indeks=kutle/(boy*boy) ;
    
        System.out.println("vücut kitle indeksi" + indeks);
        
    }
}
