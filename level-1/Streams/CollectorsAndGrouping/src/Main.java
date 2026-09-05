import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    static void main() {

        // ========= Case 1 ==========
        List<Student> students = Arrays.asList(
                new Student("Ali", "IT", 85),
                new Student("Mona", "CS", 92),
                new Student("Ahmed", "IT", 60),
                new Student("Sara", "CS", 70),
                new Student("Omar", "IS", 45),
                new Student("Laila", "IS", 78)
        );

        Map<String, List<Student>> studentsByDept = students.stream()
                .collect(Collectors.groupingBy(s -> s.getDepartment()));
        System.out.println(studentsByDept);


        // ========= Case 2 ==========

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        Map<Boolean, List<Integer>> partitionedNumbers = numbers.stream()
                .collect(Collectors.partitioningBy(n -> n % 2 == 0));

        // ========= Case 3 ==========

        List<String> words = Arrays.asList("Ali", "Mona", "Ahmed", "Sara");

        String commaSeparated = words.stream()
                .collect(Collectors.joining(", "));

        // ========= Case 4 ==========
        List<Employee> employees = Arrays.asList(
                new Employee("Ali", 30, "HR", 5000),
                new Employee("Mona", 25, "IT", 7000),
                new Employee("Ahmed", 30, "HR", 5500),
                new Employee("Sara", 27, "IT", 7200),
                new Employee("Omar", 40, "Finance", 8000),
                new Employee("Laila", 35, "Finance", 8200)
        );

        Map<Integer, Long> countByAge = employees.stream()
                .collect(Collectors.groupingBy(
                        e -> e.getAge(),
                        Collectors.counting()
                ));

        // ========= Case 5 ==========
        Map<String, Double> avgSalaryByDept = employees.stream()
                .collect(Collectors.groupingBy(
                        e -> e.getDepartment(),
                        Collectors.averagingDouble(e -> e.getSalary())
                ));
    }
}