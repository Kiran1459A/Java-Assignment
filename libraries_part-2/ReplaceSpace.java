//45. Write a program to accept a file and replace one (or) more spaces with a single space.

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ReplaceSpace {
     static StringBuffer s=new StringBuffer();
    public static void main(String[] args) {
        File f =new File("files/space.txt");
        
        try {
            Scanner sc=new Scanner(f);

            
            while(sc.hasNextLine()){
                String v=sc.nextLine();
                v=v.replaceAll("[' ']+", " ");
                s.append(v+System.lineSeparator());
            }
            sc.close();

        } catch (FileNotFoundException e) {
            
            e.printStackTrace();
        }
        try {
            FileWriter fw=new FileWriter("files/space.txt");
            fw.write(s.toString());
            fw.close();
        } catch (IOException e) {
           
            e.printStackTrace();
        }


    }
}
