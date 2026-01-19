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
        
            if(numAnt > array[i]) ordenado = false; else numAnt = array[i];
            
                
           
      
        }
              
       return ordenado;
                
    } 
    
    
    // Esta forma de ordenacion se llama buble short y en lo que consiste es coger los dos primero elementos compararlos y moverlos en caso de que la condicion se cumpla
    
    public static int[] ordenarAsc(int[] array){
    
        
        int expedition33 = 0;
        for(int e = 0; e < ArrayUtil.contarElementos(array);e++){
            for(int i = 1; i < ArrayUtil.contarElementos(array);i++){

                if(array[i - 1] > array[i]){

                    expedition33 = array[i -1];
                    array[i-1] = array[i];
                    array[i] = expedition33;
                }
            }
        }
              
       return array;
                
    } 
    
    public static int[] ordenarDesc(int[] array){
    
        
        int ligadeleyendas = 0;
        for(int e = 0; e < ArrayUtil.contarElementos(array)-1;e++){
            for(int i = 1; i < ArrayUtil.contarElementos(array)-1;i++){

              if(array[i - 1] < array[i]){

                  ligadeleyendas = array[i -1];
                  array[i-1] = array[i];
                  array[i] = ligadeleyendas;
              }




            }   
        }

       return array;
                
    }
    

    
}
