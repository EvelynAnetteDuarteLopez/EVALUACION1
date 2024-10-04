/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_13_if;
import java.util.Scanner;
/**
 *
 * @author invitado
 */
public class EVA1_13_IF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //CAPTURA LA EDAD
        int edad;
        Scanner captu;
        captu = new Scanner (System.in);
        System.out.println("Captura la edad:");
        edad = captu.nextInt();
        
        
       //INTRUCCION IF
        // SI (ALGO SE CUMPLE)
        // QUE HAGO SI SE CUMPLE
        // SI NO SE CUMPLE (OPCIONAL) ES FALSO
        // QUE HACEN SI NO SE CUMPLE
        if(edad >= 18){//BLOQUE VERDADERO
        //AQUI VAN LAS INTRUCCIONES SI LA 
        //EVALUACION ES VERDADERO
            System.out.println("Adulto: mayor de edad");
        }else{//bloque falso
            System.out.println("Menor de edad.");
            
        }
    
       
    }
    
}
