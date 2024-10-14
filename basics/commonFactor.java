//10. Write a program to create a function that takes multiple numbers and displays common factors.
class commonFactor {
    public void ComFact(int... num){
        int min=num[0];
        for(int i: num){
            if(i<min){
                min=i;
            }

        }
        int v=0;
        int[] arr=new int[min];
        for(int i=1;i<=min;i++){
            if(min%i==0){
                arr[v]=i;
                v++;

            }

        }
        
        for(int i:arr){
            int c=0;
            if(i!=0){
            for(int j=0;j<num.length;j++){
                if(num[j]%i!=0){
                     c=1;
                    break;

                }

            }
            if(c==0){
                System.out.println(i);
            }}

        }

        

    }
    public static void main(String[] args) {
        commonFactor cf=new commonFactor();
        cf.ComFact(6,9,12);
        
    }
    
}
