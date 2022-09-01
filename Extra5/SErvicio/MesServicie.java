/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SErvicio;

import Entidad.Meses;
import java.util.Scanner;

/**
 *
 * @author novel
 */
public class MesServicie {
     Scanner sc = new Scanner(System.in).useDelimiter("\n");
    
    public Meses crearMes(){
        Meses m = new Meses();
        return m;
    }
    
       public String mesSecreto(Meses m){
           String mesS = m.getMESES()[9];
           
        return mesS; 
    }
       
       //while (!entradaTeclado.equals(meSecreto)){
//            System.out.println("No ha acertado. Intente adivinarlo introduciendo otro mes");
//            entradaTeclado = sc.nextLine();
//        }
//        System.out.println("¡Ha acertado!");
    
       public void adividaElMesSecreto(Meses m , String mesU){
           
           while(!mesU.equals(mesSecreto(m))){
               System.out.println("No ha acertado. Intente adivianar de nuevo con otro mes: ");
               mesU = sc.nextLine(); 
           }
           System.out.println("¡Ha acertado!");
//           if(mesU.equals(mesSecreto(m))){
//               System.out.println("Has Acertado!!");
//           }else{
//               System.out.println("No adivinaste; Intentalo de nuevo: ");
//               String mes = sc.next(); 
//               adividaElMesSecreto(m, mesU);
//           }
       }
       
}
