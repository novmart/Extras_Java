/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra_ej2;

import Entidad.Puntos;
import Servicio.PuntosServicie;
import java.util.Scanner;

/**
 *
 * @author novel
 */
public class Extra_Ej2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in); 
      PuntosServicie ps = new PuntosServicie();
      
      Puntos p1 = ps.crearPuntos(); 
      ps.CalcularDistancia(p1); 
      
      
      
      
    }
    
}
