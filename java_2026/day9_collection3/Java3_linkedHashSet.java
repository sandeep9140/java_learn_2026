import java.util.LinkedHashSet;
import java.util.Set;

public class Java3_linkedHashSet {
    // unique+ maintain insertio
    public static void main(String[] args) {
        // 1. Initialization
        LinkedHashSet<String> set = new LinkedHashSet<>();

        // 2. add(E e) - Inserts while preserving insertion order
        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");
        set.add("Banana"); // Duplicate - ignored

        System.out.println("Initial set (insertion order preserved): " + set);

        // 3. contains(Object o) - Check if element exists
        System.out.println("Contains 'Banana'? " + set.contains("Banana"));

        // 4. remove(Object o) - Remove a specific element
        set.remove("Banana");
        System.out.println("After remove('Banana'): " + set);

        // 5. size() & isEmpty()
        System.out.println("Size: " + set.size());
        System.out.println("Is empty? " + set.isEmpty());

        // 6. Iteration (Enhanced For-Loop)
        System.out.print("Iteration order: ");
        for (String item : set) {
            System.out.print(item + " ");
        }
        System.out.println();

        // 7. SequencedSet Methods (Java 21+)
        set.addFirst("Mango");  // Inserts at the beginning
        set.addLast("Grape");    // Inserts at the end
        System.out.println("\nAfter addFirst/addLast (Java 21+): " + set);
        System.out.println("First element: " + set.getFirst());
        System.out.println("Last element: " + set.getLast());
        System.out.println("Reversed view: " + set.reversed());

        // 8. clear() - Remove all elements
        set.clear();
        System.out.println("After clear(): " + set);
    }
}
    

