/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_24_califa;
import java.util.Scanner;
/**
 *
 * @author invitado
 */
public class EVA1_24_CALIFA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int califa;
        Scanner captu = new Scanner(System.in);
        System.out.println("captura la calificacion en letra");
        califa = captu.nextInt();
        captu.nextLine();
        if(califa >= 90 && califa <= 100){
            System.out.println("A");
        }else if(califa >= 80 && califa <= 89){
             System.out.println("B");
        }else if(califa >= 70 && califa <=79){
             System.out.println("c");
        }else if(califa >= 60 && califa <=69){
            System.out.println("D");
        }else if(califa >= 0 && califa <= 59){
            System.out.println("F");
        }else
            System.out.println("CALIFICACION INCORRECTA");
           
           
    }
    
}
