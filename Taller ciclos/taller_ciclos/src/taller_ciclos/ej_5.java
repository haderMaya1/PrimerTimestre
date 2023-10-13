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


/*5. Cálculo del factorial de un número realizado con los
tres tipos de ciclos: Mientras, Haga y para:
*/

public class ej_5 {
    public static void main(String[] args) {
     Scanner teclado=new Scanner(System.in);
     int num=0, factorial=1;
        System.out.println("Ingrese el numero");
     num=teclado.nextInt();
     int num1=num;
     while(num!=0){
         factorial=factorial*num;
         num--;
     }System.out.println("El factorial de " +num1+  " es: " +factorial);
     
      System.out.println("---------------------------------------");
      
     int factorial1=1, num2=0;
      System.out.println("Ingrese el numero");
      num2=teclado.nextInt();
      int num3=num2;
     do{
         factorial1=factorial1*num2;
         num2--;
        }while (num2!=0);
        System.out.println("El factorial de " +num3+  " es: " +factorial);
        
        System.out.println("--------------------------------------");
        int factorial2=1,num4=0;
        System.out.println("Ingrese el numero");
        num4=teclado.nextInt();
        int num5=num4;
        for(num4=num4;num4!=0;num4--){
            factorial2=factorial2*num4;
        }System.out.println("El factorial de " +num5+  " es: "+factorial2);
     
        
    }
}

