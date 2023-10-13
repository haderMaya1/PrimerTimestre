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

/*3. Sumar los números entre el 3 y el 30
*/
public class ej_3 {
    public static void main(String[] args) {
        int n=3, suma=0;
        while (n<=30){
            System.out.println(n);
            suma=suma+n;
            n++;
        }System.out.println("La suma es: " +suma);
    }
   
}
