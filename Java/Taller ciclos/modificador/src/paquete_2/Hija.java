
package paquete_2;

import paquete_1.Ejemplo;

public class Hija extends Ejemplo
{
    String atributo;
    public void prueba(){
        
        Ejemplo obj1 = new Ejemplo();
        Hija h = new Hija();
        System.out.println(obj1.atributo_Publico);
        System.out.println(h.atributo_Protegido);
        System.out.println(h.atributo_Publico);
        
    }
    
    
}
