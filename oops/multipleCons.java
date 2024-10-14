//13. Introduce multiple constructors in Product class.

public class multipleCons {
    int num;
    multipleCons(){
        System.out.println("Default Constructor");
    }
    multipleCons(int num){
        num+=1;
        System.out.println("parameterized Constructor");
    }
    multipleCons(multipleCons mu){
        this.num=num;
        System.out.println(num);
        System.out.println("Copy constructor");

    }
    public static void main(String[] args) {
        multipleCons m=new multipleCons();
        multipleCons m1=new multipleCons(10);
        multipleCons m2=new multipleCons(m1);

        
    }
}
