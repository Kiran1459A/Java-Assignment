//25. Write a program to accept names until the END is given and display all the names separated by '-'.

import java.util.Scanner;

public class AddName {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        StringBuilder s=new StringBuilder();
        String str=sc.nextLine();
        while(!str.equalsIgnoreCase("END")){
            s.append(str+"-");
            str=sc.nextLine();


        }
        str=(s.toString());
        for(int i=0;i<str.length()-1;i++){
            System.out.print(str.charAt(i));
        }
        System.out.println();

    }
}
