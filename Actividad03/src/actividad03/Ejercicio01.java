
package actividad03;

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
     * @throws java.io.IOException
     */
    public static void main(String[] args ) throws IOException{
       
        boolean salir=false;
        int menu;
        
        
        do {
        menu = pideEntero("Introduzca la operación a realizar del siguiente menú de opciones: \n 1 - Conversor de euros a LIKIA_COINS \n 2 - Divide dos número \n 3 - Multiplica y realiza progresión \n 4 - Salir");
        
            while (menu<1 || menu>4){
            System.out.println("Error, operacion incorrecta");
            menu = pideEntero("Introduzca la operación a realizar del siguiente menú de opciones: \n 1 - Conversor de euros a LIKIA_COINS \n 2 - Divide dos número \n 3 - Multiplica y realiza progresión \n 4 - Salir");
            }
        switch (menu){
            case 1:
                    System.out.println("Conversor de euros a LIKIA_COINS");
                    conversorEuroLinkia();
                break;
            case 2:
                    System.out.println("Divide dos números");
                    divideDosNumeros();
                break;
            case 3:
                    System.out.println("Multiplica y realiza progresión");
                    multiplicaYProgresion();
                break;
            case 4:
                    System.out.println("ha salido");
                    salir=true;
                break;
        }
        
        }
        while (!salir);
     
        
    }
        public static int pideEntero() throws IOException{
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

        public static double pideDouble(String pregunta) throws IOException {

        System.out.println(pregunta);
        double num = 0;
        boolean repite = true;
        while (repite) {
            try {
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

                String op = br.readLine();
                num = Double.parseDouble(op);
                repite=false;
            } catch (Exception e) {
                System.out.println("Numero incorrecto, try again");
            }
        }

        return num;
    }
         public static int pideEntero(String text){
         
             System.out.println(text);
             int num = 0;
             boolean repite = true;
             while (repite){
                 try {
                     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                     String op = br.readLine();
                     num = Integer.parseInt(op);
                     repite=false;
                 } catch (Exception e) {
                     System.out.println("Numero incorrecto, prueba otra vez");
                     
                 }
             }
             
             return num;
         
         }
            public static void conversorEuroLinkia () throws IOException{
            double var1=pideDouble("Introduce un valor numerico con decimales"); 
            double opera;    
            opera = var1 * 0.5;
            System.out.println("Resultado"+opera);
            
            
            }
            public static void divideDosNumeros () throws IOException{
            double var1=pideDouble("Introduce un numero decimal");
            double var2=pideDouble("Ahora Introduce otro numero decimal");
            
            while(var2 ==0){
            var2=pideDouble("Introduce un numero decimal que no sea 0");
            }
            
            double dividir;
            dividir = var1 / var2;
            System.out.println("Resultado: "+dividir);
            
            }
            
            public static void multiplicaYProgresion () throws IOException{
                    int var1=pideEntero("Introduce un valor entero");
                    int var2=pideEntero("Introduce otro valor entero");
                    
                    int opera;
                    opera = var1 * var2;
                    System.out.println("resultado de multiplicar los 2 enteros: "+opera);
                    
                    progresionDescendiente(var1,var2);
                
                
            }
            
            public static void progresionDescendiente (int var1, int var2) throws IOException{
                
                int opera;
                
             if (var1 < var2){
                opera = var2;
       
            while (opera>=var1){
            System.out.println(opera);
            opera--;
                    }
            }
        else {
        opera=var1;
            while (opera>=var2){
            System.out.println(opera);
            opera--;
            }
            
            
        }


            }

}

