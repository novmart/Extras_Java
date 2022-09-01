/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Juego;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author novel
 */
public class JuegoServicie {

    Scanner sc = new Scanner(System.in);
//    Metodo crearJuego(): le pide la palabra al usuario y cantidad de jugadas máxima. Con
//la palabra del usuario, pone la longitud de la palabra, como la longitud del vector.
//Después ingresa la palabra en el vector, letra por letra, quedando cada letra de la
//palabra en un índice del vector. Y también, guarda en cantidad de jugadas máximas, el
//valor que ingresó el usuario y encontradas en 0.

    public Juego crearJuego() {
        Juego j1 = new Juego();

        String palabra = seleccionarPalabra();
        String pal[] = new String[palabra.length()];
        for (int i = 0; i < palabra.length(); i++) {
            pal[i] = palabra.substring(i, i + 1);
        }

        char[] palabraEncontrada = new char[palabra.length()];
        Arrays.fill(palabraEncontrada, '_');
        Juego ahor = new Juego(pal, palabraEncontrada);
        return ahor;

    }

    public String seleccionarPalabra() {
        String[] palabra = {"pizza", "misil", "amnesia", "lavarropa", "muchacho",
            "numero", "recolector", "fecha", "pariente",
            "octubre", "piloto", "leyenda", "diputados",
            "espaguetis", "casarse", "estreno", "enchufe", "abuelo",
            "discoteca", "bostezar", "sofocar"};

        Random rd = new Random();
        return palabra[ThreadLocalRandom.current().nextInt(21)];
    }

//     Método longitud(): muestra la longitud de la palabra que se debe encontrar. Nota:
//buscar como se usa el vector.length.
    public int longitud(Juego j1) {
        String palabarLon = seleccionarPalabra();
        int longi = palabarLon.length();
        System.out.println("La palabra tiene : " + longi + " cantidad de letras. ");
        return longi;
    }

//     Método buscar(letra): este método recibe una letra dada por el usuario y busca sila
//letra ingresada es parte de la palabra o no. También informará si la letra estaba o no.
    public void buscarLetra(Juego j1, char letra) {
        boolean encontro = false;
        for (int i = 0; i < j1.getPalabra().length; i++) {
            if (j1.getPalabra()[i].charAt(0) == letra) {
                Arrays.fill(j1.getPalabraEncontrada(), i, i + 1, letra);
                encontro = true;
                j1.setCantLetras(j1.getCantLetras() + 1);

            }
        }
        mostrarEncontradas(j1.getPalabraEncontrada());
        encontroLetra(j1, encontro);
    }

    public void mostrarEncontradas(char[] encontradas) {
        for (int i = 0; i < encontradas.length; i++) {
            System.out.print(Character.toUpperCase(encontradas[i]) + " ");
        }
        System.out.println("\n");
    }

    public void encontroLetra(Juego j1, boolean encontro) {
        if (!encontro) {
            System.out.println("La letra no se encuentra");
            j1.setOportunidad(j1.getOportunidad() - 1);
        }
    }

    public void juego(Juego j1) {
        System.out.println("La palabra tiene " + j1.getPalabra().length + " letras");
        String salieron = "";
        boolean letraRepetida;
        char[][] dibujo = new char[15][11];
        do {
            letraRepetida = false;
            System.out.println("Tiene " + j1.getOportunidad() + " oportunidades");

            char letra;
            do {

                System.out.print("Ingrese una letra a buscar: ");
                letra = sc.next().charAt(0);
                for (int i = 0; i < salieron.length(); i++) {
                    if (letra == salieron.charAt(i)) {
                        letraRepetida = true;
                        System.out.println("La letra se encuentra repetida\nPerdió una oportunidad\n");
                        j1.setOportunidad(j1.getOportunidad() - 1);
                    }
                }
            } while (letra == ' ');
            if (!letraRepetida) {
                salieron = salieron + letra + "-";
                System.out.println("Letras dichas: " + salieron.toUpperCase());
                buscarLetra(j1, letra);
            }

        } while (j1.getOportunidad() > 0 && j1.getCantLetras() < j1.getPalabra().length || letraRepetida);
        if (j1.getCantLetras() == j1.getPalabra().length) {
            System.out.println("HAS GANADO!!!");
        } else {

            System.out.println("HA PERDIDO!!");
            System.out.print("La palabra era: ");
            for (int i = 0; i < j1.getPalabra().length; i++) {
                System.out.print(j1.getPalabra()[i].toUpperCase());
            }
            System.out.println("");
        }
    }

    public void dibujoAhorcado(Juego j1, char[][] dibujo) {

        switch (j1.getOportunidad()) {
            case 8:
                for (char[] row : dibujo) {
                    Arrays.fill(row, ' ');
                }
                for (int i = 0; i < 15; i++) {
                    if (i < 14) {
                        dibujo[i][1] = '|';
                    }
                    if (i < 11) {
                        dibujo[14][i] = '¯';
                    }
                    if (i > 1 && i < 6) {
                        dibujo[0][i] = '¯';
                    }
                    if (i < 2) {
                        dibujo[i][6] = '|';
                    }
                }
                break;
            case 7:
                for (int i = 2; i < 9; i++) {
                    if (i > 4 && i < 8) {
                        dibujo[2][i] = '¯';
                        dibujo[6][i] = '_';
                    }
                    if (i > 2 && i < 6) {
                        dibujo[i][4] = '|';
                        dibujo[i][8] = '|';
                    }
                    dibujo[2][4] = '/';
                    dibujo[2][8] = '\\';
                    dibujo[6][4] = '\\';
                    dibujo[6][8] = '/';
                }
                break;
            case 6:
                for (int i = 7; i < 12; i++) {
                    dibujo[i][6] = '|';
                }
                break;
            case 5:
                dibujo[9][7] = '\\';
                dibujo[10][8] = '\\';
                break;
            case 4:
                dibujo[9][5] = '/';
                dibujo[10][4] = '/';
                break;
            case 3:
                dibujo[12][7] = '\\';
                dibujo[13][8] = '\\';
                break;
            case 2:
                dibujo[12][5] = '/';
                dibujo[13][4] = '/';
                break;
            case 1:
                dibujo[3][5] = 'º';
                dibujo[3][7] = 'º';
                dibujo[4][6] = 'º';
                dibujo[5][6] = '~';
                break;
            case 0:
                dibujo[3][5] = 'x';
                dibujo[3][7] = 'x';
                dibujo[5][6] = '¬';
                dibujo[14][3] = '\\';
                dibujo[14][9] = '/';
                for (int i = 4; i < 9; i++) {
                    dibujo[14][i] = ' ';
                }
                break;
        }

        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 11; j++) {
                System.out.print(dibujo[i][j]);
            }
            System.out.println("");
        }
    }
}
