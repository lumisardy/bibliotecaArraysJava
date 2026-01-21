/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.herencia;

import fecha.Disco;
import fecha.Publicacion;
import java.util.Calendar;

/**
 *
 * @author DAM114
 */
public class Herencia {

    public static void main(String[] args) {
       
        Calendar fhoy = Calendar.getInstance();
        
        
        
        
        Publicacion e = new Publicacion("Paraiso","esteban",fhoy.get(Calendar.YEAR),fhoy.get(Calendar.MONTH),fhoy.get(Calendar.DAY_OF_MONTH));
        
        
        
        Publicacion a = new Disco("Paraiso","esteban",fhoy.get(Calendar.YEAR),fhoy.get(Calendar.MONTH),fhoy.get(Calendar.DAY_OF_MONTH),249);
        
        a.anadirpubli(a);
        e.anadirpubli(e);
        
        int mayorDuracion = 0;
        String letrasAut = "";
        String letrasTitu = "";
        for(Publicacion c : Publicacion.publicaciones){
        
            if(c instanceof Disco){
                
                if(mayorDuracion < ((Disco) c).getDuracionMinutos())
                
                    mayorDuracion = ((Disco) c).getDuracionMinutos();
                    
            }
        }
        
        for(Publicacion c : Publicacion.publicaciones){
        
            if(((Disco) c).getDuracionMinutos() == mayorDuracion){
            
                
                
                
                for(int i = 0;i < 3;i++){
                    
                        letrasAut += c.getAutor().charAt(i);
                    
                    }
                for(int i = 0;i < 3;i++){
                    
                        letrasTitu += c.getTitulo().charAt(i);
                    
                    }
               
                
            } 
        
        }
        
        
        

        
        
       
        
        
        
        a.toString();
        
        
        
        
    }
}
