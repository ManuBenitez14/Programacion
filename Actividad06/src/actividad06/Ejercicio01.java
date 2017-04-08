/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Manu
 */
public class Ejercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        
        
        boolean salir=false;
        int menu;
        
        
        do {
            System.out.println("Introduzca la operación a realizar del siguiente menú de opciones: \n 1 - Crear una carpeta \n 2 - Crear un nuevo archivo \n 3 - Listar los archivos"
                    + " \n 4 - Mostrar un archivo  \n 5- Modificar un archivo \n 6- Borrar un archivo \n 7- Renombrar un archivo \n 8- Salir");
        menu = pideEntero("Introduzca la operacion a realizar del siguiente menu de opciones");
        
            while (menu<1 || menu>7){
            System.out.println("Error, operacion incorrecta");
            menu = pideEntero("Introduzca la operación a realizar del siguiente menú de opciones: \n 1 - Crear una carpeta \n 2 - Crear un nuevo archivo \n 3 - Listar los archivos"
                    + " \n 4 - Mostrar un archivo  \n 5- Modificar un archivo \n 6- Borrar un archivo \n 7- Renombrar un archivo \n 8- Salir  ");
            }
        switch (menu){
            case 1:
                    System.out.println("Crear una carpeta");
                    
                break;
            case 2:
                    System.out.println("Crear un nuevo archivo");
                    
                break;
            case 3:
                    System.out.println("Listar los archivos");
                    
                break;
            case 4:
                    System.out.println("Mostrar un archivo");
                    
                break;
            case 5:
                System.out.println("Modificar un archivo");
                
                
            case 6:
                System.out.println("Borrar un arhivo");
                
                break;
            case 7:
                System.out.println("Renombrar un archivo");
    
            case 8:
                System.out.println("Salir del programa");
                salir=true;
                break;
        }
        
        }
        while (!salir); 
    }
    
    
    // Funcion para introducir una opcion del menu.
        public static int pideEntero(String text) throws IOException{
             int num = 0;
             boolean repite = true;
             while (repite) {
            try {
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Introduce un numero entero");
                String op = br.readLine();
                num = Integer.parseInt(op);
                repite=false;
            } catch (Exception a) {
                System.out.println("Numero incorrecto, try again");
            }
        }
        return num;
    }
        
}
