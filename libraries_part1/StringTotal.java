//21. Write a program to accept a string that contains marks separated by commas and display total.

import java.util.Scanner;

public class StringTotal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String[] s=new String[str.length()];
        s=str.split("[,]");
        int total=0;
        for(int i=0;i<s.length;i++){
            total+=Integer.parseInt(s[i]);
        
        }
        System.out.println(total);
        
    }
    
}
