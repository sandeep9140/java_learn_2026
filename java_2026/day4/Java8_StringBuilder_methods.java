public class Java8_StringBuilder_methods {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Hello Java");


        // 1. length()
        System.out.println("Length: " + sb.length());


        // 2. capacity()
        System.out.println("Capacity: " + sb.capacity());


        // 3. charAt()
        System.out.println("Character at index 1: " + sb.charAt(1));


        // 4. setCharAt()
        sb.setCharAt(0, 'h');

        System.out.println("After setCharAt(): " + sb);


        // 5. append()
        sb.append(" World");

        System.out.println("After append(): " + sb);


        // 6. insert()
        sb.insert(6, "Beautiful ");

        System.out.println("After insert(): " + sb);


        // 7. delete()
        sb.delete(6, 16);

        System.out.println("After delete(): " + sb);


        // 8. deleteCharAt()
        sb.deleteCharAt(0);

        System.out.println("After deleteCharAt(): " + sb);


        // 9. replace()
        sb.replace(0, 5, "Hi");

        System.out.println("After replace(): " + sb);


        // 10. reverse()
        sb.reverse();

        System.out.println("After reverse(): " + sb);


        // 11. Reverse again
        sb.reverse();

        System.out.println("Original order again: " + sb);


        // 12. indexOf()
        System.out.println("Index of Java: " + sb.indexOf("Java"));


        // 13. lastIndexOf()
        System.out.println("Last index of a: " + sb.lastIndexOf("a"));


        // 14. substring()
        System.out.println("Substring: " + sb.substring(0, 5));


        // 15. toString()
        String result = sb.toString();

        System.out.println("Converted String: " + result);
    }
}