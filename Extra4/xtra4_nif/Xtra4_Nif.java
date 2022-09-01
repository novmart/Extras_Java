/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xtra4_nif;

import Entidies.Nif;
import Servicie.NifServicie;

/**
 *
 * @author novel
 */
public class Xtra4_Nif {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          System.out.println("-----OBTENCION DE NIF-----");
        NifServicie sn = new NifServicie();
        Nif nf = sn.crearNif();
        sn.mostrar(nf);
    }
    
}
