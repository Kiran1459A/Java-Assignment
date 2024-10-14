//44. Write a program to accept a string & display each word on a separate line (use any separator)

import java.util.Scanner;

public class StringSeperator {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String str=sc.nextLine();
        String[] s=str.split(" ");
        for(String i:s){
            System.out.println(i);
        }

    }
    
}
