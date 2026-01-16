/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject2.bibliotecaArrays;

/**
 *
 * @author dam114
 */
public class ArrayEstadisticas {
    
    
    
     public static int suma(int[] array){
    
        int sumTotal = 0;
        for(int i = 0; i < ArrayUtil.contarElementos(array);i++){
        
            sumTotal += array[i];
        
        }
              
        return sumTotal;
                
    }    
     
    public static int media(int[] array){
    
        int sumTotal = 0;
        for(int i = 0; i < ArrayUtil.contarElementos(array);i++){
        
            sumTotal += array[i];
        
        }
              
        return sumTotal / ArrayUtil.contarElementos(array);
                
    }    
    
    public static int maximo(int[] array){
    
        int maximo = 0;
        for(int i = 0; i < ArrayUtil.contarElementos(array);i++){
        
            if (array[i] > maximo) maximo = array[i];
        
        }
              
        return maximo;
                
    }    
    
    public static int minimo(int[] array){
    
        int minTotal = 99999;
        for(int i = 0; i < ArrayUtil.contarElementos(array);i++){
        
            if (array[i] < minTotal) minTotal = array[i];
        
        }
              
        return minTotal;
                
    }    
    
    
     
}
