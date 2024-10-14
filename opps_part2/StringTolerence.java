//29. Accept five strings which contain numbers and display the total for those numbers. Make your program fault tolerant.

import java.util.Scanner;

public class StringTolerence {
    public static void main(String arg[]){
        int sum=0;
        Scanner sc=new Scanner(System.in);
        int c=0;
        for(int i=0;i<5;i++){
            String str=sc.nextLine();
            try{
                int b=Integer.parseInt(str);
                sum+=b;
            }
            catch(Exception e){
                System.out.println("number format exception");
                c=1;
                break;
            }
        }
        if(c==0){
            System.out.println(sum);
        }
        

    }
    
    
}
