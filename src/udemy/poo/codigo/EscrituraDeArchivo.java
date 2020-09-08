/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package udemy.poo.codigo;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author luisangelcuriel
 */
public class EscrituraDeArchivo {
    public static void main(String[] args) {
        FileWriter fw = null;
        try {
            File archivo = new File(System.getProperty("user.dir") + "/gato");
            fw = new FileWriter(archivo, true);
            PrintWriter pw = new PrintWriter(fw);
            
            for (int i = 0; i < 7; i++) {
                pw.println("Esta es una línea en Java");
            }
            
            pw.println("¿Borré los datos?");
            pw.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            try {
                fw.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
}
