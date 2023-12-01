/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios2;

import java.util.Scanner;

/**
 *
 * @author fraferal
 */
public class GetCharFromAsciiCode {
    
    public static void main(String[] args) {
      
       Scanner sc=new Scanner (System.in);
       
        System.out.println("Escriba el valor ASCII: ");
        
        int valor = sc.nextInt() ;
        char character = (char) valor;
        
        System.out.println("El valor ASCII: " + valor + " es: " + character);
        
    }
           
        
}
