public class Java9_StringBuffer {

    public static void main(String[] args) {

        // 1. Create StringBuffer
        StringBuffer sb = new StringBuffer();

        System.out.println("Initial: " + sb);


        // 2. append()
        sb.append("Hello");

        System.out.println("After append: " + sb);


        // 3. Append more data
        sb.append(" Java");

        System.out.println("After more append: " + sb);


        // 4. insert()
        sb.insert(6, "Beautiful ");

        System.out.println("After insert: " + sb);


        // 5. delete()
        sb.delete(6, 16);

        System.out.println("After delete: " + sb);


        // 6. setCharAt()
        sb.setCharAt(0, 'h');

        System.out.println("After setCharAt: " + sb);


        // 7. reverse()
        sb.reverse();

        System.out.println("After reverse: " + sb);


        // 8. Reverse again
        sb.reverse();

        System.out.println("Original order: " + sb);


        // 9. length()
        System.out.println("Length: " + sb.length());


        // 10. capacity()
        System.out.println("Capacity: " + sb.capacity());


        // 11. Convert StringBuffer to String
        String result = sb.toString();

        System.out.println("String: " + result);
    }
}