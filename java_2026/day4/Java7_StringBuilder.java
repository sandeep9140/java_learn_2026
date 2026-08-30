public class Java7_StringBuilder {

    public static void main(String[] args) {

        // 1. Creating StringBuilder
        StringBuilder sb = new StringBuilder();

        System.out.println("Initial: " + sb);


        // 2. append()
        sb.append("Hello");

        System.out.println("After append: " + sb);


        // 3. Append more data
        sb.append(" ");
        sb.append("Java");

        System.out.println("After more append: " + sb);


        // 4. append different data types
        sb.append(" ");
        sb.append(2026);
        sb.append(" ");
        sb.append(true);

        System.out.println("After different values: " + sb);


        // 5. insert()
        sb.insert(6, "Beautiful ");

        System.out.println("After insert: " + sb);


        // 6. delete()
        sb.delete(6, 16);

        System.out.println("After delete: " + sb);


        // 7. reverse()
        sb.reverse();

        System.out.println("After reverse: " + sb);


        // 8. Convert StringBuilder to String
        String result = sb.toString();

        System.out.println("String result: " + result);
    }
}