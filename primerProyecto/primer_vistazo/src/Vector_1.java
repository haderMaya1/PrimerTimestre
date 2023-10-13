/*
¿Qué es un vector en Java?
En programación, se le denomina vector, formación,
matriz (en inglés array, del cual surge la mala traducción arreglo)
,​ a una zona de almacenamiento contiguo que contiene una serie 
de elementos del mismo tipo, los elementos de la matriz.
 */

public class Vector_1 {
    public static void main(String[] args) {
     //Declarar un vector
     int numeros[] =new int [4];
     
     //Llenara un vector
     numeros[0]=25;
     numeros[1]=45;
     numeros[2]=50;
     numeros[3]=80;
     
     //Imprimir el elemento 80
        System.out.println(numeros[2]);
        System.out.println("------");
        System.out.println(numeros[3]);
        System.out.println("----Todo el vector---");
        //Imprimir todo el vector
        
        for (int i = 0; i < 4; i++){
            System.out.print(" " + numeros[ i ]);

        }
        System.out.println(" ");
        System.out.println("-----Nuevo vector----");
        //Crear vector con elemento Incluidos
        //Tamaño del vector = length
        int[] numeros1={1,12,13,16};
        double suma=0;
        for (int i =0; i < numeros1.length; i++){
            System.out.print("  " + numeros1[i]);
            suma=suma+numeros1[i];
        }
        System.out.println(" ");
        System.out.println("-------");
        System.out.println("Suma del vector  ");
        System.out.println(" ");
        System.out.println("Suma:  " +suma);
        
        
        
    }
    
}
