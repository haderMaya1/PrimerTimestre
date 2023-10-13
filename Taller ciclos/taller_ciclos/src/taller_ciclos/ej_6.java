/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller_ciclos;

import java.util.Scanner;

/**
 *
 * @author Jader
 */

/*6. Leer números y muestra su suma hasta que el usuario pulse S para terminar
*/
public class ej_6 {
    public static void main(String[] args) {
        Scanner tl = new Scanner(System.in);
        double suma=0,n=0;
        String salir = "n";
        
        while (!salir.equals("s")){
            System.out.println("Ingresa un numero");
            n = tl.nextDouble();
            
            System.out.println("¿Desea continuar? S/N");
            salir = tl.next();
            
            suma=suma+n;
        }
        System.out.println("La suma de los numeros es: "+suma);
                    
    }
}
