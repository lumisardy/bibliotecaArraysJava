/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eje3;

/**
 *
 * @author dam114
 */
public abstract class cono extends Figura {
    
    
    
    public cono(double radio, double altura){
        super(radio,altura);
    
    }
    
    private double generatriz(){
        return Math.sqrt( Math.pow(radio,2) + Math.pow(altura,2));
    
    }
    
    @Override
    public double area(){
        return Math.PI* radio* (radio + generatriz()); 

    } 
    
    @Override
    public double volumen(){
        return (Math.PI * Math.pow(radio,2) * altura ) / 3;
    
    }
    
}
