/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject2.bibliotecaArrays;

/**
 *
 * @author dam114
 */
public class ArrayBusqueda {
 
    //bueno en este contiene siempre va a ser falsa a no ser de que en una de las iteraciones el valor coincida con el que hemos pasado
    public static boolean contiene(int[] array, int valor){
    
        boolean contiene = false;
        for(int i = 0; i < ArrayUtil.contarElementos(array);i++){
        
            if (array[i] == valor) contiene = true;
        
        }
              
        return contiene;
                
    }    
    
    // misma dinamica pero sacando el valor de i en esta iteracion y si no ps -1
    
    public static int indiceDe(int[] array, int valor){
    
        
      
        for(int i = 0; i < ArrayUtil.contarElementos(array);i++){
        
            if(array[i] == valor){
            
                return i;
            
            }
        
        }
        
        return -1;       
    }  
    
    
    
    // misma que el anterior pero sustituyendo en caso de que haya uno despues de el primero
    
    public static int ultimoIndiceDe(int[] array, int valor){
    
        int ultimoIndex = -1;
        for(int i = 0; i < ArrayUtil.contarElementos(array);i++){
        
            if (array[i] == valor) ultimoIndex = i;
        
        }
              
        return ultimoIndex;
                
    }    
    
    
    
    

    
                
    
    
}
