/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_5_entrada_datos;
import java.util.Scanner;
/**
 *
 * @author invitado
 */
public class EVA1_5_ENTRADA_DATOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nombre;
        
        //CAPTURA DE DATOS DE TECLADO;
        //Scanner = herramienta (clase)
        //Scanner: es un tipo de dato
        Scanner captu; //incorporar la herramienta al codigo
        //no existe, hay que crearla
        captu = new Scanner(System.in);//creamos la herramienta Scanner
        
        //DARLE LA INSTRUCCION AL USUARIO
        System.out.println("INTRODUCE TU NOMBRE COMPLETO:");
        //capturar (asignar un valor a la variable)
        nombre = captu.nextLine();//captura texto
                                  //hasta que presiona "enter"
        //IMPRIMIR LOS DATOS
        System.out.println();
        System.out.println(nombre);
    }
    
}
