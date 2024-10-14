import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class PanCard {
    public static void main(String[] args) {
        String s="nvppk1670d";
        
        Pattern pattern= Pattern.compile("[A-Za-z]{5}\\d{4}[A-Za-z]");
        Matcher match=pattern.matcher(s);
        System.out.println(match.find());
    }
    
}
