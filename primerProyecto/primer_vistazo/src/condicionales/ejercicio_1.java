/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condicionales;

import java.util.Scanner;

/**
 *
 * @author Jader
 */
public class ejercicio_1 {
    public static void main(String[] args) {
        
        //Diga si una persona es mayor de edad o no
        
        Scanner teclado=new Scanner(System.in);
        String nombre;
        int edad;
        System.out.println("Ingrese su nombre");
        nombre=teclado.next();
        System.out.println("Ingrese su edad");
        edad=teclado.nextInt();
        if(edad>=18){
            System.out.println("Es mayor de edad");
        }
        else {
            System.out.println("Es menor de edad");
        }
        
    }
   
}
