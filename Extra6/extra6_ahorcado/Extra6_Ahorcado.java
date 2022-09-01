/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra6_ahorcado;

import Entidad.Juego;
import Servicio.JuegoServicie;
import java.util.Scanner;

/**
 *
 * @author novel
 */
public class Extra6_Ahorcado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");

        JuegoServicie sa = new JuegoServicie();
        Juego ahor = sa.crearJuego();
        System.out.println("----- AHORCADO -----");
        sa.juego(ahor);

    }

}
