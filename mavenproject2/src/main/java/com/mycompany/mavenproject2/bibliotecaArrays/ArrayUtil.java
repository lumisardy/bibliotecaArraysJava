/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject2.bibliotecaArrays;

/**
 *
 * @author dam114
 */
public class ArrayUtil {
    
    
    public static int contarElementos(int[] array){
    
        int contador = 0;
        for(int a : array){
        
            contador++;
        }
    
        return contador;
    }
    
    
    public static boolean estaVacio(int[] array){
    
        if (ArrayUtil.contarElementos(array) == 0) return true; else return false;
    }
    
    public static int obtenerPrimerElemento(int[] array){
    
        return array[0];
    }
    
    public static int obtenerUltimoElemento(int[] array){
    
        return array[ArrayUtil.contarElementos(array) - 1];
        
    }
    
    
    
    
    
    
}
