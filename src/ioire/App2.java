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
import java.util.stream.Collectors;

/**
 *
 * @author tss
 */
public class App2 {
    public static void main(String[] args) {
        //convertire in maiuscolo le linee di un file
        try{
            Path pathFile = FileSystems.getDefault().getPath("Anagrafica.txt");
            Path destinazioneFile = FileSystems.getDefault().getPath("AnagraficaMaiuscola.txt");
            Files.write(destinazioneFile, Files.lines(pathFile)
                    .map(v->v.toUpperCase())
                    .collect(Collectors.toList()));
            
        }catch(IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
