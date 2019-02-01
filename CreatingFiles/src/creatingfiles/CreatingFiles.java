/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creatingfiles;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Dennis
 */
public class CreatingFiles {

    String filePath = "C:\\Users\\Runej\\Desktop\\Files\\test.text";
    
    String animalPath2 = "C:\\Users\\Runej\\Desktop\\Files\\AnimalsJSON.txt";
    
    File file = new File(filePath);
    
    File animalFile2 = new File(animalPath2);
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String animalPath = "C:\\Users\\Runej\\Desktop\\Files\\Animals.txt";
        String testPath = "C:\\Users\\Runej\\Desktop\\Files\\TestFile.txt";
        File animalFile = new File(animalPath);
        File testFile = new File(testPath);
        CreatingFiles cf = new CreatingFiles();
//        cf.readingFileNio();
//        cf.animalCreator();
//        System.out.println(cf.animalsToJSON());
//        cf.writeJSONAnimal();
//        cf.readingFileNio();
//        cf.creatingFile(testFile);
        cf.readingFileNio(animalPath);
        cf.animalCreator(animalPath);
        cf.animalsToJSON(animalPath);
        cf.writeJSONAnimal(animalPath, testPath);
    
       
    }
    
    

    public void creatingFile(File file) {
        try {
            

            if (!file.exists()) {

                file.createNewFile();
            }
        } catch(FileNotFoundException ex){
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
    }
}
    public void writingInFile(File file){
        try{
            PrintWriter printWriter = new PrintWriter(file);
            
            for (int i = 0; i <= 10; i++) {
                printWriter.print(i + ", ");
                
            }
            printWriter.println();
            printWriter.println("Testen er forbi");
            printWriter.close();
            
//            printWriter.println("Dette er en test!");
//            printWriter.println("Dette er en test!");
//            printWriter.println("Dette er test 2");
//            printWriter.close();
            
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
        
    }
    public void readingFile(){
        try{
            FileReader filereader = new FileReader(file);
            BufferedReader buffer = new BufferedReader(filereader);
            String lineOne = buffer.readLine();
            String lineTwo = buffer.readLine();
            System.out.println(lineOne);
            System.out.println(lineTwo);
            
            
            
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    public void readingFileNio(String filePath){
        try {
            Charset charset = Charset.forName("UTF-8");
            Path path = Paths.get(filePath);
            List<String> lines = Files.readAllLines(path, charset);
            for (String line : lines) {
                System.out.println(line);
            }
            
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    public void animalCreator(String filePath){
        try {
            ArrayList<Animals> animals = new ArrayList();
            Charset charset = Charset.forName("UTF-8");
            Path path = Paths.get(filePath);
            List<String> lines = Files.readAllLines(path, charset);
            for (int i = 0; i < lines.size() -1; i++) {
                animals.add(new Animals(lines.get(i), lines.get(i+1)));
                i += 2;
            }
            for (Animals animal : animals) {
                System.out.println(animal.toString() + "\n");
                
            }
            
            
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        
    }
    public String animalsToJSON(String filePath){
        String stringJson = "";
        try {
            
            ArrayList<Animals> animals = new ArrayList();
            Charset charset = Charset.forName("UTF-8");
            Path path = Paths.get(filePath);
            List<String> lines = Files.readAllLines(path, charset);
            for (int i = 0; i < lines.size() -1; i++) {
                animals.add(new Animals(lines.get(i), lines.get(i+1)));
                i+=2;
            }
            for (Animals animal : animals) {
                stringJson += "{ \"name\":" + "\"" + animal.getAnimalName() + "\""
                              + ", \"group\":" + "\"" + animal.getGroupName() + "\" }\n";
                
            }
            
            
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return stringJson;
    }
    public void writeJSONAnimal( String readPath, String writerPath){
        PrintWriter writer = null;
        try {
            
            
            String json = animalsToJSON(readPath);
            writer = new PrintWriter(writerPath);
            
            writer.println(json);
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }  finally {
            writer.close();
        }
    }
    public void readWithScanner(){
        try {
            FileInputStream fis = new FileInputStream(file);
            Scanner scanner = new Scanner(fis);
            
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
    }
    
}
