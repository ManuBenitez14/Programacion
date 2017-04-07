
package actividad04.operaciones.aritmeticas;

import java.io.IOException;


public class Operaciones {
    
    //4.a. muestraLogaritmo(double) que muestre el logaritmo en base E del parámetro.
    
    public static void muestraLogaritmo(double var) throws IOException{
    double log= Math.log(var);
    System.out.println("Resultado : "+log);
    
    }
    
    // 4.b. calculaPotencia(double,double) que muestre el resultado de elevar el primer número al segundo utilizando la función pow de la clase Math.
    
    public static void calculaPotencia(double var1,double var2) throws IOException{
    System.out.println("Resultado de elevar el primer número por el segundo: "+ Math.pow(var1, var2));
    
    }

}
