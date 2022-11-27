/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.daire_dilim_alan;
import java.util.Scanner;
/**
 *
 * @author Mihriban Yıldız
 */
public class Daire_dilim_alan {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        
        int r , a;
        System.out.println("dairenin yarıçapını girin");
        r=s.nextInt();
        
        System.out.println("merkez açı ölçüsünü girin");
        a=s.nextInt();
        
        double pi=3.14 ;
        double alan=pi*r*r*a/360;
        
        System.out.println("daire diliminin alanı" + alan);
        
        
    }
}
