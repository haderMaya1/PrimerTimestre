/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller_ciclos;

/**
 *
 * @author Jader
 */

/*4. Imprima y sume la serie de números múltiplos de 3
en el rango cerrado de 3 a 99
*/
public class ej_4 {
    public static void main(String[] args) {
        int n=3, suma=0; 
        while (n<=99){
            System.out.println(n);
            suma=suma+n;
            n=n+3;
            System.out.println("La suma es: " +suma);
        }
    }
}
