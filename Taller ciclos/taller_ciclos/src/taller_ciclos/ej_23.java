/*
23. Diseñe un algoritmo que lea un entero n y muestre un cuadrado 
formado por n filas con n asteriscos. Por ejemplo, si su algoritmo lee 
el número 8, este debe mostrar por pantalla el siguiente patrón de 
asteriscos: 
 */
package taller_ciclos;

import java.util.Scanner;


public class ej_23 {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        
        int n;
        do {
            System.out.println("Ingrese un numero mayor que 1");
            n = s.nextInt();
        } while (n<2);
       
        for (int i = 0; i < n; i++) 
       { 
            for (int j = 0; j < n; j++) 
            {
                System.out.print(" * ");
            }
            System.out.println("");
        }
        
    }
}
