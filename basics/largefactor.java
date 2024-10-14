//6. Write a program to accept the number and display the largest factor other than the number.
import java.util.Scanner;
public class largefactor {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
    
        for(int i=n-1;i>=1;i--){
            if(n%i==0){
                System.out.println(i);
                break;
            }


        }
        }

}
