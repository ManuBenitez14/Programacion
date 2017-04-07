/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Manu
 */
public class Ejercicio03 {
    public static void main(String[] args) throws IOException{
    
        
        System.out.println("Introduce un numero con 2 decimales");
        BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
        String introducir_num1 = br.readLine();
        float decimal = Float.parseFloat(introducir_num1 );
       
        
        String introducir_num2;

        float decimal1;
    
    do {
        System.out.println("Introduce otro valor decimal que no sea 0:");

        introducir_num2 = br.readLine();

        decimal1 = Float.parseFloat(introducir_num2 );

        } while( decimal1==0);
        float resultado= (decimal / decimal1);
        System.out.println("resultado de dividir el primer numero por el segundo :"+resultado);
    
        
    }
}
