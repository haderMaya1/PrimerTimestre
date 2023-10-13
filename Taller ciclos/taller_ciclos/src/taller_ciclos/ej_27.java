/*
27. Diseñe un algoritmo que lea un número entero n y, luego, 
solicite los nombres, el sexo y las edades de n personas. Calcule 
y muestre: a) La cantidad de hombres b) La cantidad de 
mujeres c) El promedio de edad de las mujeres y el promedio 
de edad de los hombres d) El nombre y el sexo de la persona de 
mayor edad e) La mujer de menor edad f) El hombre de menor 
edad
 */
package taller_ciclos;

import java.util.Scanner;


public class ej_27 {
    public static void main(String[] args) {
        Scanner teclado=new Scanner (System.in);
        String xnom,nombre, xnom1, xnom2;
        nombre="";
        xnom="";
        xnom1="";
        xnom2="";
        int i=0,n,genero,edad = 0,h=0,m=0,suma=0, suma2=0, sexo=0,sexo1=0;
        int promedio_varones = 0,promedio_mujeres = 0;
        int edadMayor = 0,edadMenor = 0, edadMenor2=0;
        System.out.println("Ingrese el numero de personas");
        n=teclado.nextInt();
        for (int j = 0; j < n ; j++) {
            
        
          System.out.println("Ingrese su  nombre");
          nombre=teclado.next();
          System.out.println("Ingrese el sexo 1 para hombre, 2 para mujer");
          genero=teclado.nextInt();
          System.out.println("Ingrese se edad");
          edad=teclado.nextInt();
          
          if (genero==1) 
            {
                h++;
                suma=suma+edad;
                promedio_varones=suma/h;
            }else 
                 if (genero==2) {
                 m++;  
                 suma2=suma2+edad;
                 promedio_mujeres=suma2/m;
            }
            if(edad > edadMayor)
           {
	    
            edadMayor=edad;
            xnom = nombre;
            sexo=genero;
           }
	 if(genero==1 && edad < edad)
            {
            edadMenor=edad;
            xnom1= nombre;
            
            }else 
             if (genero==2 && edad < edad ) 
            {
                 edadMenor2=edad;
                 xnom2 = nombre;       
            }
         
        }
        
        System.out.println("La cantidad de hombres es: " +h);
        System.out.println("La cantidad de mujeres es: "+m);
        System.out.println("El promedio edad hombres es: "+promedio_varones);
        System.out.println("El promedio edad mujeres es: "+promedio_mujeres);
        System.out.println("El nombre de la persona con mayor edad es "+xnom);
        System.out.println("El sexo de mayor edad es: "+sexo);
        System.out.println("La mujer con menor edad es: "+nombre);
        System.out.println("El hombre con menor edad es: " +nombre);
       
   }
}
 