/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.manav_kasa;
import java.util.Scanner;

/**
 *
 * @author Mihriban Yıldız
 */
public class Manav_kasa {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        
        int armut;
        System.out.println("armut kaç kilo?");
        armut=s.nextInt();
        
        int elma;
        System.out.println("elma kaç kilo?");
        elma=s.nextInt();
        
        int domates;
        System.out.println("domates kaç kilo?");
        domates=s.nextInt();
        
        int muz;
        System.out.println("muz kaç kilo?");
        muz=s.nextInt();
        
        int patlican;
        System.out.println("patlıcan kaç kilo?");
        patlican=s.nextInt();
        
        double toplam= armut*2.14+elma*3.67+domates*1.11+muz*0.95+patlican*5.0;
        System.out.println("toplam:" + toplam);
        
    }
}
/*Armut : 2,14 TL
Elma : 3,67 TL
Domates : 1,11 TL
Muz: 0,95 TL
Patlıcan : 5,00 TL*/