/*
19. Imprimir hola cada vez que un numero sea menor a 5
 */
package taller_ciclos;

import java.util.Scanner;

public class ej_19 {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        String c = "Hola";
        int num;
        
        do 
        {
            System.out.println("ingrese un numero");
            num=s.nextInt();
            num++; 
            System.out.println(c);
        
        }while (num<=5);
        
    }
}
