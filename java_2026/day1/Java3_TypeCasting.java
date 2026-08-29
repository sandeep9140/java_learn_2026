public class Java3_TypeCasting {
    public static void main(String[] args) {
        // teo types of casring 
        // 1) Widening ( automatically process )
        int a=100;
        long b=a;
        System.out.println( "now its convert into long "+b);

        //Char to integer conversion 
        char ch='A';
        int char1=ch;
        System.out.println(char1);


        //there are one thing   long convert into float  (long=> 8byte  float=>4byte)
        long longValue=123456789l;
        float floatValue=longValue;
        System.out.println(floatValue);


        // 2) Narrowing( manual process)

        double price=99.99;
        int x=(int) price;
        System.out.println(x);


        int value1=130;
        byte byteValue=(byte)value1;
        System.out.println(byteValue);
    }
    
}
