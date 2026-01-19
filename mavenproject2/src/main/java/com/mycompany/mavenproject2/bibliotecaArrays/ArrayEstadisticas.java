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
    
    
    // recorro el array y sumo el valor de cada uno a la variable sumTotal
     public static int suma(int[] array){
    
        int sumTotal = 0;
        for(int i = 0; i < ArrayUtil.contarElementos(array);i++){
        
            sumTotal += array[i];
        
        }
              
        return sumTotal;
                
    }    
            
    // recorro el array y sumo el valor de cada uno a una variable y despues lo divido por el numero de valores sumados        
     
    public static int media(int[] array){
    
        int sumTotal = 0;
        for(int i = 0; i < ArrayUtil.contarElementos(array);i++){
        
            sumTotal += array[i];
        
        }
              
        return sumTotal / ArrayUtil.contarElementos(array);
                
    }    
    
    // recorro el array y me quedo con el mayor 
    
    public static int maximo(int[] array){
    
        int maximo = 0;
        for(int i = 0; i < ArrayUtil.contarElementos(array);i++){
        
            if (array[i] > maximo) maximo = array[i];
        
        }
              
        return maximo;
                
    }    
    
    // recorro el array y me quedo con el menor, a no ser de que el numero se pase de 999999999 xd
    
    public static int minimo(int[] array){
    
        int minTotal = 999999999;
        for(int i = 0; i < ArrayUtil.contarElementos(array);i++){
        
            if (array[i] < minTotal) minTotal = array[i];
        
        }
              
        return minTotal;
                
    }    
    
    
     
}
