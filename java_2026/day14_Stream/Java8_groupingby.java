import java.util.List;
import  java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

class Employee {
    String name;
    String department;

    Employee(String name, String department) {
        this.name = name;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        return name;
    }
}

public class Java8_groupingby {

    public static void main(String[] args) {
        List<Employee> employees = List.of(
                new Employee("Sandeep", "IT"),
                new Employee("Rahul", "HR"),
                new Employee("Amit", "IT"),
                new Employee("Rohit", "Sales"),
                new Employee("Vikas", "HR")
            );

            Map<String,List<Employee>> result=employees.stream()
                                        .collect(Collectors.groupingBy(Employee::getDepartment));

            System.out.println(result);

    }

}
