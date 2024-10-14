//12. Create a class(Product) to store details of a product and provide required methods with the details prod_id, prod_name, price,quantity_on_hand
// Methods are:  init(prod_id,prod_name, price)
// getNetPrice() (returns the price after adding 12% tax)
// purchase()
// sell()

//13. Introduce multiple constructors in Product class.


public class product{
    int productId;
    String ProductName;
    double Price;
    int productQuantity=30;
    int m;
    
    public product(){
        this.m=20;
        System.out.println("Default Constructor");
    }
    public product(product mu){
        this.m=mu.m;
        System.out.println(this.m);
        System.out.println("Copy Constructor");
    }


    public product(int productId,String ProductName, double Price){
        System.out.println("Parameterized Constructor");
        this.productId=productId;
        this.ProductName=ProductName;
        this.Price=Price;

    }//13. Introduce multiple constructors in Product class.

    void getNetPrice(){
        double b=this.Price*productQuantity;
        System.out.println(b+(b*0.12));
    }

    void purchase(int quantity){
        System.out.println("Before Purchased "+this.productQuantity);
        this.productQuantity+=quantity;
        System.out.println("After Purchased "+this.productQuantity);

    }
    void sell(int quantity){
        System.out.println("Before sell "+this.productQuantity);
        if(this.productQuantity-quantity>=0){
        this.productQuantity-=quantity;
        System.out.println("After sell "+this.productQuantity);
    }   
    else{
        System.out.println("Insufficient Items");
    }
    }
    public static void main(String args[]){
        product p=new product(512, "Apple", 10);
        p.getNetPrice();
        p.purchase(10);
        p.sell(2);
        product p1=new product();
        product p2=new product(p1);
    }
    
}

