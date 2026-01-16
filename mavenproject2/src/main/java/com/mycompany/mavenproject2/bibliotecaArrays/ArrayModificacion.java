/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject2.bibliotecaArrays;

/**
 *
 * @author dam114
 */
public class ArrayModificacion {
    
    public static int[] copiar(int[] array){
    
        int [] copia = new int[ArrayUtil.contarElementos(array)];
        for(int i = 0; i < ArrayUtil.contarElementos(array);i++){
        
           copia[i] = array[i];
        
        }
              
        return copia;
                
    }  
    
    public static int[] invertir(int[] array){
    
        int [] copia = new int[ArrayUtil.contarElementos(array)];
        for(int i = ArrayUtil.contarElementos(array) - 1; i != 0;i++){
        
           copia[i] = array[i];
        
        }
              
        return copia;
                
    }
    
    public static int[] concatenar(int[] array, int[] array2){
    
        int [] copia = new int[ArrayUtil.contarElementos(array) * 2];
        for(int i = 0; i < ArrayUtil.contarElementos(array) * 2 ;i++){
        
           if (i < ArrayUtil.contarElementos(array)) copia[i] = array[i]; else copia[i] = array2[i];
      
        }
              
        return copia;
                
    }
    
    
          
    
    
    
}
