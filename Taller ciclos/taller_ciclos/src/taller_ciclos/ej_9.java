package taller_ciclos;

import java.util.Scanner;

/*
9. Genere las tablas de multiplicar de un número ingresado por el usuario así:
si ingresa 2. se generan dos tablas la del 1 y la del 2 cada tabla hasta el 9
*/
public class ej_9 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Ingrese un numero");
        int num=s.nextInt();
        
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= 9 ; j++) {
                System.out.println(i+" * "+j+" = "+(i*j));
            }
        }
        
        
    }
}
