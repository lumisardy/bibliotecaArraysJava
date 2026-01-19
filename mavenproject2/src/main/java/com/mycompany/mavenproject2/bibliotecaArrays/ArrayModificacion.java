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
    
    
    //creo un array con la misma longitud que el recibido, y le copio los valores despues con un bucle
    
    public static int[] copiar(int[] array){
        
        if (array == null) {
            throw new IllegalArgumentException("El array no puede ser null");
        }

        int[] copia = new int[ArrayUtil.contarElementos(array)];

        for (int i = 0; i < ArrayUtil.contarElementos(array); i++) {
            copia[i] = array[i];
        }

        return copia;
                
    }  
    
    //creo un array con la misma longitud que el recibido, y le copio los valores despues con un bucle pero a la inversa, i empieza por el final de el array
    
    public static int[] invertir(int[] array){
    
        if (array == null) {
        throw new IllegalArgumentException("El array no puede ser null");
        }

        int[] copia = new int[ArrayUtil.contarElementos(array)];
        int longitud = ArrayUtil.contarElementos(array);

        for (int i = 0; i < longitud; i++) {
            copia[i] = array[longitud - 1 - i];
        }

        return copia;
                
    }
    
     //creo un array con la suma de los arrays, y cuando acaba uno pues le sigue el otro
    
    public static int[] concatenar(int[] array, int[] array2){
        
        if (array == null || array2 == null) {
            throw new IllegalArgumentException("Ningún array puede ser null");
        }

        int len1 = ArrayUtil.contarElementos(array);
        int len2 = ArrayUtil.contarElementos(array2);

        int[] copia = new int[len1 + len2];

        for (int i = 0; i < len1; i++) {
            copia[i] = array[i];
        }

        for (int i = 0; i < len2; i++) {
            copia[len1 + i] = array2[i];
        }

        return copia;
                
    }
    
    
          
    
    
    
}
