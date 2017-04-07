
package actividad01;

import java.io.IOException;

/**
 *
 * @author Manu
 */
public class Ejercicio02 {
    public static void main(String[] args) throws IOException {
    
        //tipo de dato boolean de 8 bits de longitud
        boolean esCierto = true;
        System.out.println("Variable de tipo boolean muestra si es verdadero o falso. Ejemplo:"+esCierto);
        
        //tipo de dato char de 2 bytes para almacenar un caracter
        char unaLetra = 'a';
        System.out.println("Variable de tipo char sirve para almacenar un caracter Ejemplo:"+unaLetra);
        
        //tipo de dato short de 2 bytes para almacenar un valor entero
        short numeroCorto = 20;
        System.out.println("Variable de tipo short sirve para almacenar un valor entero Ejemplo:"+numeroCorto);
        
        //Tipo de dato entero de 4 bytes de longitud
        int variableEntera =10;
        System.out.println("Variable tipo int muestra datos enteros de 32 bits. Ejemplo:"+variableEntera);
           
        //tipo de dato long de 8 bytes de longitud
        long enteroLargo = 500;
        System.out.println("variable de tipo long srive para almacenar un valor entero mayor que int. Ejemplo:"+enteroLargo);
        
        //tipo de dato float de 4 bytes de longitud
        float comaPeque  = 30.4F;
        System.out.println("Variable de tipo float sirve para almacenar un valor con coma pequeño. Ejemplo:"+comaPeque);
        
        //tipo de dato Double de 8 bytes de longitud
        double numeroComa = 3.14;
        System.out.println("Variable de tipo double sirve para almacenar un valor decimal. Ejemplo:"+numeroComa);
        
        
        
        
        //Operadores Aritméticos
        short edad = 50;
        int entero = 50;  
        short corto =  (short)(edad+entero);
       
       entero = entero+corto;
       System.out.println("Primero suma edad+entero=100 luego suma entero+corto=150. Resultado:"+entero);
       
       //Operadores relacionales
        int x=8;
	int y=5;
	boolean compara=(x<y);
 	System.out.println("8 es menor que 5:"+compara);
        compara=(x>y);
        System.out.println("8 es mayor que 5:"+compara);
        compara=(x==y);
 	System.out.println("8 es igual que 5:"+compara);
        compara=(x!=y);
        System.out.println("8 es diferente a 5:"+compara);
        compara=(x<=y);
        System.out.println("8 es menor o igual que 5:"+compara);
        compara=(x>=y);
        System.out.println("8 es mayor o igual que 5:"+compara);
        
        //operadores lógicos
        int num_1=10; int num_2 =20; int num_3 =15;
        System.out.println("num_1 es mayor que num_2 y que num_3?");
        System.out.println( (num_1 > num_2) && (num_1>num_3));
        System.out.println("num_1 es mayor que num_2 o que num_3?");
        System.out.println( (num_1 > num_2) || (num_1>num_3));
        System.out.println("num_1 es distinto a num_2");
        System.out.println(num_1 != num_2);
        
        //Operadores unarios
        int resultado = 1;
        
        resultado--;  //resultado vale 0
        System.out.println("1 -1 es :"+resultado);
        
        resultado++;  //resultado vale 2
        System.out.println("1 +1 es :"+resultado);
        
        
        //Operadores de asignacion
        System.out.println("el operador más utilizado es el =,sirve para asignar"
                + "un valor a una variable");
        
        
    
    
    

    
    }
}
