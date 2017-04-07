/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad02;

/**
 *
 * @author Manu
 */
public class Ejercicio02 {
        public static void main(String[] args) { 
            double botella1 = 1.0;
            double botella2 = 0.5;
            double botella3 = 0.8;
            
            
            System.out.println("La botella 1 contiene:" +botella1+ "litros");
            System.out.println("La botella 2 contiene: "+botella2+ "litros");
            System.out.println("La botella 3 contiene: "+botella3+ "litros");
            
            
            
            System.out.println("Pasamos 0.5 litros de refresco de la primera botella a la segunda");
            
            double botella11 = botella1 - 0.5;
            double botella22 = botella2 +0.5;
            
            System.out.println("La botella 1 contiene:" +botella11+ "litros");
            System.out.println("La botella 2 contiene: "+botella22+ "litros");
            System.out.println("La botella 3 contiene: "+botella3+ "litros");
            
            System.out.println("Pasamos 0.3 litros de refresco de la segunda botella a la tercera");
            
            double botella222 = botella22 - 0.3;
            double botella33 = botella3 + 0.3;
            
            System.out.println("La botella 1 contiene:" +botella11+ "litros");
            System.out.println("La botella 2 contiene: "+botella222+ "litros");
            System.out.println("La botella 3 contiene: "+botella33+ "litros");
            
            System.out.println("Pasamos 0.4 litros de refresco de la tercera botella a la primera");
            
            double botella333 = botella33 - 0.4;
            double botella111 = botella11 +0.4;
            
            System.out.println("La botella 1 contiene:" +botella111+ "litros");
            System.out.println("La botella 2 contiene: "+botella222+ "litros");
            System.out.println("La botella 2 contiene: "+botella333+ "litros");
        
        
        }
}
