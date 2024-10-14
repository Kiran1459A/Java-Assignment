//33. Write a program to accept names from users until 'END' is given and write them into names.txt as one name for the line.
//import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class FileHandleName {
    public static void main(String[] args) {

        // File myFile=new File("names.txt");
        // try{
        //     myFile.createNewFile();
        // }
        // catch(Exception e){
        //     System.out.println("IO exception");
        // }

        try (FileWriter fileWriter = new FileWriter("names.txt")) {
            
            Scanner sc=new Scanner(System.in);
            String str=sc.nextLine();
            while(!str.equalsIgnoreCase("End")){
                fileWriter.write(str+"\n");
                str=sc.nextLine();           }

                sc.close();
        } catch (IOException e) {
            
            e.printStackTrace();
        }



    }
    
}