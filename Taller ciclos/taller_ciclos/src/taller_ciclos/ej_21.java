/*
21. Escriba un algoritmo que lea n números reales y muestre el 
promedio de los números leídos. 
*/
package taller_ciclos;

import java.util.Scanner;


public class ej_21 {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        
        double n3=0, n2=0, n4=0;
        
        System.out.println("Ingrese cantidad de numeros que desea ingresar");
        double n = s.nextDouble();
        
        do 
        {
           System.out.println("Ingrese un numero");
           n2 = s.nextDouble();
           n3 = n3 + n2;
           n4++;
           
        } while (n4<n);
            System.out.println("El promedio es: " + n3/n);
    }
}
