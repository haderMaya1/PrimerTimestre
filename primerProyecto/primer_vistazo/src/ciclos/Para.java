/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ciclos;
//sumar los numeros del 1 al 5

import java.util.Scanner;

/**
 *
 * @author Jader
 */
public class Para {
    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
          int i;
        double suma=0;
        for(i=1;i<=5;i++){
            suma=suma+i;
            System.out.println(i);
        }
        System.out.println(" ******************");
        System.out.println("El resultado es  " +suma);
    }
}
