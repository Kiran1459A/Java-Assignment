//36. File Marks.txt, which have marks separated by comma in different lines.Find the total marks of each line and display them.(Use fault tolerance)

import java.util.Scanner;
import java.io.File;
public class FileHandleTotal {
    public static void main(String[] args) {
        try {
            File f=new File("files/data.txt");
            Scanner sc =new Scanner(f);
            while(sc.hasNextLine()){
                int total=0;
                String s=sc.nextLine();
                String[] arr= s.split("[,]");
                for(String i:arr){
                    total+=Integer.parseInt(i);
                }
                
                System.out.println(total);
            }
        sc.close();
        } catch (Exception e) {
            
            e.printStackTrace();
        }
        
        
        

    
}}
