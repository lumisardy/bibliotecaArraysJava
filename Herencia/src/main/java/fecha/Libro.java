/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fecha;

/**
 *
 * @author dam114
 */
public class Libro extends Publicacion {
    
    int numPaginas;
    
    public Libro(String titulo, String autor,int ano,int mes, int dia,int numPaginas){
        
        super(titulo,autor,ano,mes,dia);
        this.numPaginas = numPaginas;
        
        
        
    
    }

    public int getNumPaginas() {
        return numPaginas;
    }
}
