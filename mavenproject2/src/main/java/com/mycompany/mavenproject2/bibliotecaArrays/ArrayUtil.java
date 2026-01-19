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
    
    
    //Bueno esto es un for each que recorre el array y en cada iteracion le voy sumando
    
    public static int contarElementos(int[] array){
    
        int contador = 0;
        for(int a : array){
        
            contador++;
        }
    
        return contador;
    }
    
    // Este le he creado para poder hacer los ejercios de bidimensional sin el lenth por si decias que soy un inutil por usar el lenth, skereeeeeeeeeeeeeeeeeee <3
    public static int contarElementosArrys(int[][] array){
    
        int contador = 0;
        for(int [] a : array) contador++;
        return contador;
    }
    
    // aqui miro con el metodo que e creado si devuelve 0 o no
    
    public static boolean estaVacio(int[] array){
    
        if (ArrayUtil.contarElementos(array) == 0) return true; else return false;
    }
    
    // aqui simplemente miro la posicion 0
    
    public static int obtenerPrimerElemento(int[] array){
    
        return array[0];
    }
    // con el metodo que e creado - 1 comopruebo la ultima posicion
    public static int obtenerUltimoElemento(int[] array){
    
        return array[ArrayUtil.contarElementos(array) - 1];
        
    }
    
    
    
    
    
    
}
