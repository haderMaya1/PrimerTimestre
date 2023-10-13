
package paquete_1;

public class Ejemplo 
{
   private String atributo_Privado;
   int atributo_Defecto;
   protected double atributo_Protegido;
   public char atributo_Publico;
   
   public void mostarNombre()
   {
    atributo_Privado = "Alejandro"; 
       System.out.println(atributo_Privado);
       atributo_Defecto=20;
       atributo_Protegido=10;
       atributo_Publico='s';
   }
   private void mostrarNombre_1()
   {
       atributo_Defecto=15;
   }
}
