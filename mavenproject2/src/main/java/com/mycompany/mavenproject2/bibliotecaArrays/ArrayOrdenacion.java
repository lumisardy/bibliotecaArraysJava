/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject2.bibliotecaArrays;

/**
 *
 * @author DAM114
 */
public class ArrayOrdenacion {
 
    
    public static boolean estaOrdenadoAsc(int[] array){
    
        boolean ordenado = true;
        int numAnt = array[0];
        
        for(int i = 1; i < ArrayUtil.contarElementos(array);i++){
        
            if(numAnt > array[i])
                ordenado = false;
            else{
                numAnt = array[i];
            }
                
           
      
        }
              
       return ordenado;
                
    } 
    
    public static int[] ordenarAsc(int[] array){
    
        
        int temp = 0;
        
        for(int i = 1; i < ArrayUtil.contarElementos(array);i++){
        
          if(array[i - 1] > array[i]){
              
              temp = array[i -1];
              array[i-1] = array[i];
              array[i] = temp;
          }
            
                
           
      
        }
              
       return array;
                
    } 
    
    public static int[] ordenarDesc(int[] array){
    
        
        int temp = 0;
        for(int e = 0; e < ArrayUtil.contarElementos(array)-1;e++){
            for(int i = 1; i < ArrayUtil.contarElementos(array)-1;i++){

              if(array[i - 1] < array[i]){

                  temp = array[i -1];
                  array[i-1] = array[i];
                  array[i] = temp;
              }




            }   
        }

       return array;
                
    }
    
    
}
