//8. Write a program to create an array of 5 elements and store values into it by taking them from the keyboard and display them in reverse order.
import java.util.Scanner;
class reversearr {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[5];
        
        for(int i=4;i>=0;i--){
            arr[i]=sc.nextInt();

        }
        for(int i:arr){
            System.out.println(i);

        }
        
    }
    
}
