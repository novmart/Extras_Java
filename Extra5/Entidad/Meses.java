/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.Arrays;

/**
 *
 * @author novel
 */
public class Meses {
   private String [] MESES = {"enero" , "febrero" , "marzo" , "abril"
           , "mayo" , "junio" , "julio" , "agosto" ,"septiembre" ,"noviembre" ,"diciembre"}; 

    public Meses() {
    }

    public String[] getMESES() {
        return MESES;
    }

    public void setMESES(String[] MESES) {
        this.MESES = MESES;
    }

    @Override
    public String toString() {
        return "Meses{" + "MESES=" + Arrays.toString(MESES) + '}';
    }
  
    
}
