/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//muestra un saludo al presionar 1 el programa sigue al presionar cualquier 
//tecla diferente de 1 se sale
package ciclos;

/**
 *
 * @author Jader
 */
import java.util.Scanner;

public class mientras {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        boolean seguir=true;
        int x;
        while(seguir==true){
            System.out.println("Hola clase");
            System.out.println("Pulse 1 para seguir"
            + " tecla para terminar el programa");
            x=teclado.nextInt();
            if(x==1){
                seguir=true;              
            }else{
                System.out.println("Fin de la aplicacion");
                seguir=false;
            }
        }
       
          int n=0,s, suma=0;
            boolean seguir1=true;
            s=1;
            while(seguir1==true){
            System.out.println("Hola clase");
            System.out.println("Pulse s para salir"
            + " o ingrese un numero para continuar");
            s=teclado.nextInt();
            n=teclado.nextInt();
            if(s==1){
                seguir1=true;              
            }else{
                suma=suma+n;
                n++;
                System.out.println("Fin de la aplicacion, la suma es: " +suma);
                seguir=false;
            }
        }
        
        
    }
}
