/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_20_if_else_anidado;
import java.util.Scanner;
/**
 *
 * @author invitado
 */
public class EVA1_20_IF_ELSE_ANIDADO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int diaSem;
        Scanner captu = new Scanner(System.in);
        System.out.println("Captura el numero del dia (1 a 7):");
        diaSem = captu.nextInt();
        captu.hasNextLine();
        
        if(diaSem == 1){
            System.out.println("Domingo");
        }else if(diaSem == 2){
            System.out.println("Lunes");
        }else if(diaSem == 3){
            System.out.println("Martes");
        }else if(diaSem == 4){
            System.out.println("Miercoles");
        }else if(diaSem == 5){
            System.out.println("Jueves");
        }else if(diaSem == 6){
            System.out.println("Viernes"); 
        }else if(diaSem == 7){
            System.out.println("Sabado");
        }
    }
    
}
