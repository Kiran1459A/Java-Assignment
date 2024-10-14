//19. Write a program to create an array of 10 elements, fill it with random no's and display array elements which are greater than average of array.
public class RandomAvg {
    public static void main(String[] args) {
        int[] arr=new int[10];
        int total=0;
        for(int i=0;i<10;i++){
            arr[i]=(int)(Math.random()*100);
            total+=arr[i];
            
        }
        
        int avg=total/10;
        
        for(int i: arr){
            if(i>avg){
                System.out.println(i);
            }

        }


    }
    
}
