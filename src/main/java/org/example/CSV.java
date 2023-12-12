package org.example;

import java.nio.file.Files;
import java.nio.file.Path;

public class CSV {
    public static void writeToCSV(String data) {
        try {
            
            Files.write(Path.of(Settings.file), data.getBytes());
            
        } catch (Exception e) {
            e.getMessage();
        }
    }
}
