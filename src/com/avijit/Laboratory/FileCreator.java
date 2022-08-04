package com.avijit.Laboratory;

import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileCreator {
    public static void main(String[] args) throws IOException {
        System.out.println("Using createFile() method of File class: ");
        Path path = Paths.get("newFile.txt");
        try {
            Files.createFile(path);
            System.out.println("File Created: "+ path);
        } catch (FileAlreadyExistsException e){
            System.out.println("File already exists at path: "+ path);
        }
    }
}
