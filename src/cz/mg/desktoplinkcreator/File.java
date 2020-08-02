package cz.mg.desktoplinkcreator;

import java.io.*;


public class File {
    public static String read(String path){
        try(BufferedReader reader = new BufferedReader(new FileReader(new java.io.File(path)))){
            String line;
            String content = "";
            while((line = reader.readLine()) != null){
                content = content + line + "\n";
            }
            return content;
        } catch (IOException e){
            throw new RuntimeException(e);
        }
    }

    public static void write(String path, String content){
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(new java.io.File(path)))){
            writer.write(content);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
