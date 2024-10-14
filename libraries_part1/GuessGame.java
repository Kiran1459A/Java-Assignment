//18. Write a program to guess the random number in three attempts. The range is (1 to 25).

import java.util.Scanner;

public class GuessGame {
    
    public static void main(String[] args){
        int a=(int) Math.random()*26;
        Scanner sc=new Scanner(System.in);
        int c=0;
        for(int i=0;i<3;i++){
            int b=sc.nextInt();
            if(a==b){
                c=1;
                System.out.println("Wins");
            }
            else if(i<2){
                System.out.println("Try Again");
            }


        }
        if(c==0){
            System.out.println("lose");
        }

    }


    
}
