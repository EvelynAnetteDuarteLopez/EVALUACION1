/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_19_operador_or;
import java.util.Scanner;
/**
 *
 * @author invitado
 */
public class EVA1_19_OPERADOR_OR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int km,meses; 
       
        
        Scanner captu = new Scanner(System.in);
        System.out.println("Introduce los kilometraje");
        km = captu.nextInt();
        captu.nextLine();
        System.out.println("Captura los meses");
        meses = captu.nextInt();
        captu.nextLine();
        if (km >= 5000|| meses >=6){
        System.out.println("Cambio de aceite!!");
    }else{
            System.out.println("todo bien con el vehiculo");
            }
        
    }
    
}
