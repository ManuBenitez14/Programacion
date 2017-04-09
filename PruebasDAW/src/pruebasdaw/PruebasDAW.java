/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebasdaw;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author Manu
 */
public class PruebasDAW {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        String rutaProyecto = System.getProperty("user.dir");
        String sep = File.separator;
        String rutaCarpeta = rutaProyecto + sep +"formacion";
        File carpeta = new File(rutaCarpeta);
        carpeta.mkdirs();
                if (carpeta.exists())
                    System.out.println("La carpeta formacion ya existe");{ // Directorio existe }
                
        
        
    }
    
}
}
