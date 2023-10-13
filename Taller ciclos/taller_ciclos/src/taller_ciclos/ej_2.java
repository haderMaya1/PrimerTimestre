/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller_ciclos;

import java.util.Scanner;

/*2. Calcular el promedio de notas definitivas de un
grupo de estudiantes. Ingrese nombre, y definitiva.
El programa se detiene cuando el usuario no desee
ingresar mas registros.
*/

/**
 *
 * @author Jader
 */
public class ej_2 {
    public static void main(String[] args) {
           Scanner teclado=new Scanner(System.in);
     double promedio,notas=0,acum=1;
     String nombre;
        
        System.out.println("Ingresar cantidad de estudiantes ");
        double cn=teclado.nextDouble();
        while(acum<=cn){
            System.out.println("Ingrese su nombre");
            nombre=teclado.next();
            System.out.println("Ingrese la nota numero:  "+acum);
            double nota=teclado.nextDouble();
                    notas=nota+nota;
                    acum++;
        }
        promedio=notas/cn;
        System.out.println("El promedio es: " +promedio);
    }
}

 