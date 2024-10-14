// //17. Create classes to store details for two different types of Products,
// a) ImportedProducts which have import duty.
// b) DiscountedProducts which have a discount rate.
// All products have name and base_price.Create required Constructors and 
// following methods: print(), getNetPrice(), setPrice(), setImportDuty(), setDiscountRate() also experiment with upcasting and downcasting.

class ImportedProducts{
    int products=10;
    public ImportedProducts(int products) {
        this.products = products;
    }
    void print(){
        System.out.println(products);

    }
    void setImportDuty(){
        products+=10;

    }
    


}

class DiscountedProducts extends ImportedProducts{
    int price=0;

    public DiscountedProducts(int products, int price) {
        super(products);
        this.price = price;
    }

    void getNetPrice(){
        System.out.println(products*price);

    }
    
    void setPrice(){
        price+=10;

    }
    void setDiscountRate(){
        System.out.println(price*0.2);

    }

}





public class StoreProduct {
    public static void main(String[] args) {
        //UpCasting
        ImportedProducts obj=(ImportedProducts) new DiscountedProducts(10, 10);
        obj.print();

        //DownCasting
        DiscountedProducts obj1=(DiscountedProducts) obj;
        obj1.getNetPrice();
        obj1.print();
    }


    
    
}
