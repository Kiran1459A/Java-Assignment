//22. Write a program to accept a string and display the position of space for all spaces.

import java.util.Scanner;

public class SpacePos {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==(' ')){
                System.out.println(i);

            }
        }


        
    }
}
