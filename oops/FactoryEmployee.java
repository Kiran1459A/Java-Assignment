//16. Create a subclass called FactoryEmployee, for all factory employees we need to store bus_no, emp_boards.Create a super class related to this subclass.


class Emp{
    int empId=1244;
    String empName="Gowtham";
    
}
class FactoryEmployee extends Emp{
    int bus_no;
    String emp_board;
    FactoryEmployee(int bus_no,String emp_board){
        this.bus_no=bus_no;
        
        this.emp_board=emp_board;
        System.out.println(super.empId);
        System.out.println(super.empName);
        System.out.println(bus_no);
        System.out.println(emp_board);

    }
    public static void main(String[] args) {
        FactoryEmployee fe=new FactoryEmployee(122, "yes");
        
    }
    

}

