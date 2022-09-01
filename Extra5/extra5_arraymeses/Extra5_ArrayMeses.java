/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra5_arraymeses;

import Entidad.Meses;
import SErvicio.MesServicie;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author novel
 */

//5. Crea una clase en Java donde declares una variable de tipo array de Strings que contenga
//los doce meses del año, en minúsculas. A continuación, declara una variable mesSecreto
//de tipo String, y hazla igual a un elemento del array (por ejemplo, mesSecreto = mes[9]. El
//programa debe pedir al usuario que adivine el mes secreto. Si el usuario acierta mostrar
//un mensaje, y si no lo hace, pedir que vuelva a intentar adivinar el mes secreto. Un
//ejemplo de ejecución del programa podría ser este:
//Adivine el mes secreto. Introduzca el nombre del mes en minúsculas: febrero
//No ha acertado. Intente adivinarlo introduciendo otro mes: agosto
//¡Ha acertado!
public class Extra5_ArrayMeses {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        
        MesServicie sm = new MesServicie();
        Meses m = sm.crearMes();
        System.out.println("----- ADIVINE EL MES! -----");
        System.out.print("Ingrese un mes del año para adivinar: ");
        String mesU = sc.nextLine(); 
        sm.adividaElMesSecreto(m, mesU);
        


             
         
        
    }
    
        
        
}
