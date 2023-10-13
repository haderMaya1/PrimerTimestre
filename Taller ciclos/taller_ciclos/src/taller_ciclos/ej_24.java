/*
24. Diseñe un algoritmo que lea los nombres y las notas de n estudiantes 
y muestre: a) La cantidad de estudiantes ganaron. b) El porcentaje de 
estudiantes que perdieron. c) El nombre del estudiante con la nota 
más alta. d) La nota más alta. e) La nota más baja. f) La nota 
promedio de los estudiantes que ganaron. g) ¿Cuántos estudiantes 
obtuvieron la nota más alta? h) ¿Cuales estudiantes obtuvieron la 
nota más alta, nota mas alta 5?
*/
package taller_ciclos;

import java.text.DecimalFormat;
import java.util.Scanner;


public class ej_24 {
    public static void main(String[] args) {
       Scanner s=new Scanner(System.in);
       String nombre;
       float notas = 0,estudiantes;
       int excelente = 0;
       int aprobado = 0;
       int reprobado = 0;
       System.out.println("ingrese cantidad de estdudiantes");
       estudiantes=s.nextFloat();
       int i = 0;
       int notaMayor,notaMenor,sumaNotas;
       notaMayor = 0;
       notaMenor = 100;
       sumaNotas = 0;
                
                
        for (int j = 0; j < estudiantes; j++) 
        {
              System.out.println("ingrese nombre");
        nombre=s.next();
                System.out.println("ingrese notas");
        notas=s.nextFloat();
        if (notas>=3.0 && notas<=5.0)
        {
            
        excelente++;
        
        }
        else if (notas<=3)
         {
                
            reprobado++;
       
         }
         if(notas > notaMayor)
	 {
	 notaMayor=(int) notas;
	 }
	 if(notas < notaMenor)
	 {
	  notaMenor=(int) notas;
	 }
	}
        System.out.println("ganaron"+excelente);
        System.out.println("reprobaron"+reprobado);
 
	System.out.print("La nota mayor es: " + notaMayor + "\n");
	System.out.print("La nota menor es: " + notaMenor + "\n");
 
		DecimalFormat df = new DecimalFormat("#.00");
 
	System.out.print("El promedio es: " + df.format((double)sumaNotas/estudiantes) + "\n");
	
    }
    
}
