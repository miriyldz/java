/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.not_ortalamasi;
import java.util.Scanner;

/**
 *
 * @author Mihriban Yıldız
 */
public class Not_ortalamasi {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        
        int mat;
        System.out.println("mat notu?");
        mat=s.nextInt();
        
        int fizik;
        System.out.println("fizik notu?");
        fizik=s.nextInt();
        
        int kimya;
        System.out.println("kimya notu?");
        kimya=s.nextInt();
        
        int tarih;
        System.out.println("tarih notu?");
        tarih=s.nextInt();
        
        int türkçe;
        System.out.println("türkçe notu?");
        türkçe=s.nextInt();
        
        int müzik;
        System.out.println("müzik notu?");
        müzik=s.nextInt();
        
        double ort=(mat+fizik+kimya+tarih+türkçe+müzik)/6;
        System.out.println("ortalamanız:"+ort);
        
        String sonuc = ort>65 ? "sınıfı geçti" : "sınıfta kaldı";
        System.out.println(sonuc);
                
        
        
        
        
        
        
    }
}
