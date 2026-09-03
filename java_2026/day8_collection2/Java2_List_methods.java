import java.util.List;
import java.util.ArrayList;
class Java2_List_methods{
    public static void main(String[] args) {
        /*
        add(),set(),get(),remove(),indexOf(),lastIndexOf(),size(), contains(), clear() */
        List<String> list=new ArrayList<>();
        list.add("Sandeep");
        list.add("Vijay");
        list.add("Ajay");
        list.add("Raj");
        System.out.println(list);

        System.out.println(list.get(1));
        System.out.println(list.get(0));

        list.set(3,"Meda");
        System.out.println(list);
        list.add(0,"aryan");
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.contains("Sandeep"));
        System.out.println(list.indexOf("Sandeep"));
        System.out.println(list.lastIndexOf("Sandeep"));
        System.out.println(list);
        list.remove(1);
        System.out.println(list);
        list.remove("Vijay");
        System.out.println(list);
        list.clear();
        System.out.println(list);
        
        
        

    }
}