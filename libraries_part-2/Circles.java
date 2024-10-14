//41. Create a class called Circle with x & y radius, Now create Hashset & insert circle objects with some duplicates, 
//and also use treeset for the same for circle objects and see what happens.

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.Arrays;
class Circle implements Comparable<Circle> {
    int x;
    int y;
    
    public Circle(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public int compareTo(Circle h){
        return 1;
    }

    public String toString(){
        return  x+":"+y;

    }
    
}

public class Circles{

    public static void main(String[] args) {
        Set<Circle> ts=new TreeSet<>();
        
        
        Set<Circle> s=new HashSet<>();
        s.add(((new Circle(10,11))));

        ts.add((new Circle(10,11)));

        s.add((new Circle(20,30)));
        ts.add((new Circle(20,30)));

        s.add((new Circle(40,50)));
        ts.add((new Circle(40,50)));


        System.out.println(s);
        System.out.println(ts);

    }
    
}
