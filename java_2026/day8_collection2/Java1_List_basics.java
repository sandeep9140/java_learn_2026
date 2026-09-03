import java.util.List;
import java.util.ArrayList;
public class Java1_List_basics {
    public static void main(String[] args) {
        // list allow duplicate +orderd
        /*
        add()---> add(value){add into last }   add(index ,value) add at perticular index
        get()---> get(index); return value at the index
         set()----> set(index,value)
        remove()----> remove(index)remove index value   remove(Object)  remove that object
        contains()
        indexOf()
        lastIndex()
        size()
        clear()

         */

        List<String> list=new ArrayList<>();
        list.add("sanju");
        list.add("sanju2");
        list.add("sanju3");
        System.out.println(list);

        for(String x: list){
            System.out.println(x);
        }


    }
}
