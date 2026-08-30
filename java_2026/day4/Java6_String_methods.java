public class Java6_String_methods {

    public static void main(String[] args) {

        String text = "  Hello Java World  ";

        // 1. length()
        System.out.println("Length: " + text.length());


        // 2. trim()
        String trimmed = text.trim();
        System.out.println("Trimmed: " + trimmed);


        // 3. toUpperCase()
        System.out.println("Uppercase: " + trimmed.toUpperCase());


        // 4. toLowerCase()
        System.out.println("Lowercase: " + trimmed.toLowerCase());


        // 5. charAt()
        System.out.println("First character: " + trimmed.charAt(0));


        // 6. indexOf()
        System.out.println("Index of Java: " + trimmed.indexOf("Java"));


        // 7. lastIndexOf()
        System.out.println("Last index of a: " + trimmed.lastIndexOf("a"));


        // 8. contains()
        System.out.println("Contains Java: " + trimmed.contains("Java"));


        // 9. startsWith()
        System.out.println("Starts with Hello: " + trimmed.startsWith("Hello"));


        // 10. endsWith()
        System.out.println("Ends with World: " + trimmed.endsWith("World"));


        // 11. equals()
        String s1 = "Java";
        String s2 = "Java";

        System.out.println("Equals: " + s1.equals(s2));


        // 12. equalsIgnoreCase()
        String s3 = "java";

        System.out.println(
            "Equals Ignore Case: " + s1.equalsIgnoreCase(s3)
        );


        // 13. substring()
        String word = "Programming";

        System.out.println("Substring: " + word.substring(3));
        System.out.println("Substring with range: " + word.substring(0, 7));


        // 14. replace()
        String sentence = "I love Java";

        System.out.println(
            "Replace: " + sentence.replace("Java", "Python")
        );


        // 15. concat()
        String first = "Hello";
        String second = "World";

        System.out.println(
            "Concat: " + first.concat(" ").concat(second)
        );


        // 16. isEmpty()
        String empty = "";

        System.out.println("Is empty: " + empty.isEmpty());


        // 17. isBlank()
        String blank = "   ";

        System.out.println("Is blank: " + blank.isBlank());
    }
}