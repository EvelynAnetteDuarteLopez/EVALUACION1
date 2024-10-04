/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_9_operaciones;

/**
 *
 * @author invitado
 */
public class EVA1_9_OPERACIONES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //OPERACIONES ARITMETICAS
        //inicialiazacion de una variable
        int x = 10; //declaracion y asignacion
        int y = 5;
        //si necesitan muchas variables:
        int suma, resta, mult, div, pot,raiz;
        //suma y resta
        suma = x + y; //operador de suma +
        System.out.println("la suma de x + y");
        System.out.println(suma);
        
        resta = x - y;
        System.out.println("resta de x - y");
        System.out.println(resta);
        
        // multiplicacion
        mult = x * y; //operador de multiplicacion *
        System.out.println("la multiplicacion de x * y");
        System.out.println(mult);
        
        //DIVICIONES
        div = x / y;
        System.out.println("El resultado de la division x (10) / y (5)");
        System.out.println(div);
        x = 5;
        y = 2;
        div = x/y;
        System.out.println("division de 5/2");
        System.out.println(div);
                
                
        double val1 = 5;
        double val2 = 2;
        double resultado;
        resultado = val1/val2;
        System.out.println("division del valor 1 y el valor 2");
        System.out.println(resultado);
                
      
     
        
        
        
        
    }
    
}
