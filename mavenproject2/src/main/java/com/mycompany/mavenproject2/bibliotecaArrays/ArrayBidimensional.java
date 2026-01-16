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
 
    
    
    public static int contarElementos(int[][] array){
    
        int contador = 0;
        for(int i = 0; i < array.length;i++){
        
           for(int e = 0; e < array[i].length;e++){
           
               contador++;
           }
      
        }
              
        return contador;
                
    }
    
     public static int sumTotal(int[][] array){
    
        int sumaTotal = 0;
        for(int i = 0; i < array.length;i++){
        
           for(int e = 0; e < array[i].length;e++){
           
               sumaTotal += array[i][e];
           }
      
        }
              
        return sumaTotal;
                
    }
     
    public static int sumaFila(int[][] array, int fila){
    
        int contador = 0;
        for(int i = 0; i < array[fila].length ;i++){
                
           
               contador += array[fila][i];
           
      
        }
              
        return contador;
                
    } 
    
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
