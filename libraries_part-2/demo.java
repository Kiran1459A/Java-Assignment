import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class demo{
    public static void main(String[] args) {
        Pattern p=Pattern.compile("\\d{10}");
        String s="asjfkjurehanndsfnksandijd98488295671234nfdsjaabfj bayrbajsbaj bskj fddd jajf jfaj 7989121314 j dsajs hs schuabdfjsnnfdfsn dajhkjgds";
        for(int i=0;i<s.length()-10;i++){
            String a=s.substring(i,i+10);
            Matcher m=p.matcher(a);
            if(m.matches()){
                System.out.println(a);
                i+=10;
            }
            
        }



    }




    }
    

    

