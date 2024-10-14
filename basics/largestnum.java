//9. Write a program to create a function that takes a set of integers and returns the largest of integers.
import java.util.Scanner;
class largestnum {
    public int largestNum(int... num){
        int max=0;
        for(int i:num){
            if(i>max){
                max=i;
            }


        }
        return max;
        

    }
    public static void main(String[] args) {
        largestnum ln=new largestnum();
        int b=ln.largestNum(1,1000,329420,4,5);
        System.out.println(b);
        
    }
    
}
