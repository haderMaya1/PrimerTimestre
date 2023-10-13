/*
28. Diseñe un algoritmo que lea las notas de n estudiantes y 
muestre cuantos estudiantes tienen una nota entre 3.5 y 4.5
 */
package taller_ciclos;

import java.util.Scanner;

public class ej_28 {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        int notas, cantidad=0;
        double nota1=0;
        String nombre;
        
        
        System.out.println("Ingrese cantidad de estudiantes");
        notas = s.nextInt();
        for (int i = 1; i <= notas; i++) 
        {
            System.out.println("Ingrese su nombre");
            nombre = s.next();
            System.out.println("Ingrese nota n"+ i);
            nota1 = s.nextDouble();
            
            
            if (nota1 >= 3.5 && nota1 <= 4.5)
            {
                cantidad++;
            }

        }
           System.out.println("El numero de personas que sacaron"
                        + "el promedio de 3,5 a 4,5 es: " +cantidad);
    }
}
