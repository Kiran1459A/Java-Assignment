//38. Write a program to accept a file and convert its contents to uppercase.(write in compact way)

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
public class FileHandleUpper {
    static String s1;
    public static void main(String[] args) {
        File file=new File("files/Upper.txt");
        Scanner sc;
        
        try {
            sc=new Scanner(file);
            StringBuffer s=new StringBuffer();
            while(sc.hasNextLine()){
                s.append(sc.nextLine()+System.lineSeparator());
            }
            s1=s.toString().toUpperCase();
            sc.close();
            


        } catch (FileNotFoundException e) {
           
            e.printStackTrace();
        }

        try (BufferedWriter bw = new BufferedWriter(new FileWriter("files/Upper.txt"))) {
            System.out.println(s1);
            bw.write(s1);

            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


        
            
        
                

            







        
    }
    
}
