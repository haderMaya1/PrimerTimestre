/*
18. Leer cantidad indeterminada de números enteros positivos e 
imprima el promedio de todos los números. El algoritmo termina 
cuando se ingrese un numero múltiplo de 6
 */
package taller_ciclos;

import java.util.Scanner;

/**
 *
 * @author Jader
 */
public class ej_18 {
    public static void main(String[] args) 
    {
        Scanner s = new Scanner (System.in);
        float prom=0;
        int  num2=0,num,acum=0;
        
        System.out.println("Por favor, para evitar fallos en el programa"
                + " no ingrese un multiplo de 6 al iniciar el programa");
        
       do
       {
           System.out.println("Ingrese un numero: ");
            num = s.nextInt();
            if (0!=num%6)
            {
            num2 +=num;    
            acum++;
            }else{
                System.out.println("-----Finalizamos----");
            }
       }while(0!=num%6);
            prom=num2/acum;
            System.out.println("El promedio: "+ prom);
    }
}
    
