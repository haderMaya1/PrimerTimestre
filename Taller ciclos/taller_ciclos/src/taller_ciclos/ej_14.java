/*
14. Diseñe un algoritmo que lea un entero n y calcule hasta el n-ésimo término 
de la sucesión de Fibonacci. Cada término de la sucesión se obtiene sumando 
los dos términos anteriores. Los dos primeros términos de la sucesión son el 
número uno. 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89,… 
Instructor: Luz Mery Cárcamo
Fundamentos de programación
Por ejemplo, si n = 6 el algoritmo debe mostrar: 1, 1, 2, 3, 5, 8
*/
package taller_ciclos;

import java.util.Scanner;

public class ej_14 {
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
