//7. Write a program to accept the number and display the number in reverse order.
import java.util.Scanner;
class Reversenum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;

        while(n!=0 && n>0){
            int temp=n%10;
            sum=(sum*10)+temp;
            n=n/10;

        }
        System.out.println(sum);



        
    }
    
}
