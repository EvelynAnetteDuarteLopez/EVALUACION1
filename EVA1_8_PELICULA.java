/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_8_pelicula;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA1_8_PELICULA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nombre;
        String genero;
        int duracion;
        String reparto;
        String clasificacion;
        Scanner captu;
        captu = new Scanner(System.in);
        
        
        System.out.println("captura nombre");
        nombre = captu.nextLine();
        System.out.println("captura genero");
        genero = captu.nextLine();
        System.out.println("captura duracion");
        duracion = captu.nextInt();
        System.out.println("captura reparto");
        reparto = captu.nextLine();
        System.out.println("captura clasificacion");
        clasificacion = captu.nextLine();
                
        
        System.out.println(nombre);
        System.out.println(genero);
        System.out.println(duracion);
        System.out.println(reparto);
        System.out.println(clasificacion);
        
        
               
    }
    
}
