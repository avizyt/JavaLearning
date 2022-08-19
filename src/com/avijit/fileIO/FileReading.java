package com.avijit.fileIO;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileReading {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("src/com/resource/data/route.txt");

        int i;
        while ((i = fr.read()) != -1){
            System.out.print((char) i);
//            System.out.println();
        }

        System.out.println("=============================");

        File file = new File("src/com/resource/data/tinyG.txt");
        Scanner in = new Scanner(file);

//        while (in.hasNextLine()){
//            System.out.println(in.nextLine());
//        }
        System.out.println(in.nextInt());
        System.out.println(in.nextInt());
    }
}
