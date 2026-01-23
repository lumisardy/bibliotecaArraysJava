/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eje3parte2;

/**
 *
 * @author dam114
 */
public class Alumno extends Persona {
    private int[] notas;
    
    public Alumno(String dni, String nombre, String direccion, int nNotas){
    
        super(dni,nombre,direccion);
        notas = new int[nNotas];
        
    }
    
    @Override
    public String mostrar(){
    
        return super.mostrar() + super.getDni();

    }
    
    
    
}
