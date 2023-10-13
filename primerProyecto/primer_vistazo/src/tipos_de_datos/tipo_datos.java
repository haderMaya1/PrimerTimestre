/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tipos_de_datos;

import java.util.Scanner;

/**
 *
 * @author Jader
 */
public class tipo_datos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        boolean sw=true;//La linea finaliza con punto y coma
        System.out.println("Esta es la variable sw "+sw);
        
        char letra='a';
        byte nByte=120;
        int nEntero=215488;
        long nlong=2548756;
        float nFloat=2.3f;
        double nDouble=2.3;
        String texto="clase de algoritmo";
        
        //Ingresar datos por pantalla
        Scanner teclado=new Scanner(System.in);
        
        //Ingresar dos numeros y sumarlos y mostrar la suma
        //Declaracion de las variables
        String nombre;
        int numero1;
        double numero2,suma;
        System.out.println("Ingrese su nombre");
        nombre=teclado.next();
        
        System.out.println("Ingrese el primer numero");
        numero1=teclado.nextInt();
        
        System.out.println("Ingrese el segundo numero");
        numero2=teclado.nextDouble();
        
        //Proceso
        suma=numero1+numero2;
        
        //Mostrar resultado por pantalla
        System.out.println("La suma es" +suma);
       
        
        
        
    }
    
}
