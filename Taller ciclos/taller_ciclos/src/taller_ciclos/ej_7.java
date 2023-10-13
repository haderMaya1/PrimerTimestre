package taller_ciclos;

import java.util.Scanner;

public class ej_7 {

    public static void main(String[] args) {
        System.out.printf("Ingrese un número natural (>0): ");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        if (n <= 0) {
            System.out.printf("El número debe ser mayor que cero%n");
        } else {
            boolean divisor = false;            
            int i = 2;
            while (i < n && !divisor) {
                if (n % i == 0) {                    
                    divisor = true;
                }
                i++;
            }
            if (!divisor && n >= 1) {
                System.out.printf("El número es primo%n");
            } else {
                System.out.printf("El número no es primo%n");
            }
        }
    }
} 
