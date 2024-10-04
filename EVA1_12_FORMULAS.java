/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_12_formulas;
import java.util.Scanner;
/**
 *
 * @author invitado
 */
public class EVA1_12_FORMULAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double distancia, velinicial, tiempo, aceleracion;
       Scanner captu = new Scanner (System.in);
       
       System.out.println("velocidad inicial: ");
       velinicial = captu.nextDouble();
       System.out.println("aceleracion: ");
       aceleracion = captu.nextDouble();
       System.out.println("tiempo: ");
       tiempo = captu.nextDouble();
       
       distancia = velinicial * tiempo + (aceleracion * tiempo)/2.0;
       
       System.out.println("distancia = " + distancia);
      
    }
    
}
