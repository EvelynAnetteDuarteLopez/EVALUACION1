/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_7_captura_auto;
import java.util.Scanner;
/**
 *
 * @author invitado
 */
public class EVA1_7_CAPTURA_AUTO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String marca;
        String modelo;
        int year;
        double precio;
        Scanner captu;
        captu = new Scanner(System.in);
        
        System.out.println("captura la marca");
        marca = captu.nextLine();
        System.out.println("captura el modelo");
        modelo = captu.nextLine();
        System.out.println("captura el precio");
        precio = captu.nextDouble();
        System.out.println("captura el year");
        year = captu.nextInt();
        
        
        System.out.println("DATOS IMPRIMIDOS");
        System.out.println(marca);
        System.out.println(modelo);
        System.out.println(precio);
        System.out.println(year);
               
    }
    
}
