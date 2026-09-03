import java.util.Vector;

public class Java8_Vector {
    public static void main(String[] args) {
        //Vector same as arraylist but one diff its a synchronized 
        Vector<String> vec=new Vector<>();
        vec.add("samdeep1");
        vec.add("samdeep2");
        vec.add("samdeep3");
        vec.add("samdeep1");
        System.out.println(vec);
    }
}
