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
public class Ejercicio04 {
    public static void main(String[] args) throws IOException {
   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   
   String num_escrito;
   String num_escrito2;
   int num1;
   int num2;
   int opera;
   System.out.println("Introduce un numero multiplo de 2");
   num_escrito =br.readLine();
   num1 = Integer.parseInt(num_escrito);
   
   while (num1%2!=0){
   System.out.println("Error, vuelve a introducir un multiplo de 2");
   num_escrito =br.readLine();
   num1 = Integer.parseInt(num_escrito);}
   
   
   System.out.println("Introduce otro numero multiplo de 2");
   num_escrito2 =br.readLine();
   num2 = Integer.parseInt(num_escrito2);
   
   while (num2%2!=0){
   System.out.println("Error, vuelve a introducir un multiplo de 2");
   num_escrito2 =br.readLine();
   num2 = Integer.parseInt(num_escrito2);}
   
   if (num1>num2){
       opera = num2;
       
       while (opera<=num1){
           System.out.println(opera);
           opera++;
           }
   }
        else {
        opera=num1;
            while (opera<=num2){
            System.out.println(opera);
            opera++;
            }
        }
    }
}
