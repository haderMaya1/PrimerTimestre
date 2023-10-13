
package metodos;

import java.util.Scanner;




    public class Metodos
    {
     
        private double num1, num2, prod;
       
        public void CalculoProducto(){
            prod = num1 * num2;
            imprimirResultado();
        }
        public void imprimirResultado(){
            System.out.println("El producto es: " +prod);
        }
        public static void main(String[] args) {
            Metodos obj = new Metodos();
            Scanner s = new Scanner (System.in);
            System.out.println("Ingrese numero 1");
            obj.num1 = s.nextDouble();
            System.out.println("Ingrese numero 2");
            obj.num2 = s.nextDouble();
            obj.imprimirResultado();
                   
        }
    }
    

