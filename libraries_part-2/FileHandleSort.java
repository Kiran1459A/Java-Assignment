import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Collection;
import java.util.TreeSet;
//39. Write a program to take names from names.txt & display unique names in sorted order.


public class FileHandleSort {
    public static void main(String[] args) {
        File f=new File("files/names.txt");
        Collection<String> set=new TreeSet<>();
        try {
            Scanner sc=new Scanner(f);
            while(sc.hasNextLine()){
                String s=(sc.nextLine()).toLowerCase();
                set.add(s);
            }
            System.out.println(set);

            sc.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        
    }
    
}
