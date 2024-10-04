/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_11_conversiones;
import java.util.Scanner;
/**
 *
 * @author invitado
 */
public class EVA1_11_CONVERSIONES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //CONVERSIONES DE TEMPERATURA
        double fahr, cent,kelv;
        Scanner captu = new Scanner (System.in);
        
        System.out.println("captura los °Fahrenheit:" );
        fahr = captu.nextDouble();
        cent = (fahr - 32) / 1.8; //expresion
        System.out.println("Â°c=" + cent);
        
        System.out.println("captura los °centigrados:");
        cent = captu.nextDouble();
        fahr = (cent * 1.8)+ 32;
        System.out.println("Â°c = + fahr");
        
        System.out.println("captura los °centigrados");
        cent = captu.nextDouble();
        kelv = cent + 273.15;
        System.out.println("Â°c = + kelv");
        
        
                
    }
    
}
