/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad04.operaciones.geometricas;

import java.io.IOException;

/**
 *
 * @author Manu
 */
public class Operaciones {
    
    //5.a.  muestraSeno: que llame a pideDouble para obtener un número con decimales y muestre su seno.
    
    public static void muestraSeno() throws IOException{
    double var1=actividad04.introduceDatos.Pregunta.pideDouble("Introduce un valor numerico con decimales");
    System.out.println("Resultado del seno del numero anterior: "+ Math.sin(var1));
    }
    
    public static void muestraCoseno() throws IOException{
    double var1=actividad04.introduceDatos.Pregunta.pideDouble("Introduce un valor numerico con decimales");
    System.out.println("Resultado del coseno del numero anterior: "+ Math.cos(var1));
    }
}
