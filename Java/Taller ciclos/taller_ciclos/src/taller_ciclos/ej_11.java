/*
11. Elaborar un algoritmo en el cual se da un entero n y se imprime todos 
los números enteros desde n hasta 1
*/


package taller_ciclos;
import java.util.Scanner;

public class ej_11 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n2;
        
        System.out.println("Ingrese un numero: ");
        n2 = s.nextInt();
        
        for (int i = 1; n2 >= i; n2--) {
            System.out.println("Decreyendo: " +n2);
        }
    }
}
