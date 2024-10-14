//48. Assume a txt file customers.txt which contains name & mobile no and you need to display in sorted order of name.(Use regular expression)

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CustomerDataSort {
    static TreeMap<String,Long> tm=new TreeMap<>();
    public static void main(String[] args) {
        
        
        File f=new File("files/Customer.txt");
        Pattern p=Pattern.compile("[A-Za-z]+ \\d{10}");

        try {
            Scanner sc=new Scanner(f);
            

            while(sc.hasNextLine()){
                String s=sc.nextLine();
                Matcher m=p.matcher(s);
                if(m.matches()){
                    String[] arr=s.split(" ");
                    Long a=Long.parseLong(arr[1]);
                    
                    tm.put(arr[0],a);
                }
            }

            for(String i:tm.keySet()){
                System.out.println(i+" : "+tm.get(i));

            }
            
        } catch (FileNotFoundException e) {
            
            e.printStackTrace();
        }



    }
    
}
