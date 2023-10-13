/*
22. Escriba un algoritmo que lea n números reales y muestre el número 
que es menor y el número que es mayor.

 */
package taller_ciclos;

import java.util.Scanner;


public class ej_22 {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
     
        double n, menor=0, mayor=0;
        
        System.out.println("----Numero Mayor y Menor----");
        System.out.println("Ingrese la cantidad de numeros a evaluar");
        
        n = s.nextDouble();
        
        for (int i = 0; i < n; i++) {
            System.out.println("Digite numero: "+i);
            double vt = s.nextDouble();
            
            if (i==0) 
            {
             menor=vt;   
             mayor=vt;
            }else if(vt<menor)
             {
                menor=vt;
             }
            if (vt>mayor)
            {
             mayor=vt;   
            }
            
        }
        System.out.println("El numero mayor es:  "+ mayor);
        System.out.println("El numero menor es:  "+ menor);
        
    }
    
}
