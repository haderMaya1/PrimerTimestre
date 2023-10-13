/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller_ciclos;

import java.util.Scanner;

/**
 *
 * @author Jader
 */
public class ej_15 {
     public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        int n3 = 1, n2 = 0, nt = 0, n4;
                
        System.out.println("Ingrese la cantidad terminos que desea conocerd de"
                + " la Secuencia Fibonacci");
        nt = s.nextInt();
        
        for (int i = 0; i < nt; i++) 
        {
         if (i <= 1)
             n4 = i;
         else
         {
          n4 = n2 + n3;
          n2 = n3;
          n3 = n4;
         }
            System.out.println("\n" + n4);  
        }
        System.out.println("La cantidad de terminos son: "+nt);
    }
}
