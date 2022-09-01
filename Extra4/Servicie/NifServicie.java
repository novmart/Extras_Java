/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicie;

import Entidies.Nif;
import java.util.Scanner;

/**
 *
 * @author novel
 */
public class NifServicie {
      char[] LETRA = {'T','R','W','A','G','M','Y','F','P','D','X','B',
                    'N','J','Z','S','Q','V','H','L','C','K','F'};
    
    Scanner sc = new Scanner(System.in).useDelimiter("\n");
    
      public Nif crearNif(){
        System.out.print("Ingrese el DNI: ");
        long dni = sc.nextLong();
        char letra = calcularNif(dni);
        Nif nif = new Nif(dni, letra);
        return nif;
    }
      
      public char calcularNif(long dni){
        int posicion = (int) dni%23;
        return LETRA[posicion];
    }
      
      public void mostrar(Nif nif){
        int dif;
        if (String.valueOf(nif.getDni()).length() < 8){
            dif = 8 - String.valueOf(nif.getDni()).length();
            System.out.print("NIF: ");
            for (int i = 0; i < dif; i++) {
                System.out.print("0");
            }
            System.out.println(nif.getDni() + "-"  + nif.getLetra());
        } else{
            System.out.println("NIF: " + nif.getDni() + "-"  + nif.getLetra());
        }
    }
    

    
}
