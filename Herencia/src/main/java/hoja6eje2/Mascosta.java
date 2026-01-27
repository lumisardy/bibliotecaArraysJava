/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja6eje2;

import java.util.Calendar;

/**
 *
 * @author dam114
 */
public class Mascosta {
    
    private String nombre;
    private Calendar fechaNacimiento;
    
    
    public Mascosta(String nombre,int ano, int mes, int dia){
        
        this.nombre = nombre;
        Calendar cal = Calendar.getInstance();
        cal.setLenient(false);
        cal.set(ano,mes-1,dia);
    }
    
    public int getEdad(){
    
        Calendar hoy = Calendar.getInstance();
        long diferencia =  hoy.getTimeInMillis() - fechaNacimiento.getTimeInMillis();
        return (int) (diferencia/(1000*60*60*24*30*12));
    }

    @Override
    public String toString() {
        return "Mascosta{" + "nombre=" + nombre + ", fechaNacimiento=" + fechaNacimiento + '}';
    }
    
    
    
    
}

