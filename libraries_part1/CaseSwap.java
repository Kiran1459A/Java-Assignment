//23. Write a program to take a String and invert the case of characters.

import java.util.Scanner;

public class CaseSwap {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String newStr="";
        for(int i=0;i<str.length();i++){
            int  c=str.charAt(i);
            if(c<=90 && c>=65){
                newStr=newStr+(char) (c+32);
            }
            else{
                newStr=newStr+(char) (c-32);

            }


        }
        System.out.println(newStr);

    }
    
}
