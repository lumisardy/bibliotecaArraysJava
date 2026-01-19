/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject2.bibliotecaArrays;

/**
 *
 * @author DAM114
 */
public class ArrayBidimensional {
 
    
    // bucle anidado para recorrer y sumo +1 al contador
    public static int contarElementos(int[][] array){
    
        int contador = 0;

        for(int i = 0; i < ArrayUtil.contarElementosArrys(array);i++){
        
           for(int e = 0; e < ArrayUtil.contarElementos(array[i]);e++){
           
               contador++;
           }
      
        }
              
        return contador;
                
    }
    
    // bucle anidado para recorrer y sumo cada valor al contador
    
    public static int sumTotal(int[][] array){
    
        int sumaTotal = 0;
        for(int i = 0; i < ArrayUtil.contarElementosArrys(array);i++){
        
           for(int e = 0; e < ArrayUtil.contarElementos(array[i]);e++){
           
               sumaTotal += array[i][e];
           }
      
        }
              
        return sumaTotal;
                
    }
    
    // bucle para recorrer la fila solicitada y sumo cada valor
     
    public static int sumaFila(int[][] array, int fila){
    
        int contador = 0;
        for(int i = 0; i < array[fila].length ;i++){
                
           
               contador += array[fila][i];
           
      
        }
              
        return contador;
                
    } 
    
    // bucle anidado para recorrer y sumo cada valor si concide con el valor de columna introducido
    
    public static int sumaColumna(int[][] array, int columna){
    
        int contador = 0;
        for(int i = 0; i < array.length ;i++){
        
           for(int e = 0; e < array[i].length;e++){
           
               if(e == columna) contador += array[i][e];
           }
      
        }
              
        return contador;
                
    } 
    
    
    
    
    
    
}
