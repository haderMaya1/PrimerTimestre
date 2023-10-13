/*
17. Haga un algoritmo que imprima los términos de la siguiente serie:
½, ¾, 5/6, 7/8
 */
package taller_ciclos;

import java.util.Scanner;


public class ej_17 {
    public static void main(String[] args) {
     Scanner teclado=new Scanner (System.in);
       int numerador=1,denominador=2;
      
        for (int i = 1; i < 10; i++) {
            if (i%2==0) 
            { 
                System.out.println(+numerador+ "/" +denominador);
                numerador=numerador+2;
                denominador=denominador+2;
            }
     } 
  }
}        
