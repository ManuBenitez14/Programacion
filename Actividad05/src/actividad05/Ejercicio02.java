
package actividad05;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;




public class Ejercicio02 {
    
    public static void main(String[] args) throws IOException{
    
        
        String[][] peliculas = new String[5][4];
        peliculas[0][0] = "Jack Reacher";
        peliculas[0][1] = "8";
        peliculas[0][2] = "7";
        peliculas[0][3] = "10";
        
        peliculas[1][0] = "Los Vengadores";
        peliculas[1][1] = "10";
        peliculas[1][2] = "6";
        peliculas[1][3] = "8";
        
        peliculas[2][0] = "Fast & Furious 8";
        peliculas[2][1] = "4";
        peliculas[2][2] = "6";
        peliculas[2][3] = "5";
        
        peliculas[3][0] = "Interstellar";
        peliculas[3][1] = "3";
        peliculas[3][2] = "5";
        peliculas[3][3] = "7";
        
        peliculas[4][0] = "8 millas";
        peliculas[4][1] = "10";
        peliculas[4][2] = "9";
        peliculas[4][3] = "8";
        
        
        
        
        
        
        boolean salir=false;
        int menu;
        
        
        do {
            System.out.println("Introduzca la operación a realizar del siguiente menú de opciones: \n 1 - Mostrar el nombre de todas las películas almacenadas \n 2 - Mostrar las puntuaciones de una película. \n 3 - Modificar el nombre de una película. \n 4 - Modificar una puntuación de una película.  \n 5- Mostrar la puntuación más alta de una película.\n 6- Pedir un número y mostrar el nombre de aquellas películas donde su puntuación media sea como mínimo el número indicado. \n 7- Salir ");
        menu = pideEntero("Introduzca la operacion a realizar del siguiente menu de opciones");
        
            while (menu<1 || menu>7){
            System.out.println("Error, operacion incorrecta");
            menu = pideEntero("Introduzca la operación a realizar del siguiente menú de opciones: \n 1 - Mostrar el nombre de todas las películas almacenadas \n 2 - Mostrar las puntuaciones de una película. \n 3 - Modificar el nombre de una película. \n 4 - Modificar una puntuación de una película.  \n 5- Mostrar la puntuación más alta de una película.\n 6- Pedir un número y mostrar el nombre de aquellas películas donde su puntuación media sea como mínimo el número indicado. \n 7- Salir  ");
            }
        switch (menu){
            case 1:
                    System.out.println("Mostrar el nombre de todas las peliculas almacenadas");
                    mostrarNombre(peliculas);
                break;
            case 2:
                    System.out.println("Mostrar las puntaciones de una pelicula");
                    muestraPuntuacion(peliculas);
                break;
            case 3:
                    System.out.println("Modificar el nombre de una pelicula");
                    cambiaPeli(peliculas);
                break;
            case 4:
                    System.out.println("Modificar una puntacion de una pelicula");
                    cambiaPuntuacion(peliculas);
                break;
            case 5:
                System.out.println("Mostrar la puntacion mas alta de una pelicula");
                System.out.println("la puntuacion mas alta es :"+maxPuntuacion(peliculas));
                
            case 6:
                System.out.println("Pedir un número y mostrar el nombre de aquellas películas donde su puntuación media sea como mínimo el número indicado.");
                
                break;
            case 7:
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
        
        public static void mostrarNombre(String[][] peliculas) throws IOException {
            for(int k=0; k<peliculas.length;k++ ){
            System.out.println(" nombre:"+peliculas[k][0]);
            }
        
        }
        
        public static int muestraPeliculas(String[][] peliculas) throws IOException{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int opcion;
            
            for(int k=0; k<peliculas.length;k++ ){
            System.out.println((k+1)+" "+peliculas[k][0]);
            }
            System.out.println("Elige 1 pelicula: ");
            String op = br.readLine();
            opcion = Integer.parseInt(op);
            return opcion-1;
        
        }
        
        public static void muestraPuntuacion(String [][] peliculas) throws IOException{
           int peli,i;
           peli = muestraPeliculas(peliculas);
           System.out.println("Puntaciones"); 
           for(i=0;i<peliculas[0].length;i++){
               System.out.println(""+peliculas[peli][i]);
           }
               
       
        }
        
        public static void cambiaPeli(String [][] peliculas) throws IOException{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int peli;
            peli = muestraPeliculas(peliculas);
            System.out.println("Nombre de la nueva pelicula: ");
            peliculas[peli][0]=br.readLine();
            mostrarNombre(peliculas);
            
        
        }
        
        
        public static void cambiaPuntuacion(String[][] peliculas) throws IOException{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int punto;
            
            
            
            int opcion;
            
            for(int k=0; k<peliculas.length;k++ ){
            System.out.println((k+1)+" "+peliculas[k][0]);
            }
            System.out.println("Elige 1 pelicula: ");
            String op = br.readLine();
            opcion = Integer.parseInt(op);
          
            opcion = Integer.parseInt(op);
            System.out.println("¿Que puntacion quieres cambiar?: ");
            op = br.readLine();
            punto = Integer.parseInt(op);
            System.out.println("Introduce la nueva puntuacion: ");
            peliculas [opcion-1][punto] =br.readLine();
            muestraPuntuacion(peliculas);
        }
        
        
        
        public static int maxPuntuacion(String [][] peliculas) throws IOException{
           
            int peli,max,i,num=0;
            peli = muestraPeliculas(peliculas);
            String op = peliculas[peli][1];
            max = Integer.parseInt(op);
            
            for(i=1; i<peliculas[0].length;i++){
                op = peliculas[peli][i];
                num = Integer.parseInt(op);
                if(max<num){
                max=num;
                }   
            
            }
        return max;
        
        
        } 
}      




    
    
    

