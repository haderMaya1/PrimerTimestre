/*10. Realice un algoritmo que permita calcular y dar como salida el promedio 
general de una sección, tomando en cuenta que esta compuesta por 25 
estudiantes y que se tiene la nota definitiva de cada uno de ellos
*/
package taller_ciclos;

import java.util.Scanner;

public class ej_10 {
    public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            double not2=0, num=1, prom=0, not=0;
            
            do{
                System.out.println("Ingrese nota");
                not= s.nextDouble();
                not2=not+not2;
                num++;
                
            }while (num<=25);
            System.out.println("El promedio es: " +not2/num);
    }
}
