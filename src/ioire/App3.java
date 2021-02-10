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

/**
 *
 * @author tss
 */
public class App3 {
    public static void main(String[] args) {
        //stampare i nomi dei file testuali (.txt) presenti in una cartella
        try {

            Path path = FileSystems.getDefault().getPath("");
            //modo ricorsivo
            Files.walk(path,1)
                    .filter(p -> !Files.isDirectory(p))
                    .filter(p -> p.getFileName().toString().endsWith(".txt"))
                    .forEach(p -> System.out.println(p.getFileName()));
            //non ricorsivo
            Files.list(path)
                    .map(Path::getFileName)
                    .map(Path::toString)
                    .filter(v -> v.endsWith(".txt"))
                    .forEach(System.out::println);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
