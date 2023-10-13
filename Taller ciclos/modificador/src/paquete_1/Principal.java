
package paquete_1;
import paquete_2.Hija;

public class Principal {
    
    
    public static void main(String[] args) {
        Ejemplo obj=new Ejemplo();
        obj.atributo_Defecto=2;
        obj.atributo_Protegido=1;
        obj.atributo_Publico='1';
        obj.mostarNombre();
        
        Hija h1=new Hija();
    }
}
