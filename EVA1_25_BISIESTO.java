/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_25_bisiesto;
import java.util.Scanner;
/**
 *
 * @author invitado
 */
public class EVA1_25_BISIESTO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int year;
        Scanner captu = new Scanner(System.in);
        year= captu.nextInt();
        captu.nextInt();
        //AÑO DIVISIBLE ENTRE 4 --> RESIDUO = 0
        //MODULO -->CALCULO DEL RESIDUO --->%
        int modulo4, modulo100, modulo400;
        modulo4 = year % 4;
        if(modulo4 == 0){
            modulo100 = year % 100;
            if(modulo100 != 0){
                System.out.println("ES BISIESTO");
            }else{
                modulo400 = year % 400;
                if(modulo400 == 0){
                    System.out.println("ES BISIESTO");
                }
            }
            
        }else{
            System.out.println("NO ES BISIESTO");
        }
        
    }
    
}
