public class Java1_String {

    public static void main(String[] args) {

        // 1. String using String literal
        String name = "Aryan";

        // 2. Another String
        String course = "Java";

        // 3. Printing String
        System.out.println("Name: " + name);
        System.out.println("Course: " + course);

        // 4. String concatenation
        String message = "Hello " + name;

        System.out.println(message);

        // 5. String with multiple values
        String info = "My name is " + name + " and I am learning " + course;

        System.out.println(info);

        // 6. String length
        System.out.println("Length of name: " + name.length());

        // 7. Accessing characters using charAt()
        System.out.println("First character: " + name.charAt(0));
        System.out.println("Second character: " + name.charAt(1));

        // 8. Last character
        System.out.println("Last character: " + name.charAt(name.length() - 1));

        // 9. Empty String
        String empty = "";

        System.out.println("Empty String length: " + empty.length());
    }
}