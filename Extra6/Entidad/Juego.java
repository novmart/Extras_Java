/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;
//Crear una clase Ahorcado (como el juego), la cual deberá contener como
//atributos, un vector con la palabra a buscar, la cantidad de letras encontradas y la cantidad
//jugadas máximas que puede realizar el usuario. Definir los siguientes métodos con los
//parámetros que sean necesarios:

/**
 *
 * @author novel
 */
public class Juego {

    private String[] palabra;
    private char[] palabraEncontrada;
    private int cantLetras = 0;
    private int oportunidad = 5;

    public Juego(String[] palabra, char[] palabraEncontrada) {
        this.palabra = palabra;
        this.palabraEncontrada = palabraEncontrada;
    }

    public Juego() {
    }

    public String[] getPalabra() {
        return palabra;
    }

    public void setPalabra(String[] palabra) {
        this.palabra = palabra;
    }

    public char[] getPalabraEncontrada() {
        return palabraEncontrada;
    }

    public void setPalabraEncontrada(char[] palabraEncontrada) {
        this.palabraEncontrada = palabraEncontrada;
    }

    public int getCantLetras() {
        return cantLetras;
    }

    public void setCantLetras(int cantLetras) {
        this.cantLetras = cantLetras;
    }

    public int getOportunidad() {
        return oportunidad;
    }

    public void setOportunidad(int oportunidad) {
        this.oportunidad = oportunidad;
    }

    @Override
    public String toString() {
        return "Juego{" + "palabra=" + palabra + ", palabraEncontrada=" + palabraEncontrada + ", cantLetras=" + cantLetras + ", oportunidad=" + oportunidad + '}';
    }

}
