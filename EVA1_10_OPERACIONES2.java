/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_10_operaciones2;

/**
 *
 * @author invitado
 */
public class EVA1_10_OPERACIONES2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //concatenacion cadenas
        //operador de concatenacion +
        //mismo simbolo con diferentes usos
        
        String nombre = "Evelyn";
        String apellido = "Duarte";
        String nombrecomp;
        //concatenar
        nombrecomp = nombre + " " + apellido;
        System.out.println(nombrecomp);
        
        //IMPRIMIR LOS DATOS
        System.out.println("nombre del usuario" + nombre);
        System.out.println("apellido del usuario" + apellido);
        System.out.println("nombre completo del usuario" + nombrecomp);
        
    }
    
}
