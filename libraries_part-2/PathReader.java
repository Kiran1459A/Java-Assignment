//47. Write a program to display the file which contains the given string in a path.

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PathReader {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter File path");
        String s=sc.nextLine();
        try {

            File f=new File(s);
            if(f.exists()){
            Scanner s1=new Scanner(f);
            while(s1.hasNextLine()){
                System.out.println(s1.nextLine());
            }
        
        
        }
            
        } catch (Exception e) {
            System.out.println("File not Found");
        }
    

        
    }
    
}
