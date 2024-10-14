//20. Write a program to accept a string from the user and display it vertically. use nextLine() to read a string from the user.

import java.util.Scanner;

public class VerticalStr {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        for(int i=0;i<str.length();i++){
            System.out.println(str.charAt(i));
        }
        
    }
    
}
