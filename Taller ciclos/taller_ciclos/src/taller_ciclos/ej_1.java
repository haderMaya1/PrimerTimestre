/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller_ciclos;
/*1. Imprima los números del 1 al 100 de 2 en dos
*/
/**
 *
 * @author Jader
 */
public class ej_1 {
    public static void main(String[] args) {
        int i=0; 
        System.out.println("Los numeros del 1 al 100 de 2 en dos " );
        do{
            System.out.println(i);
            i=i+2;
        }while (i<100);
        System.out.println(i);    
    }
  }
