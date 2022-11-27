/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.tam_bolunme;
import java.util.Scanner;
/**
 *
 * @author Mihriban Yıldız
 */
public class Tam_bolunme {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        
        int a , b  ;
        System.out.println("ilk sayıyı girin");
        a=s.nextInt();
        System.out.println("ikinci sayıyı girin");
        b=s.nextInt();
        
        
        if (a%b==0)
            System.out.println("tam bölünür");
        else
            System.out.println("tam bölünmez");
    }
}
