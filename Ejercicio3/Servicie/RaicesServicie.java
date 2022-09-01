/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicie;

import Entiadedes.Raices;
import java.util.Scanner;

/**
 *
 * @author novel
 */
public class RaicesServicie {

    Scanner leer = new Scanner(System.in);

    public Raices crearRaices() {
        Raices r1 = new Raices();
        r1.setA(2);
        r1.setB(5);
        r1.setC(2);
        return r1;
    }

    public double getDescriminante(Raices r1) {
        double valor;
        valor = Math.pow(r1.getB(), 2) - 4 * r1.getA() * r1.getC();
        return valor;
    }

    public boolean tieneRaices(Raices r1) {
        double des = getDescriminante(r1);
        boolean solucion;
        solucion = des > 0;
        
        return solucion;
    }

    public boolean tieneRaiz(Raices r1) {
        double uni = getDescriminante(r1);
        boolean solucionU;

        solucionU = uni == 0;
       
        return solucionU;

    }
    
//    Método obtenerRaices(): llama a tieneRaíces() y si devolvió́true, imprime las 2 posibles
//soluciones.
    
    public void obternerRaices(Raices r1){
        boolean raices = tieneRaices(r1); 
        double solucion1; 
        double solucion11; 
        double solucion2; 
        double solucion21; 
        double a = r1.getA(); 
        double b = r1.getB(); 
        double c = r1.getC(); 
        if (raices = true){
            solucion1 = (Math.sqrt(Math.pow(b, 2)- 4*a*c)); 
            solucion11 = (-b/4) + (solucion1/4); 
            System.out.println("La solucion 1 es: " + solucion11);
            solucion2 = (Math.sqrt(Math.pow(b, 2)- 4*a*c)); 
            solucion21 =(-b/4) + (-solucion2/4); 
            
            System.out.println("La solucion 2 es: " + solucion21);
        }
        }
    public void obtenerRaiz(Raices r1){
        boolean raiz = tieneRaiz(r1); 
          double solucion1; 
        double solucion11; 
         double a = r1.getA(); 
        double b = r1.getB(); 
        double c = r1.getC(); 
        if (raiz = true){
           solucion1 = (Math.sqrt(Math.pow(b, 2)- 4*a*c)); 
            solucion11 = (-b/4) + (solucion1/4); 
            System.out.println("La unica solucion es: " + solucion11); 
        }
           
        
        
        
    }
//    Método calcular(): esté método llamará tieneRaices() y a tieneRaíz(), y mostrará por
//pantalla las posibles soluciones que tiene nuestra ecuación con los métodos
//obtenerRaices() o obtenerRaiz(), según lo que devuelvan nuestros métodos y en caso
//de no existir solución, se mostrará un mensaje.
    public void calcular(Raices r1){
        System.out.println("La ecuacion tiene mas de dos soluciones? : " + tieneRaices(r1)); 
        System.out.println("La ecuacion tiene solo una solucion? : " + tieneRaiz(r1)); 
        obtenerRaiz(r1);
        obternerRaices(r1);
        
    }
    
}

   

