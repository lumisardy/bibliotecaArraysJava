/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fecha;

import java.util.Calendar;

/**
 *
 * @author dam114
 */
public class Publicacion {
    
    String titulo;
    String autor;
    Calendar fecha;
    
    public static Publicacion[] publicaciones;
    
    
    public Publicacion(String titulo, String autor,int ano,int mes, int dia){
    
        this.titulo = titulo;
        this.autor = autor;
        
        Calendar cal = Calendar.getInstance();
        cal.setLenient(false);
        cal.set(ano,mes,dia);
        
        fecha = cal;
        
        
    
    }
    
    
    public void anadirpubli(Publicacion nombre){
    
    
        Publicacion[] array = new Publicacion[publicaciones.length + 1];
        int contador = 0;
        
        
        for(Publicacion a : publicaciones){
        
            array[contador] = a;
            contador++;
        }
    
    }
    
    
    

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public Calendar getFecha() {
        return fecha;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setFecha(Calendar fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Publicacion{" + "titulo=" + titulo + ", autor=" + autor + ", fecha=" + fecha + '}';
    }
    
    
    
    
}
