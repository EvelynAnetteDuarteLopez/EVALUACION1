/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_21_meses;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA1_21_MESES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int mes;
        Scanner captu = new Scanner(System.in);
        System.out.println("Captura el numero de meses (1 a 12):");
        mes = captu.nextInt();
        captu.hasNextLine();
        
        if(mes == 1){
            System.out.println("Enero");
    }else if(mes == 2){
        System.out.println("Febrero");
    }else if(mes == 3){
        System.out.println("Marzo");  
    }else if(mes == 4){
        System.out.println("Abril");
    }else if(mes == 5){
        System.out.println("Mayo");
    }else if(mes == 6){
        System.out.println("Junio");
    }else if(mes == 7){
        System.out.println("Julio");
    }else if(mes == 8){
        System.out.println("Agosto");
    }else if(mes == 9){
        System.out.println("Septiembre");
    }else if(mes == 10){
        System.out.println("Octubre");
    }else if(mes == 11){
        System.out.println("Noviembre");
    }else if(mes ==12){
        System.out.println("Diciembre");
    }
    }
    
}
