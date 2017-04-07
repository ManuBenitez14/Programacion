
package actividad04.main;
import actividad04.introduceDatos.Pregunta;
import java.io.IOException;


public class Ejercicio1 {
    
    public static void main(String[] args ) throws IOException{
    
     boolean salir=false;
        int menu;
        
        
        do {
            System.out.println("Introduzca la operación a realizar del siguiente menú de opciones: \n 1 - muestra el numero Pi \n 2 - Mostrar el valor absoluto de un número \n 3 - muestra el valor aleatorio de un número \n 4 - muestra el logaritmo en base E"
                + " \n 5 - mostrar el resultado de elevar el primer número al segundo \n 6 - mostrar el seno de un número decimal \n 7 - mostrar el coseno de un número decimal \n 8 - Salir");
        menu = actividad04.introduceDatos.Pregunta.pideEntero();
        
            while (menu<1 || menu>8){
            System.out.println("Error, operacion incorrecta");
            System.out.println("Introduzca la operación a realizar del siguiente menú de opciones: \n 1 - muestra el numero Pi \n 2 - Mostrar el valor absoluto de un número \n 3 - muestra el valor aleatorio de un número \n 4 - muestra el logaritmo en base E"
                + " \n 5 - mostrar el resultado de elevar el primer número al segundo \n 6 - mostrar el seno de un número decimal \n 7 - mostrar el coseno de un número decimal \n 8 - Salir");
            menu = actividad04.introduceDatos.Pregunta.pideEntero();
            }
        switch (menu){
            case 1:
                    System.out.println("muestra el numero Pi");
                    actividad04.operaciones.Valores.muestraPi();
                break;
            case 2:
                    System.out.println("Mostrar el valor absoluto de un número");
                    actividad04.operaciones.Valores.muestraValorAbsoluto();
                break;
            case 3:
                    System.out.println("muestra el valor aleatorio de un número");
                    actividad04.operaciones.Valores.muestraValorAleatorio();
                break;
            case 4:
                    System.out.println("muestra el logaritmo en base E");
                    double var = actividad04.introduceDatos.Pregunta.pideDouble("introduce un número");
                    actividad04.operaciones.aritmeticas.Operaciones.muestraLogaritmo(var);
                break;
            case 5:
                    System.out.println("mostrar el resultado de elevar el primer número al segundo");
                    double var1 = actividad04.introduceDatos.Pregunta.pideDouble("introduce un número");
                    double var2 = actividad04.introduceDatos.Pregunta.pideDouble("introduce otro número");
                    actividad04.operaciones.aritmeticas.Operaciones.calculaPotencia(var1,var2); 
                break;
            case 6:
                    System.out.println("mostrar el seno de un número decimal");
                    actividad04.operaciones.geometricas.Operaciones.muestraSeno();
                break;
                
            case 7:
                    System.out.println("mostrar el coseno de un número decimal");
                    actividad04.operaciones.geometricas.Operaciones.muestraCoseno();
                break;
            case 8:
                    System.out.println("salir");
                    salir=true;
                break;
        }
        
        }
        while (!salir);
    
    
}

    
 

    

    
    
    
    
    
    
    
    
    
    
    
    
}
