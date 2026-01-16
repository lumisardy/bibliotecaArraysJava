/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.herencia;

/**
 *
 * @author DAM114
 */
public class Encargado extends Empleado {
    
 
    public Encargado(int sueldo){
    
        super(sueldo);
    }
    
    @Override
    public double getSueldo() {
        return super.getSueldo() * 1.10;
    }
    
    
}
