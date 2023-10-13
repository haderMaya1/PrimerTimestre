/*

 */
package taller_ciclos;

import java.util.Scanner;


public class ej_30 {
    public static void main(String[] args) {
      Scanner teclado=new Scanner (System.in);
      int num;
      
      System.out.println("ingrese un numero");
      num=teclado.nextInt();
      for(int i=1; i<=num; i++)
      {
        int count=0;
          for(int j=1; j<=i; j++)
          {
	  if(i%j==0)
          {
	  count++;
	  }
          }
	  if(count==2)
          {
	   System.out.println(i);
	  }
      }   
    }
}
