import java.util.HashSet;
import java.util.Set;

class Java2_HashSet{
    // random order + not duplicate

    public static void main(String[] args) {
        Set<Integer> s=new HashSet<>();
        s.add(10);
        s.add(20);
        s.add(10);
        s.add(30);
        System.out.println(s);
        System.out.println(s.contains(10));
        System.out.println(s.size());
        System.out.println(s.isEmpty());
        s.remove(10);
        System.out.println(s.remove(1));

        System.out.println(s);

        s.clear();
        System.out.println(s);


        Set<String> s1=new HashSet<>();
        s1.add("hello");
        Set<String> s2=new HashSet<>();
        s2.add("hello");


        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        Integer a=s1.hashCode();
        Integer b=s2.hashCode();

        System.out.println(s1==s2);//flase
        System.out.println(s1.equals(s2));//true
        
        System.out.println(a==b);//flase
        System.out.println(a.equals(b));//true
        
        
            
        
    }
}