//28. Design classes that need to sort a collection of Product objects either by product name or by price.
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Comparator;
class Product{
    String name;
    int price;
    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String toString(){
        return name+" : "+price;
        

    }

    
}

public class SortCollections {
    public static void main(String[] args) {
        
        List<Product> details=new ArrayList<>();
        details.add(new Product("Apple",10));
        details.add(new Product("Graphes",20));
        details.add(new Product("Banana",5));
        details.add(new Product("Ice cream",30));

        Scanner sc=new Scanner(System.in);
        

        Comparator <Product> com=new Comparator<Product>() {
            

                public int compare(Product i,Product j){
                    return i.name.compareTo(j.name);

                }
            

            
        };

        Comparator <Product> priceProduct=new Comparator<Product>() {
            

            public int compare(Product i,Product j){
                return i.price-j.price;

            }
        
    };

    
        System.out.println("Please Enter sort by Name or Price");
        String str= sc.nextLine();
        if(str.equalsIgnoreCase("name")){

            Collections.sort(details,com);
            for(Product i:details){
                System.out.println(i);
            }

        }
        else if(str.equalsIgnoreCase("price")){
            Collections.sort(details,priceProduct);
            for(Product i:details){
                System.out.println(i);
            }

        }

    };

        
    }
    

