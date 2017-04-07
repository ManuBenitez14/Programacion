
package actividad04.operaciones;
import actividad04.introduceDatos.Pregunta.*;
import java.io.IOException;


public class Valores {
    
    
    // a. mostrar el numero Pi
    
    public static void muestraPi(){
    System.out.println(Math.PI);
   }
    //b. Mostrar el valor Absoluto
    
    public static void muestraValorAbsoluto() throws IOException{
    double var1=actividad04.introduceDatos.Pregunta.pideDouble("Introduce un valor numerico con decimales");
    double a= Math.abs(var1);
    System.out.println("valor absoluto del numero introducido: "+a);
    
    }

    // c. Mostrar el valor aleatorio
    
    public static void muestraValorAleatorio() throws IOException{
    int var1=actividad04.introduceDatos.Pregunta.pideEntero();
    int r= (int) (Math.random()*var1);
    System.out.println("El número introducido es: "+var1+"y el número aleatorio es: "+r);
    }
    
    
    
    
}