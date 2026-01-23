/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fecha;

/**
 *
 * @author dam114
 */
public class Disco extends Publicacion {
    
    int duracionMinutos;
    
    public Disco(String titulo, String autor,int ano,int mes, int dia,int duracionMinutos){
        
        super(titulo,autor,ano,mes,dia);
        this.duracionMinutos = duracionMinutos;
        
        
    
    }

    public int getDuracionMinutos() {
        return duracionMinutos;
    }
    
}
