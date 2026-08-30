public class Java2_StringPool {

    public static void main(String[] args) {

        // String literals
        String s1 = "Java";
        String s2 = "Java";

        // Both point to the same String Pool object
        System.out.println(s1 == s2);


        // New object in Heap
        String s3 = new String("Java");
        String s4 = new String("Java");

        // Different objects
        System.out.println(s3 == s4);


        // Pool vs Heap
        System.out.println(s1 == s3);


        // equals() checks content
        System.out.println(s1.equals(s3));
        System.out.println(s3.equals(s4));


        // Another example
        String a = "Hello";
        String b = "Hello";

        System.out.println(a == b);


        // new creates separate objects
        String c = new String("Hello");
        String d = new String("Hello");

        System.out.println(c == d);
        System.out.println(c.equals(d));
    }
}