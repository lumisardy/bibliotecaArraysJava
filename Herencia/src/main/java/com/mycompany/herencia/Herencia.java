/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.herencia;

import Hoja6eje1.Letra;
import eje3.Cilindro;
import fecha.Disco;
import fecha.Libro;
import fecha.Publicacion;
import java.util.Calendar;

/**
 *
 * @author DAM114
 */
public class Herencia {

    public static void main(String[] args) {
       
        /* Ejercicio 3
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
        
        for(Publicacion c : Publicacion.publicaciones){
        
            if(c instanceof Libro && ((Libro) c).getNumPaginas() > 1000 && c.getFecha().MONTH == Calendar.MONTH){
                c.getAutor();
                c.getTitulo();
            } 
        }
        a.toString();
        
       
        
        
        Cilindro c1 = new Cilindro(7,5);
        
        System.out.println(c1.volumen());
         */
        
        
        Letra l1 = new Letra(1,"Marcos",300,2025,10,29);
        Letra l2 = new Letra(2,"Jaime",1300,2027,5,10);
        Letra l3 = new Letra(3,"Pedro",600,2022,12,15);
        Letra l4 = new Letra(4,"Sergio",650,2028,2,30);
        Letra l5 = new Letra(5,"Jose",150,2026,8,8);
        
        
        Letra[] lista = {l1,l2,l3,l4,l5};
        
        for(Letra l : lista){
        
            if(l.vencidas() == true)
                l.toString();
            
            if(l.getFechaVencimiento().get(Calendar.MONTH) == 11){
            
                l.demora(15);
                
            }
            
            if(l.vencidas() == false){
                l.getTitular();
                l.diasFaltan();
            }
        }
        
    }
}
