package io;

import java.awt.Point;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class IO {
    private static final boolean DEBUG = true;
    String inFilename = "C:\\Users\\roda\\Desktop\\TestIO.txt";
    String outFilename = "C:\\Users\\roda\\Desktop\\TestIO2.txt";

    public void readWithBufferedReader() {
        try {
            File file = new File(inFilename);
            FileReader fr = new FileReader(file);
            BufferedReader in = new BufferedReader(fr);
            String str = in.readLine();
            System.out.println(str);
        } catch (FileNotFoundException ex) {
            if(DEBUG) ex.printStackTrace();
        } catch (IOException ex) {
            if(DEBUG) ex.printStackTrace();
        }
    }   
    public void readWithScanner() {
        try {
            File file = new File(inFilename);
            FileInputStream fis = new FileInputStream(file);
            Scanner scanner = new Scanner(fis);
            String str = scanner.nextLine();
            System.out.println();
        } catch (FileNotFoundException ex) {
            if(DEBUG) ex.printStackTrace();
        }
    }
    public void readWithNio(){
        try {
            Charset cs = Charset.forName("UTF-8");
            Path path = Paths.get(inFilename);
            List<String> lines = Files.readAllLines(path, cs);
//            List<String> lines = Files.readAllLines(path);
            for(String line : lines){
                System.out.println(line);
            }
        } catch (IOException ex) {
            if(DEBUG) ex.printStackTrace();
        }
    }
    
    
    public void writeWithBufferedWriter(){
        BufferedWriter out = null;
        try {
            File file = new File(outFilename);
            out = new BufferedWriter(new FileWriter(file));
            out.write("Hello");
            out.append(" world!");
            out.flush();
        } catch (IOException ex) {
            if(DEBUG) ex.printStackTrace();
        } finally {
            try {
                out.close();
            } catch (IOException ex) {
                if(DEBUG) ex.printStackTrace();
            }
        }
    }
    public void writeWithPrintWriter(){
        PrintWriter out = null;
        try {
            File file = new File(outFilename);
            out = new PrintWriter(file);
            out.println("Hello");
            out.append(" world!");
        } catch (FileNotFoundException ex) {
            if(DEBUG) ex.printStackTrace();
        } finally {
            out.close();
        }
    }
    public void writeWithNio(){
        try {
            Path path = Paths.get(outFilename);
            String[] arr = new String[]{"Hello", " world!"};
            List<String> list = Arrays.asList(arr);
            Files.write(path, list);
        } catch (IOException ex) {
            if(DEBUG) ex.printStackTrace();

        }
    }
    
    
    public void writeObject(){
        ObjectOutputStream out = null;
        try {
            Point p = new Point(4, 7);
            System.out.println(p);
            File file = new File(outFilename);
            out = new ObjectOutputStream(new FileOutputStream(file));
            out.writeObject(p);
            out.flush();
        } catch (FileNotFoundException ex) {
            if(DEBUG) ex.printStackTrace();
        } catch (IOException ex) {
            if(DEBUG) ex.printStackTrace();
        } finally {
            try {
                out.close();
            } catch (IOException ex) {
                if(DEBUG) ex.printStackTrace();
            }
        }
    }
    public void readObject(){
        ObjectInputStream in = null;
        try {
            File file = new File(outFilename);
            in = new ObjectInputStream(new FileInputStream(file));
            Point p = (Point) in.readObject();
            System.out.println(p);
        } catch (FileNotFoundException ex) {
            if(DEBUG) ex.printStackTrace();
        } catch (IOException ex) {
            if(DEBUG) ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            if(DEBUG) ex.printStackTrace();
        } finally {
            try {
                in.close();
            } catch (IOException ex) {
                if(DEBUG) ex.printStackTrace();
            }
        }
    }
}
