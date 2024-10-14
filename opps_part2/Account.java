//27. Write a program to create an interface called account operation with methods deposit(), getBalance().Implement this interface in Account class.@interface
interface Bankings{
    void deposit();
    void getBalance();
}
class Account implements Bankings{
    public void deposit(){
        System.out.println("desposit method");
    }
    public void getBalance(){
        System.out.println("Balance method");
    }
    public static void main(String[] args) {
        Account a=new Account();
        a.deposit();
        a.getBalance();
    }


}
