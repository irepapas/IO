/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ioire;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author tss
 */
public class App1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            Path pathFile = FileSystems.getDefault().getPath("Anagrafica.txt");
            Path destinazioneFile = FileSystems.getDefault().getPath("AnagraficaNumerata.txt");
            
            List<String> readAllLines = Files.readAllLines(pathFile);
            List<String> righeNumerate= new ArrayList<>(readAllLines.size());
            
            int conto =1;
            for(String riga : readAllLines){
                righeNumerate.add(conto ++ + " " + riga);
            }
            Files.write(destinazioneFile, righeNumerate);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
}
