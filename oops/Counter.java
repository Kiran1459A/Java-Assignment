// 14.Create a class called Counter that stores a number and provides methods to increment, decrement and return the count. 
//Provide the constructor without parameters that sets the values to zero and another constructor with parameters takes the values and starts from there.

public class Counter {
    int count;
    Counter(){
        this.count=0;
    }
    Counter(int num){
        this.count=num;
    }
    void increment(){
        this.count+=1;
        System.out.println(this.count);
    }
    void decrement(){
        this.count-=1;
        System.out.println(this.count);
    }
    public static void main(String[] args) {
        Counter c=new Counter();
        c.increment();
        c.decrement();
        Counter c1=new Counter(10);
        c1.increment();
        c1.decrement();
    }
}
