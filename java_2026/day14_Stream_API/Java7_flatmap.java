import java.util.List;

public class Java7_flatmap {
    public static void main(String[] args) {
        List<List<String>> skills = List.of(
                List.of("Java", "Spring Boot"),
                List.of("Python", "Django"),
                List.of("Java", "SQL")
            );

        List<String> result=skills.stream()
                                .flatMap(list -> list.stream())
                                .toList();


            System.out.println(result);

    }

}
