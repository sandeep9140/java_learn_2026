public class Java3_Immutable {

    public static void main(String[] args) {

        // Original String
        String name = "Aryan";

        System.out.println("Before: " + name);

        // Trying to change the String
        name.concat(" Chaurasia");

        System.out.println("After concat(): " + name);


        // Correct way
        name = name.concat(" Chaurasia");

        System.out.println("After assigning: " + name);


        // Another example
        String city = "Delhi";

        String newCity = city.toUpperCase();

        System.out.println("Original city: " + city);
        System.out.println("New city: " + newCity);


        // String replacement
        String language = "Java";

        String result = language.replace("Java", "Python");

        System.out.println("Original: " + language);
        System.out.println("Result: " + result);
    }
}