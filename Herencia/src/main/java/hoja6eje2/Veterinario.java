/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja6eje2;
import hoja6eje2.Mascosta;
/**
 *
 * @author dam114
 */
public class Veterinario {
    
    private int contador;
    Mascosta[] mascotas ;
    
    public Veterinario(){
    
        contador = 0;
        mascotas = new Mascosta[50];
    }
    
    public void anadir(Mascosta mascota){
    
        mascotas[contador] = mascota;
        contador++;
    }

    public String mostrarMayores(){
    
        String cadena = "";
        for(Mascosta m : mascotas){
        
            if(m.getEdad() > 5){
                cadena += "nombre:"+m.getNombre()+" nacio: "+m.getFechaNacimiento();
            }
           
                
        }
        return cadena;
    }
    
    @Override
    public String toString() {
        return "Veterinario{" + "contador=" + contador + ", mascotas=" + mascotas + '}';
    }
    
    
}
