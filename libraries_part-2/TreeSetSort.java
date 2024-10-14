//42. Create a treeset of strings and sort them by length (use Comparator)
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetSort {
    
    public static void main(String[] args) {
        
        Set<String> s=new TreeSet<>(new Comparator<String>() {
            public int compare(String i,String j){
                return i.length()>j.length()?1:-1;
            }
            
        });
        s.add("kiran");
        s.add("bharat");
        s.add("bae");
        s.add("arjunna");

        System.out.println(s);

    }
}
