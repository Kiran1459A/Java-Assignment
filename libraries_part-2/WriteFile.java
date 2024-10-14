//37. Write 20 marks into Marks.data.
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class WriteFile {
    public static void main(String[] args) {
        
    //     try {
    //         File f=new File("files/Marks.txt");
    //         f.createNewFile();
            
    //     } catch (IOException e) {
    //         
    //         e.printStackTrace();
    //     }
            
    try (FileWriter fileWriter = new FileWriter("Marks.txt")) {
            
    
        
        Random rand=new Random();
        
        for(int i=0;i<20;i++){
            String str=String.valueOf(rand.nextInt(1,100));

            fileWriter.write(str+"\n");
            
        }
        fileWriter.close();
    } catch (IOException e) {
        
        e.printStackTrace();
    }


    





    }


    
    
}
