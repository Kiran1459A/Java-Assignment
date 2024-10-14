//35. Write a program to display lines that contains more than 5 characters.

import java.io.File;
import java.util.Scanner;

public class FileHandleChar {
    public static void main(String[] args) {
        File f;
        try {
            f = new File("files/Character.txt");
            Scanner sc=new Scanner(f);
            while(sc.hasNextLine()){
                String s=(sc.nextLine());
            

                if((s.length()>4)){
                    System.out.println(s);


                }

            } 
            sc.close();

    }catch (Exception e) {

            e.printStackTrace();
        }
        
        
    }

}

