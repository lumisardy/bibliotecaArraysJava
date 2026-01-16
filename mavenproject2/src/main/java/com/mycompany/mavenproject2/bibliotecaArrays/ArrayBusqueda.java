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
 
    
    public static boolean contiene(int[] array, int valor){
    
        boolean contiene = false;
        for(int i = 0; i < ArrayUtil.contarElementos(array);i++){
        
            if (array[i] == valor) contiene = true;
        
        }
              
        return contiene;
                
    }    
    
    public static int indiceDe(int[] array, int valor){
    
        
      
        for(int i = 0; i < ArrayUtil.contarElementos(array);i++){
        
            if(array[i] == valor){
            
                return i;
            
            }
        
        }
        
        return -1;       
    }  
    
    public static int ultimoIndiceDe(int[] array, int valor){
    
        int ultimoIndex = -1;
        for(int i = 0; i < ArrayUtil.contarElementos(array);i++){
        
            if (array[i] == valor) ultimoIndex = i;
        
        }
              
        return ultimoIndex;
                
    }    
    
    
    
    

    
                
    
    
}
