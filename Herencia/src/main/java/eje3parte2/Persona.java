/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eje3parte2;

/**
 *
 * @author dam114
 */
public class Persona {
    private String dni;
    private String nombre;
    private String direccion;
    
    public Persona(String dni, String nombre, String direccion){
    
        this.dni = dni;
        this.nombre = nombre;
        this.direccion = direccion;
        
    }

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    public String mostrar(){
        
        return nombre+"   "+ direccion;
    
        
    }
}
