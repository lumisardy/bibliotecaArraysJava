/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hoja6eje1;

import java.util.Calendar;

/**
 *
 * @author dam114
 */
public class Letra {
    private int numLetra;
    private String titular;
    private int importe;
    private Calendar fechaVencimiento;
    
    public Letra(int numLetra, String titular,int importe,int ano, int mes, int dia){
    
           this.importe = importe;
           this.numLetra = numLetra;
           this.titular = titular;
           Calendar cal = Calendar.getInstance();
           cal.setLenient(true);
           cal.set(ano,mes-1,dia);
           
    
    
    }
    
    public boolean vencidas(){
        Calendar hoy = Calendar.getInstance();
        return hoy.after(fechaVencimiento);
    }
    
    public void demora(int dias){
    
        for(int i = 0; i < dias; i++){
        
            if(fechaVencimiento.get(Calendar.DAY_OF_MONTH) > 31){
                
                fechaVencimiento.set(fechaVencimiento.get(Calendar.YEAR),fechaVencimiento.get(Calendar.MONTH) + 1,0);
            
            }
            
            if(fechaVencimiento.get(Calendar.MONTH) > 11){
                
                fechaVencimiento.set(fechaVencimiento.get(Calendar.YEAR) + 1,1,fechaVencimiento.get(Calendar.DAY_OF_MONTH));
            
            }
            
        
        }
    
    }
    
    
    
    public int diasFaltan(){
        Calendar hoy = Calendar.getInstance();
        
        long diferencia = fechaVencimiento.getTimeInMillis() - hoy.getTimeInMillis();
        
        if(diferencia < 0)
            return 0;
        else
            return (int) (diferencia/(1000*60*60*24));
    }

    @Override
    public String toString() {
        return "Letra{" + "numLetra=" + numLetra + ", titular=" + titular + ", importe=" + importe + ", fechaVencimiento=" + fechaVencimiento + '}';
    }

    public int getNumLetra() {
        return numLetra;
    }

    public void setNumLetra(int numLetra) {
        this.numLetra = numLetra;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public int getImporte() {
        return importe;
    }

    public void setImporte(int importe) {
        this.importe = importe;
    }

    public Calendar getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(Calendar fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }
    
    
    
    
}
