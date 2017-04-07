/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Manu
 */
public class Ejercicio3 {
     public static void main(String[] args) throws IOException {
    
        BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
         
        System.out.println("Introduce un numero");
        
        String entrada = br.readLine();
        
        int num = Integer.parseInt(entrada);
        
        int resultado = num*10;
        
        System.out.println("multiplicamos por 10 el numero introducido"+resultado);
        
        
        

         
         
         
    
         
    }
}
