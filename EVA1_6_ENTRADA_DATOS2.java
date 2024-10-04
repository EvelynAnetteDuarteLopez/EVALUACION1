/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_6_entrada_datos2;
import java.util.Scanner;
/**
 *
 * @author invitado
 */
public class EVA1_6_ENTRADA_DATOS2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nombre;
        String curp;
        int edad;
        double promedio;
        //CREAR EL SCANNER
        Scanner captu;
        captu = new Scanner(System.in);
        //capturar
        System.out.println("captura tu nombre completo");
        nombre = captu.nextLine();
        System.out.println("captura la curp");
        curp = captu.nextLine();
        System.out.println("captura la edad");
        edad = captu.nextInt();
        System.out.println("captura el promedio");
        promedio = captu.nextDouble();
        //impresion
        System.out.println("SECCION DE IMPRESION DE DATOS");
        System.out.println(nombre);
        System.out.println(curp);
        System.out.println(edad);
        System.out.println(promedio);
        
    }
    
}
