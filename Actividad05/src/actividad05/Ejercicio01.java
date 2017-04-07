
package actividad05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;


public class Ejercicio01 {

    
    public static void main(String[] args) throws IOException {
             
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // pedir 10 puntuaciones y almanenarlas en un array con numeros del 0 al 5
        ArrayList <Integer> numeros = new ArrayList<Integer>();
        
        for(int k=0; k<10;k++){
            System.out.print("Introduce la nota numero:"+k);
            int num = Integer.parseInt(br.readLine());
            numeros.add(num);
        }
        
        boolean salir=false;
        int menu;
        
        
        do {
            System.out.println("Introduzca la operación a realizar del siguiente menú de opciones: \n 1 - Modificar una puntacion \n 2 - Mostrar su puntuacion mas alta \n 3 - Mostrar su puntacion media \n 4 - Mostrar las puntaciones menores  \n 5-Finalizar ");
        menu = pideEntero("Introduzca la operacion a realizar del siguiente menu de opciones");
        
            while (menu<1 || menu>5){
            System.out.println("Error, operacion incorrecta");
            menu = pideEntero("Introduzca la operación a realizar del siguiente menú de opciones: \n 1 - Modificar una puntacion \n 2 - Mostrar su puntuacion mas alta \n 3 - Mostrar su puntacion media \n 4 - Mostrar las puntaciones menores  \n 5-Finalizar ");
            }
        switch (menu){
            case 1:
                    System.out.println("Modificar una puntacion");
                    
                   modificarPuntacion(numeros);
                break;
            case 2:
                    System.out.println("Mostrar su puntuacion mas alta");
                    System.out.println("La puntacion mas alta es: "+valorMasAlto(numeros));
                break;
            case 3:
                    System.out.println("Mostrar su puntacion media");
                    System.out.println("La puntacion media es: "+valorMedio(numeros));
                break;
            case 4:
                    System.out.println("Mostrar las puntaciones menores");
                    valorMenores(numeros);
                break;
            case 5:
                System.out.println("Finalizar");
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

        // 1- Funcion para modificar la puntacion.
        public static int modificarPuntacion(ArrayList <Integer> numeros) throws IOException{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Introduce el numero de la nota para cambiarlo:");
            int num = Integer.parseInt(br.readLine());
            System.out.print("Introduce el nuevo valor");
            int num1 = Integer.parseInt(br.readLine());
            numeros.set(num ,num1);
         
            
            Iterator <Integer> variableIterator = numeros.iterator();
            while(variableIterator.hasNext()){
                Integer numero1 = variableIterator.next();
                System.out.println(numero1);
            }
        return 0;
          
        }
        
        public static int valorMasAlto(ArrayList <Integer> numeros) throws IOException{
            Iterator <Integer> variableIterator = numeros.iterator();
            int max;
            max = numeros.get(1);
            while(variableIterator.hasNext()){
                if (max<variableIterator.next()){
                    max=variableIterator.next();
                
                }
                
                    
                }
        return max;
        } 
        
        public static double valorMedio(ArrayList <Integer> numeros) throws IOException{
            Iterator <Integer> variableIterator = numeros.iterator();
            double medio = 0;
            while(variableIterator.hasNext()){
            medio +=variableIterator.next();
                }
            medio /=10;
        return medio;
        
        
        }
        
        public static void valorMenores(ArrayList <Integer> numeros) throws IOException{
            Iterator <Integer> variableIterator = numeros.iterator();
            int valor;
            System.out.println("Introduce un valor");
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            valor = Integer.parseInt(br.readLine());
            while(variableIterator.hasNext()){
                if (valor>variableIterator.next())
                    System.out.println(variableIterator.next());
            }
               
        }
        
}   
            
            
        
        


