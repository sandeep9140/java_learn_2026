import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class Java4_ArraylistMethods {
    

    public static void main(String[] args) {
        List<String> li=new ArrayList<>(7);
        li.add("sandeep");
        li.add("hello");
        li.add("sandeep");
        li.add("ankit");
        li.add("ankit");

        li.add("ankit");

li.add("ankit");
        

        System.out.println(li+" size = "+li.size());
        li.add("ankit");
        System.out.println(li+" size = "+li.size());
        System.out.println(li);

        Iterator<String> itr=li.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());

        }

        System.out.println(li.isEmpty());


    
    }

}
