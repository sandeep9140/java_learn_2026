import java.util.ArrayList;
import java.util.List;

public class Java5_arrayList {
    public static void main(String[] args) {
        List<String> names=new ArrayList<>();
        names.add("sandeep");
        names.add("sandeep2");
        names.add("sandeep3");

        System.out.println(names);
        names.remove("sandeep");
        System.out.println(names);
        names.remove(0);
        System.out.println(names);
        names.add("sandeep");
        names.add("sandeep2");
        System.out.println(names);
        names.set(1,"anur");
        System.out.println(names);
        System.out.println(names.contains("sandeep"));
        System.out.println(names.size());
        System.out.println(names.isEmpty());
        System.out.println(names.indexOf("anur"));
        names.clear();
        System.out.println(names);

    }
    
}
