//31. Create an insufficientBalanceException Class with the message "Insufficient Balance X for withdrawal of Y".

import java.util.Scanner;

class insufficientBalanceException extends Exception{
    insufficientBalanceException(String s){
        super(s);

    }
}
public class CustomException {
    public static void main(String[] args) {
        int balance=10000;
    Scanner sc=new Scanner(System.in);
    
    try{
        int y=sc.nextInt();
        if(y<=balance){
            System.out.println("withdraw");
            System.out.println("Remainig balance : "+(balance-y));
        }
        else{
            throw new insufficientBalanceException("Insufficient Balance X for withdrawal of Y");
        }

    }
    catch(insufficientBalanceException e){
        System.out.println(e);

    }
    }
    
}
