/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_16_tipo_hacienda;
import java.util.Scanner;
/**
 *
 * @author invitado
 */
public class EVA1_16_TIPO_HACIENDA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        char tipo;
        Scanner captu = new Scanner (System.in);
        System.out.println("Tipo de persona F ---> FISICA,M ---> MORAL");
        tipo = captu.nextLine().charAt(0);
        System.out.println(tipo);
        //IMPRIMIR EL TIPO DE PERSONA:
        // ""--> CADENA DE TEXTO, ´´--> ES UN CARACTER
        // "F"
        if(tipo =='F'){
            System.out.println("persona fisica");
        }
        System.out.println("tipo de persona moral");
        if(tipo == 'F'){       
        System.out.println("persona moral");
        System.out.println("NO VALIDO");
    }
 }
