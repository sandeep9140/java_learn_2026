import javax.print.attribute.standard.OrientationRequested;

public class Java2_Boxing {
    public static void main(String[] args) {

        // AutoBoxing
        int x=100;
        //Integer y=x;
        //  OR 
        Integer y=Integer.valueOf(x);
        System.out.println(y);
        System.out.println(y.getClass());
        System.out.println(x);


        //unboxing

        System.out.println("Unboxing........");

        Integer p=200;
        //int q=p;
        //   OR
        int q=p.intValue();

        System.out.println(p.getClass());
        System.out.println(q);
    }
    
}
