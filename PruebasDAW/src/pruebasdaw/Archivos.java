/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebasdaw;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Manu
 */
public class Archivos {
    public static void main(String[] args) throws IOException {
        String rutaProyecto = System.getProperty("user.dir");
        String sep = File.separator;
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Introduce un nombre para el archivo .txt");
        String titulo = br.readLine();
        String rutaArchivo = rutaProyecto +sep +"formacion" +sep +titulo;
        File archivo = new File(rutaArchivo);
        archivo.createNewFile();
    
    
        
        
        
    }
}
