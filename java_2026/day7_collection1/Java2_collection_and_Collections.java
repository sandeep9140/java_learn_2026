import java.util.ArrayList;
import java.util.Collections;

public class Java2_collection_and_Collections {
    public static void main(String[] args) {
        System.out.println("collections\n");
        ArrayList<String> al=new ArrayList<>();
        al.add("alu");
        al.add("ballu");
        Collections.sort(al);
        System.out.println(al);


        System.out.println("\n--------------Collection:---------- \n");
        ArrayList<String> arr=new ArrayList<>();
        arr.add("sandeep");
        arr.add("vijay");
        arr.add("ANuu");
        arr.add("Ajju");
        System.out.println(arr);
        arr.remove(1);
        System.out.println(arr);
        System.out.println(arr.contains("sandeep"));
        System.out.println(arr.size());
        System.out.println(arr.isEmpty());

    }
    
}
