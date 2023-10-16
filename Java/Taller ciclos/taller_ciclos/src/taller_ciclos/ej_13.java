/*
13. Imprimir los 100 primeros números de Fibonacci
*/
package taller_ciclos;


public class ej_13 {
    public static void main(String[] args) {
        int n3 = 1, n2 = 0, nt = 100, n4;
                
        System.out.println("Los Primeros 100 terminos de la"
                + " Secuencia Fibonacci");
        
        for (int i = 0; i < nt; i++) 
        {
         if (i <= 1)
             n4 = i;
         else
         {
          n4 = n2 + n3;
          n2 = n3;
          n3 = n4;
         }
            System.out.println("\n" + n4);  
        }
    }
}
