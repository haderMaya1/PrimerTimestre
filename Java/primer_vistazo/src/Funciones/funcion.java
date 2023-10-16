/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Funciones;

/**
 *
 * @author Jader
 */
public class funcion {
    static int variableGlobal=10;
    
    public static void metodoPruebe(){
        
        int variableMetodo=40;
        for (int i = 0; i < 10; i++) 
        {
            System.out.println("La variable " +i);
            //aqui si existe la variable   
        }
        System.out.println("La variable " +i);
        //aqui ya no existe la variable i
    }
    
    public static void main(String[] args) 
    {
        System.out.println("La variable local vale " +variableMetodo);
        //Aqui ya no existe las variables de metodo
        
        int variableLocal1=20;
        if (variableGlobal==10) 
        {
            int variableLocal2=30;
            System.out.println("La variable local 1 vale "+variableLocal2);
            //Aqui si existe, ya que se ha declarado
        }
        System.out.println("la Variable local 2 vale" +variableLocal2 );
        //Aqui ya no existe la variable 2
        
        System.out.println("La variable local Global vale "+variableGlobal);
        //aqui sigue existiendo
        
        metodoPrueba();
        
    }
    
}
