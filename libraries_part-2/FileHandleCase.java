//34. Write a program to accept a filename from the user and display how many uppercase, lowercase and digits the file has.
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileHandleCase {
    public static void main(String[] args) {
        File myFile=new File("files/strings.txt");
        

        Scanner sc;
        int upper=0;
        int lower=0;
        int digit=0;
        try {
            sc = new Scanner(myFile);
            while(sc.hasNextLine()){
                
                String line=sc.nextLine();
                
                for(int i=0; i<line.length();i++){
                    
                    int b=line.charAt(i);

                    if(97<=b && b<=122){
                        lower+=1;

                    }
                    else if(65<=b && b<=90){
                        upper+=1;
                    }
                    else if(48<=b && b<=57){
                        digit+=1;
                        
                    }

                }
                
            }
            sc.close();
            
            System.out.println("LowerCase Count : "+lower);
            System.out.println("UpperCase Count : "+upper);
            System.out.println("Digit Count : "+digit);




        } catch (FileNotFoundException e) {
            System.out.println("Unable to read the file");
        }
        
        
        
        
    }

}
