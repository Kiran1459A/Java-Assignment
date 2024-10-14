// 4. Write a program to accept the day of a week and the number of hours worked and calculate the wage.
// Conditions:
//      1,2,3 —>  Rs200/ hour
//         4,5  —> Rs400 / hour
//            6  —> Rs600 / hour
//            7  —> Rs800 / hour
//         1 to 7 is Monday to Friday.
//    If the total amount exceeds Rs2000 then there will be a bonus of 10%.  (Use Switch Expression)
import java.util.Scanner;
class CalculateWage {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int days=sc.nextInt();
        int hours=sc.nextInt();
        int wage=0;
        switch(days){
            case 1,2,3 -> wage=200*hours;
            case 4,5-> wage=400*hours;
            case 6->wage=600*hours;
            case 7 ->wage=800* hours;

        }
        System.out.println(wage);
        if(wage>=2000){
            double bonus= wage*0.1;
            int a=(int) bonus;
            System.out.println(wage+a);


        }
        else{
            System.out.println(wage);
        }

        
    }
    
}
