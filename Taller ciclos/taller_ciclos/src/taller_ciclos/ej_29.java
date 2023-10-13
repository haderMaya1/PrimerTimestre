/*
29. Diseñe un algoritmo que lea números enteros hasta que 
encuentre uno que cumpla las siguientes condiciones: a. 
Múltiplo de 2 b. No múltiplo de 5 c. Mayor que 100 d. Menor 
que 10.000
 */
package taller_ciclos;

import java.util.Scanner;

public class ej_29 {
  public static void main(String[] args) {
        Scanner teclado=new Scanner (System.in);
        int numero,numero2 = 0;
        
        System.out.println("ingrese cantidad de numeros");
        numero2=teclado.nextInt();
           for (int i = 0; i <= numero2; i++) {
           System.out.println("ingrese un numero mayor a 100");
           numero=teclado.nextInt();
             if (numero%2==0) {
                System.out.println("el numero "+numero+" multiplo de 2");
            } else if (!(5!=numero%5 && 0!=numero%5)) {
                System.out.println("no puede ser multiplo de 5");
            } 
            else if (numero>100) {
                  System.out.println("el numero "+numero+" multiplo de 2");
               }else if (numero<10000) {
                  System.out.println("no puede ser multiplo de 5"); 
               }
             break;
            
        }
                
    }
            
}
