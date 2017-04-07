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
public class ejercicio05 {
    public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String num_escrito;
    String SumarDinero;
    String SumarDinero2;
    String RestarDinero1;
    String RestarDinero2;
    String TraspasarDinero;
    
    int opera;
    double cuenta1 = 0;
    double cuenta2 = 0;
    
    do {
        System.out.println("Introduzca la operación a realizar del siguiente menú de opciones:");
        System.out.println("1 - Añadir dinero a la primera cuenta");
        System.out.println("2 - Añadir dinero a la segunda cuenta");
        System.out.println("3 - Quitar dinero de la primera cuenta");
        System.out.println("4 - Quitar dinero de la segunda cuenta");
        System.out.println("5 - Traspasar dinero de la primera cuenta a la segunda cuenta");
        System.out.println("0 - Finalizar");
        
        num_escrito = br.readLine();
        
        opera = Integer.parseInt(num_escrito);
            while (opera<0 || opera>5){
            System.out.println("Error, operacion incorrecta");
            System.out.println("Introduzca operacion");
            num_escrito = br.readLine();
            opera = Integer.parseInt(num_escrito);
            }
        switch (num_escrito){
            case "1":
                    System.out.println("Añadir dinero a la primera cuenta");
                    SumarDinero = br.readLine();
                    double num1 = Double.parseDouble(SumarDinero);
                    cuenta1 += num1;
                    System.out.println("dinero en la primera cuenta: "+cuenta1+"€");
                    System.out.println("dinero en la segunda cuenta: "+cuenta2+"€");
                break;
            case "2":
                    System.out.println("Añadir dinero a la segunda cuenta");
                    SumarDinero2 = br.readLine();
                    double num2 = Double.parseDouble(SumarDinero2);
                    cuenta2 += num2;
                    System.out.println("dinero en la segunda cuenta: "+cuenta2+"€");
                    System.out.println("dinero en la primera cuenta: "+cuenta1+"€");
                break;
            case "3":
                    System.out.println("Quitar dinero de la primera cuenta");
                    RestarDinero1 = br.readLine();
                    double num3 = Double.parseDouble(RestarDinero1);
                    cuenta1 -= num3;
                    System.out.println("Dinero en la primera cuenta: "+cuenta1+"€");
                    System.out.println("dinero en la segunda cuenta: "+cuenta2+"€");
                break;
            case "4":
                    System.out.println("Quitar dinero de la segunda cuenta");
                    RestarDinero2 = br.readLine();
                    double num4 = Double.parseDouble(RestarDinero2);
                    cuenta2 -= num4;
                    System.out.println("Dinero en la segunda cuenta: "+cuenta2+"€");
                    System.out.println("dinero en la primera cuenta: "+cuenta1+"€");
                    break;
            case "5":
                    System.out.println("Traspasar dinero de la primera cuenta a la segunda cuenta");
                    TraspasarDinero = br.readLine();
                    double num5 = Double.parseDouble(TraspasarDinero);
                    cuenta1 -= num5;
                    cuenta2 += num5;
                    System.out.println("Restamos"+num5+"a la primera cuenta: "+cuenta1+"€");
                    System.out.println("Sumamos"+num5+"a la segunda cuenta: "+cuenta2+"€");
                break;
                
                
        }
        }
        
        while (!num_escrito.equalsIgnoreCase("0"));
            System.out.println("Esto es un mensaje de despedida: Gracias por usar este programa");
    
    }
}

