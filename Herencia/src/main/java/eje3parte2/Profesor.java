/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eje3parte2;

/**
 *
 * @author dam114
 */
public class Profesor extends Persona {
    
    private String[] asignaturas;
    
    public Profesor(String dni, String nombre, String direccion, int nAsignaturas){
    
        super(dni,nombre,direccion);
        asignaturas = new String[nAsignaturas];
        
    }
    
    
    @Override
    public String mostrar(){
    
        return super.mostrar() + super.getDni();

    }
    
}
