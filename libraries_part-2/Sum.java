//32. Write a program to accept some numbers from the user until 'O' and display the sum of +ve numbers.

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int b=sc.nextInt();
        int sum=0;
        while(b!=0){
            if(b>0){
            sum+=b;}

            b=sc.nextInt();

        }
        System.out.println(sum);
    }
    
}
