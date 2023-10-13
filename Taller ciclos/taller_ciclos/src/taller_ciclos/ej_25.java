/*
 25. Escriba un algoritmo para cada uno de los siguientes patrones 
de asteriscos. Por ejemplo, para el patrón de asteriscos B), lea 
un entero n y muestre n asteriscos en la primera fila, n- 1 
asteriscos en la segunda fila y así sucesivamente.
 */
package taller_ciclos;

import java.util.Scanner;


public class ej_25 
{
     public static void main(String[] args) 
     {
        Scanner s = new Scanner (System.in);
        
        int n=8;
        
         System.out.println("(A)");
         
        for (int i = 0; i <= n; i++) 
       { 
           for (int j = 0; j < i; j++) 
           {
               System.out.print(" * ");
           }
           System.out.println("");
       }
        
         System.out.print("------------");
         System.out.println("");
         System.out.println(" (B) ");
         System.out.println("");
         
          for (int i = n; i >= 0; i--)
       {
           for (int j = 0; j < i; j++) 
           {
               System.out.print(" * ");
           }
           System.out.println("");
       } 
         System.out.print("------------");
         System.out.println("");
         System.out.println(" (C) ");
         System.out.println("");
         
          for (int i = 0; i <= n ; i++) //Columnas
       { 
             
           for (int j = 0; j <= i; j++) //Filas 
           {
                System.out.print("  ");    
           }
           for (int j = (n-i); j >=0 ; j--) 
           {
               System.out.print(" *");
           }
           System.out.println("");
       } 
          
          
         System.out.print("------------");
         System.out.println("");
         System.out.println(" (D) ");
         System.out.println("");
         
          for (int i = 0; i <= n ; i++) //Columnas
       { 
             
           for (int j = (n-i); j >=0 ; j--) //Filas 
           {
                System.out.print("  ");    
           }
           for (int j = 0; j < i; j++) 
           {
               System.out.print(" *");
           }
           System.out.println("");
       } 
          
         
          
    }   
}
