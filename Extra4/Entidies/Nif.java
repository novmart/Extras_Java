/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidies;

/**
 *
 * @author novel
 */
public class Nif {
    public long Dni; 
    public char letra; 

    public Nif() {
    }

    public Nif(long Dni, char letra) {
        this.Dni = Dni;
        this.letra = letra;
    }

    public long getDni() {
        return Dni;
    }

    public void setDni(long Dni) {
        this.Dni = Dni;
    }

    public char getLetra() {
        return letra;
    }

    public void setLetra(char letra) {
        this.letra = letra;
    }

    @Override
    public String toString() {
        return "Nif{" + "Dni=" + Dni + ", letra=" + letra + '}';
    }



   
}
