/*8. Genere la tabla de multiplicar de un numero ingresado por el usuario ej: el 
usuario ingresa 2 debería quedar:
2 * 1 hasta llegar a 2 * 10 =
*/
package taller_ciclos;

import java.util.Scanner;

public class ej_8 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int mul=0;
        System.out.println("Ingrese un numero");
        int num=s.nextInt();
        
        for (int i = 1; i <=10; i++) {
            mul=num*i;
            System.out.println(num+ " * " +i+ " = " +mul);
        }
    }
    
}
