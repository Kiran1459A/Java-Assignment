//24. Go to the previous classes and override equals(), toString(), hashCode().
class Parent{
    public boolean equals(){
        System.out.println("Override");
        System.out.println("equals the two String");
        return true;
    }
    public String toString(){
        System.out.println("Override");
        System.out.println("convert into String");
        return "GS";
        
    }
    public int  hashCode(){
        System.out.println("Override");
        System.out.println("provide the address of the String");
        return 10;
    }
}




public class Override {
    public static void main(String[] args) {
        Parent p=new Parent();
        System.out.println(p.equals());
        System.out.println(p.toString());
        System.out.println(p.hashCode());

        
    }
    
}
