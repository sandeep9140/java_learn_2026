public class Java5_new_literals {

    public static void main(String[] args) {

        // 1. String literal
        String s1 = "Java";
        String s2 = "Java";

        System.out.println("s1 == s2: " + (s1 == s2));
        System.out.println("s1.equals(s2): " + s1.equals(s2));


        // 2. Using new keyword
        String s3 = new String("Java");
        String s4 = new String("Java");

        System.out.println("s3 == s4: " + (s3 == s4));
        System.out.println("s3.equals(s4): " + s3.equals(s4));


        // 3. Literal and new object
        System.out.println("s1 == s3: " + (s1 == s3));
        System.out.println("s1.equals(s3): " + s1.equals(s3));


        // 4. Empty String
        String empty1 = "";
        String empty2 = "";

        System.out.println("empty1 == empty2: " + (empty1 == empty2));


        // 5. new String with empty value
        String empty3 = new String("");

        System.out.println("empty1 == empty3: " + (empty1 == empty3));
        System.out.println("empty1.equals(empty3): " + empty1.equals(empty3));


        // 6. String created using concatenation
        String firstName = "Aryan";
        String lastName = "Chaurasia";

        String fullName = firstName + " " + lastName;

        System.out.println("Full Name: " + fullName);


        // 7. Literal with same final value
        String x = "Aryan";
        String y = "Ary" + "an";

        System.out.println("x == y: " + (x == y));
        System.out.println("x.equals(y): " + x.equals(y));


        // 8. Runtime concatenation
        String a = "Ary";
        String b = "an";

        String c = a + b;

        System.out.println("c: " + c);
        System.out.println("x == c: " + (x == c));
        System.out.println("x.equals(c): " + x.equals(c));
    }
}