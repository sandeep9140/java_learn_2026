import java.util.ArrayList;
import java.util.List;

public class Java3_SuperWarning {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        List ls=new ArrayList<>();

        ls.add("java ");
        ls.add("python");

        String name=(String)ls.get(0);

        System.out.println(name);
    }
    
}
