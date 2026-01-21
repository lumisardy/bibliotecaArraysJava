/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.herencia;

import fecha.Disco;
import fecha.Publicacion;
import java.util.Calendar;
import fecha.publicaciones;

/**
 *
 * @author DAM114
 */
public class Herencia {

    public static void main(String[] args) {
       
        Calendar fhoy = Calendar.getInstance();
        
        
        
        
        Publicacion e = new Publicacion("Paraiso","esteban",fhoy.get(Calendar.YEAR),fhoy.get(Calendar.MONTH),fhoy.get(Calendar.DAY_OF_MONTH));
        
        
        
        Disco a = new Disco("Paraiso","esteban",fhoy.get(Calendar.YEAR),fhoy.get(Calendar.MONTH),fhoy.get(Calendar.DAY_OF_MONTH),249);
        
        
        
        a.toString();
        
        for(Publicaciones e : Publicacion.publicaciones){
        
        }
        
        
    }
}
