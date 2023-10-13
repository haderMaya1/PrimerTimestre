/*
16. Ingresa números del 1 al 100, hasta encontrar algún número mayor 
que 10.
*/
package taller_ciclos;

import java.util.Scanner;

public class ej_16 {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        int i; 
        System.out.println("Hola " );
        do{
            System.out.println("Ingrese un numero: ");
            i = s.nextInt();
        }while (i<=10);
        System.out.println("Aqui terminamos, el numero es mayor de 10");
        System.out.println(i);
 }
}
