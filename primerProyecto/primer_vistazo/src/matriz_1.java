/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jader
 */
public class matriz_1 {
    public static void main(String[] args) {
        //Creacion de la matriz
        int[][] matriz = new int [3][2];
        //Llenado de la matriz
        int[][]matriz1;
        matriz1=new int[3][2];
        //Llenado de la matri
        matriz[0][0]=15;
        matriz[0][1]=10;
        matriz[1][0]=20;
        matriz[1][1]=25;
        matriz[2][0]=27;
        matriz[2][1]=11;
        

        //Imprimir el elemento 25
        System.out.println(matriz[1][1]);
        System.out.println("----------");
        System.out.println("");
        //Crear y llenar al mismo tiempo la matriz
        int[][] matriz2={{200,210},{472,652},{800,355}};
        //Imprima la F=2 c=0
        
        System.out.println("Recorrido de la matriz");
        System.out.println("");
        
        //Recorrer la Matriz (matriz)
        for (int i = 0; i < matriz.length; i++) {
            System.out.println("");
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("");
                System.out.print(" " +matriz[i][j]);
                  
            }
        }
        //obtener el numero de filas de la matriz
            System.out.println("");
            System.out.println("Numero de filas de la matriz");
            System.out.println("");
            int filas=matriz.length;
            System.out.println(filas);
        
        //obtener el numero de columnas
            System.out.println("");
            System.out.println("Numero de columnas");
            System.out.println("");
            int columnas=matriz[0].length;
            System.out.println(columnas);
            
        //Crear una matruz de 3x3 (Matriz cuadrada)
        int[][] matriz3={{200,210,100},{472,652,85},{100,800,355}};
        for (int i = 0; i < matriz3.length; i++) {
            System.out.println("");
            for (int j = 0; j < matriz3[i].length; j++) {
                System.out.print("");
                System.out.print("  " +matriz3[i][j]);
                
            }
        }
        
        //Mostrar la primera fila
        System.out.println("");
        System.out.println("");
        System.out.println("Extraer La primer fila");
        for (int i = 0; i < matriz3.length; i++) {
            System.out.print(" " +matriz3[0][i]);
            
        }
        //Mostrar la primera fila
        System.out.println("");
        System.out.println("");
        System.out.println("Extraer La primer fila");
         for (int i = 0; i < matriz3.length; i++) {
            System.out.print(" " +matriz3[1][i]);
            
        }
         //Mostrar la primera fila
        System.out.println("");
        System.out.println("");
        System.out.println("Extraer La primer fila");
         for (int i = 0; i < matriz3.length; i++) {
            System.out.print(" " +matriz3[2][i]);
            
        }
         //Traer la primera columna
         System.out.println("");
         System.out.println("");
         System.out.println("Primera columna");
         System.out.println("");
         
         for (int i = 0; i < matriz3[0].length; i++) {
             System.out.print(" " +matriz3[i][0]);
            
        }
         //Traer la segunda columna
         System.out.println("");
         System.out.println("");
         System.out.println("Segunda columna");
         System.out.println("");
         
         for (int i = 0; i < matriz3[1].length; i++) {
             System.out.print(" " +matriz3[i][1]);
            
        }
         //Traer la tercera columna
         System.out.println("");
         System.out.println("");
         System.out.println("Tercera columna");
         System.out.println("");
         
         for (int i = 0; i < matriz3[2].length; i++) {
             System.out.print(" " +matriz3[i][2]);
            
         }
         //Mostrar la diagonal
         System.out.println("");
         System.out.println("");
         System.out.println("Mostrar la diagonal");
         
         for (int i = 0; i < matriz3.length; i++){ 
             System.out.print("  "+matriz3[i][i]);
        }
         //Sumar la primera fila
         System.out.println("");
         System.out.println("");
         System.out.println("Suma de la primera fila");
         System.out.println("");
         double sumaFila1=0;
         for (int i = 0; i < matriz3.length; i++) {
             sumaFila1=sumaFila1+matriz3[0][i];       
        }
          System.out.println("La suma es:  "+sumaFila1);
          
         //Sumar la segunda fila
         System.out.println("");
         System.out.println("");
         System.out.println("Suma de la segunda columna");
         System.out.println("");
         double sumaFila2=0;
         for (int i = 0; i < matriz3.length; i++) {
             sumaFila2=sumaFila2+matriz3[1][i];       
        }
          System.out.println("La suma es:  "+sumaFila2);
           
          
           //Sumar la Tercera fila
         System.out.println("");
         System.out.println("");
         System.out.println("Suma de la Tercera fila");
         System.out.println("");
         double sumaFila3=0;
         for (int i = 0; i < matriz3.length; i++) {
             sumaFila3=sumaFila3+matriz3[1][i];       
        }
          System.out.println("La suma es:  "+sumaFila3);
          
           //Sumar la primera columna
         System.out.println("");
         System.out.println("");
         System.out.println("Suma de la primera columna");
         System.out.println("");
         double sumaCol=0;
         for (int i = 0; i < matriz3[0].length; i++) {
             sumaCol=sumaCol+matriz3[i][0];       
        }
          System.out.println("La suma es:  "+sumaCol);
          
             //Sumar la segunda columna
         System.out.println("");
         System.out.println("");
         System.out.println("Suma de la segunda columna");
         System.out.println("");
         double sumaCol1=0;
         for (int i = 0; i < matriz3[1].length; i++) {
             sumaCol1=sumaCol1+matriz3[i][1];       
        }
          System.out.println("La suma es:  "+sumaCol1);
          
             //Sumar la tercera columna
         System.out.println("");
         System.out.println("");
         System.out.println("Suma de la tercera columna");
         System.out.println("");
         double sumaCol2=0;
         for (int i = 0; i < matriz3[2].length; i++) {
             sumaCol2=sumaCol2+matriz3[i][2];       
        }
          System.out.println("La suma es:  "+sumaCol2);
          
          
          //Sumar la Diagonal
         System.out.println("");
         System.out.println("");
         System.out.println("Sumar la diagonal");
         double sumaDia=0;
         
         for (int i = 0; i < matriz3.length; i++){ 
             sumaDia=sumaDia+matriz3[i][i];
        }
         System.out.println("La suma de la diagonal es: " +sumaDia);
         
         //Sumar La matriz
         System.out.println("");
         System.out.println("");
         System.out.println("Sumar la Matriz");
         double sumaMatriz=0;
         
         for (int i = 0; i < matriz3.length; i++) {
             System.out.println(" ");
             for (int j = 0; j < matriz3[i].length; j++) {
              sumaMatriz=sumaMatriz+matriz3[i][j];
                 
             }
        }
         System.out.println("La suma es:  " +sumaMatriz);
    }    
}