//11. Write a program to consider command line arguments num, length as inputs (where length is optional) if you won't get that use default number as length.

public class commandLineArg {
    public static void main(String args[]){
        int len=10;
        if(args.length!=0){
            System.out.println(args[0]);

        }
        else{
            System.out.println(len);
        }
    }

    
}
