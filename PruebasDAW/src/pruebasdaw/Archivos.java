/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebasdaw;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
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
        // Crear un archivo y poner un titulo
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Introduce un nombre para el archivo .txt");
        String titulo = br.readLine();
        String rutaArchivo = rutaProyecto +sep +"formacion" +sep +titulo;
        File archivo = new File(rutaArchivo);
        archivo.createNewFile();
    
        
        FileWriter fw = new FileWriter(archivo); //Stream conectado al fichero a escribir.
        BufferedWriter bw = new BufferedWriter(fw); //Buffer que almacena datos hacia el stream
        //PEDIMOS TEXTO AL USUARIO
        System.out.println("Introduce el texto del nuevo documento. Finaliza con un 0");
        String s = System.getProperty("line.separator");
        String texto = br.readLine();
        while(texto.equalsIgnoreCase("0")==false){
            bw.write(texto+s); //guarda los datos en el buffer
            texto = br.readLine();
        }
        bw.flush(); //envia los datos que queden al buffer
        bw.close(); //se liberan los recursos asignados al outputStream
        
        
        
        
    }
}
