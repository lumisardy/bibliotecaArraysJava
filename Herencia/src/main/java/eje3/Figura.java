/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eje3;

/**
 *
 * @author dam114
 */
public abstract class Figura {
    
    double radio;
    double altura;
    
    public Figura(double radio, double altura){
    
        this.radio = radio;
        this.altura = altura;
        
    
    }
    
    
    public abstract double area();
    public abstract double volumen();

    public double getRadio() {
        return radio;
    }

    public double getAltura() {
        return altura;
    }
    
}
