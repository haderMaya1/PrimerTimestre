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
public class haga_mientras1 {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        int i=1;
        double suma=0;
        do{
            suma=suma+i;
            i++;
            System.out.println(i);
            System.out.println(suma);
        }while(i<=5);
        System.out.println("La suma es;  "+suma);
    }
    
}
