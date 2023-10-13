
package metodos;

import java.util.Scanner;

public class Ej2 
{
        public void operacion (double a, double b){
            double resul;
            resul=a*b;
            System.out.println("El producto es: " +resul);
        }
        public static void main(String[] args) {
        double num1, num2;
        Scanner s = new Scanner (System.in);
            System.out.println("Ingrese el primer numero");
            num1 = s.nextDouble();
            
            System.out.println("Igrese el segundo numero");
            num2= s.nextDouble();
            Ej2 obj= new Ej2();
            obj.operacion(num1, num2);
    }
}
