// 15. Create a class Student that stores the details like admin_no, stu_name, course_joined and fees_paid.
// —> Courses are: JAVA, PYTHON.
// —> The total fees for java is 10k and for python is 7.5k.
// —> Provide a constructor to take required details.The default course is JAVA.
// —> Provide the following methods: getTotalFee(), getDue(), getFeePaid(), payment(amount).

public class Student {
    int admin_no;
    String stu_name;
    String course_joined="JAVA";
    double fees_paid;
    
    int pay;

    Student(int admin_no,String stu_name,String course_joined, double fees_paid){
        this.admin_no=admin_no;
        this.stu_name=stu_name;
        this.course_joined=course_joined;
        this.fees_paid=fees_paid;
        
        
    }
    
    
    Student(int admin_no,String stu_name, double fees_paid){
        this.admin_no=admin_no;
        this.stu_name=stu_name;
    
        this.fees_paid=fees_paid;
        
        
    }
    void getTotalFee(){
        if(this.course_joined.equalsIgnoreCase("PYTHON")){
            this.pay=7500;
            
            System.out.println(7500);
        }

        else{
            this.pay=10000;
            System.out.println(10000);
        }

    }
    void getDue(){
        if(this.course_joined.equalsIgnoreCase("java")){
            System.out.println(10000-fees_paid);
            
        }
        else{
            
            System.out.println(7500-fees_paid);
        }


    }
    void getFeePaid(){
        System.out.println(fees_paid);
    }
    void payment(int amount){
        
        if(course_joined.equalsIgnoreCase("java")){
            System.out.println(10000-fees_paid-amount);
        }
        else{
            System.out.println(7500-fees_paid-amount);
        }

    }

    public static void main(String[] args) {
        Student s=new Student(1,"gowtham",7000);
        
        s.getDue();
        s.getFeePaid();

    }
    
    
}
