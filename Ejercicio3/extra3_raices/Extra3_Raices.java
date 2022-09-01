/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra3_raices;

import Entiadedes.Raices;
import Servicie.RaicesServicie;
import java.util.Scanner;

/**
 *
 * @author novel
 */
public class Extra3_Raices {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in); 
        
        RaicesServicie rs = new RaicesServicie(); 
        Raices r1 = rs.crearRaices(); 
        rs.getDescriminante(r1); 
        rs.tieneRaices(r1); 
       boolean i = rs.tieneRaiz(r1); 
        
        if (i = true){
            rs.obtenerRaiz(r1);
        }
        rs.obternerRaices(r1);
        
       
        rs.calcular(r1);
    }
    
}
