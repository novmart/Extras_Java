/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Puntos;
import java.util.Scanner;

/**
 *
 * @author novel
 */
public class PuntosServicie {
    Scanner leer = new Scanner(System.in); 
      public Puntos crearPuntos() {
        Puntos p1 = new Puntos();
        
          System.out.println("Escriba dos numeros  : ");
          p1.setX1(leer.nextInt());
          p1.setX2(leer.nextInt());
          
          p1.setY1(p1.getX1());
          p1.setY2(p1.getX2());
          
          return p1; 
          
      }
   
      public double CalcularDistancia(Puntos p1){
          double  d; 
          double P1; 
          double P2; 
          
          P1 =  Math.sqrt(Math.pow(p1.getX2() - p1.getX1(),2)); 
          P2 =  Math.sqrt(Math.pow(p1.getY2()- p1.getY1(),2)); 
          d = P1 + P2 ; 
              System.out.println("La distancia de los puntos es de : " + d);    
          return d; 
      }
    
}
