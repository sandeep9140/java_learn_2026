public class Java4_equality {

    public static void main(String[] args) {

        // String literals
        String s1 = "Java";
        String s2 = "Java";

        System.out.println("s1 == s2: " + (s1 == s2));
        System.out.println("s1.equals(s2): " + s1.equals(s2));


        // Using new keyword
        String s3 = new String("Java");
        String s4 = new String("Java");

        System.out.println("s3 == s4: " + (s3 == s4));
        System.out.println("s3.equals(s4): " + s3.equals(s4));


        // Pool vs Heap
        System.out.println("s1 == s3: " + (s1 == s3));
        System.out.println("s1.equals(s3): " + s1.equals(s3));


        // Different content
        String a = "Hello";
        String b = "World";

        System.out.println("a == b: " + (a == b));
        System.out.println("a.equals(b): " + a.equals(b));
    }
}