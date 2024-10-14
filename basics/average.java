// 5. Write a program to accept five numbers from the user and display the average of numbers.
import java.util.Scanner;
public class average {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int b=0;

        for(int i=0;i<5;i++){
            b+=sc.nextInt();

        }
        System.out.println(b/5);
    }
    
}
