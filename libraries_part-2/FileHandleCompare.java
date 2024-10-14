//40. Write a program to assume names1.txt & names2.txt where we have one name for line & display unique names from both the files in 
//the order they appear.

import java.io.File;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
public class FileHandleCompare {
    public static void main(String[] args) {

        try {
            File f1=new File("files/name1.txt");
            File f2=new File("files/names2.txt");
            Scanner sc=new Scanner(f1);

            List<String> l=new ArrayList<>();
            
            while(sc.hasNextLine()){
                String s=sc.nextLine();
                if(!l.contains(s)){
                    l.add(s);
                }
            }
            Scanner s1=new Scanner(f2);
            while(s1.hasNextLine()){
                String s=s1.nextLine();
                if(!l.contains(s)){
                    l.add(s);
                }
            }
            for(String i:l){
                System.out.println(i);
            }


            sc.close();

            











        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        

    }

    
}
