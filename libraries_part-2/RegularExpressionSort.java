//46. Write  a program to accept strings until 'end' is given and sort them and write them into Codes.txt 
//and the string must be one/more alphabets followed by one/more digits.(use Regular Expressions)

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressionSort {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        Pattern p=Pattern.compile("[a-zA-Z]{1,}\\d{1,}");
        Set<String> s=new TreeSet<>();
        
        while(!str.equalsIgnoreCase("end")){
            
            Matcher m=p.matcher(str);    
            
            if(m.matches()){
                
                s.add(str);
            }
            str=sc.nextLine();

        }
        try {
            FileWriter fw=new FileWriter("files/Codes.txt");

            for(String i:s){
                fw.write(i+"\n");

            }
            fw.close();

        } catch (IOException e) {

           
            e.printStackTrace();
        }

    }
    
}
