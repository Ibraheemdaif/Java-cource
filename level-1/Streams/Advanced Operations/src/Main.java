import java.util.*;
import java.util.stream.Collectors;

public class Main {
    List<Employee> employees = Arrays.asList(
            new Employee("Ali", 30, "HR", 5000),
            new Employee("Mona", 25, "IT", 7000),
            new Employee("Ahmed", 30, "HR", 5500),
            new Employee("Sara", 27, "IT", 7200),
            new Employee("Omar", 40, "Finance", 8000),
            new Employee("Laila", 35, "Finance", 8200)
    );

    List<Student> students = Arrays.asList(
            new Student("Ali", "IT", 85),
            new Student("Mona", "CS", 92),
            new Student("Ahmed", "IT", 60),
            new Student("Sara", "CS", 70),
            new Student("Omar", "IS", 45),
            new Student("Laila", "IS", 78)
    );

    // ========= Case 1 ============

    List<Employee> sortedEmployees = employees.stream()
            .sorted(Comparator.comparingDouble((Employee e) -> e.getSalary())
                    .thenComparing(e -> e.getName()))
            .collect(Collectors.toList());

    // ========= Case 2 ============

    List<Integer> numbers = Arrays.asList(5, 9, 11, 2, 11, 8, 3);

    Optional<Integer> secondHighest = numbers.stream()
            .distinct()
            .sorted((a, b) -> b.compareTo(a))
            .skip(1)
            .findFirst();

    // ========= Case 3 ============

    List<Integer> numList = Arrays.asList(1, 2, 3, 2, 4, 5, 3, 6, 1);

    List<Integer> duplicates = numList.stream()
            .collect(Collectors.groupingBy(n -> n, Collectors.counting()))
            .entrySet().stream()
            .filter(entry -> entry.getValue() > 1)
            .map(entry -> entry.getKey())
            .collect(Collectors.toList());

    // ========= Case 4 ============

    List<String> strings = Arrays.asList("Java", "", null, "Stream", "  ", null, "Code");

    List<String> cleanStrings = strings.stream()
            .filter(str -> str != null && !str.trim().isEmpty())
            .collect(Collectors.toList());

    // ========= Case 5 ============

    Map<Boolean, List<Student>> passFailGroups = students.stream()
            .collect(Collectors.partitioningBy(s -> s.getGrade() >= 50));

}