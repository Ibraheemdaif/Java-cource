import com.sun.source.tree.Tree;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    static void main() {

        //============= Case 1 (Filter even numbers from a list of integers.)============

        List<Integer> numbers = Arrays.asList(10, 5, 3, 7, 2, 10, 5, 8, 9, 0, -3, 4);

        numbers.stream()
                .filter(num -> num % 2 == 0)
                .forEach(elem -> System.out.print(elem + "\t")); // 10 2 20 8 0 4 (With repetation)

        //============= Case 2 (Find names starting with a specific letter from a list of strings.)============

        List<String> names = Arrays.asList("Ali", "Mona", "Ahmed", "Sara", "Amr", "Laila", "Kareem", "Nada", "Nour", "Samy", "", null);
        try {

            names.stream()
                    .filter(name -> name.startsWith("A"))
                    .forEach(name -> System.out.print(name + "\t")); // Ali   Ahmed   Amr   exception

        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }

        //============= Case 3 (Convert all strings to uppercase using stream.)============

        try {

        names.stream()
                .map(name -> name.toUpperCase())
                .forEach(name -> System.out.print(name + "\t"));

        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }



        //============= Case 4,5 (Sort a list of integers in descending order using streams , Remove duplicate)============

        List<Integer> result = numbers.stream()
                .distinct() // prevent repetation
                .sorted(Comparator.reverseOrder()) // descending order
                .collect(Collectors.toList());
        System.out.println(result); // [10, 9, 8, 7, 5, 4, 3, 2, 0, -3]




//        System.out.println(numbers.stream().allMatch(elem -> elem > 6));
//        var list = numbers.stream().filter(elem -> elem % 2 ==0).toList();
//        System.out.println(list);
//
//
//        List<Employee> employees = Arrays.asList(
//                new Employee(1, "ibraheem", "Tech"),
//                new Employee(2, "Ahmed", "HR"),
//                new Employee(3, "Mohammed", "Tech"),
//                new Employee(4, "Yousef", "Tech"),
//                new Employee(5, "Ali", "Finance"),
//                new Employee(6, "Aya", "Management"),
//                new Employee(7, "Yara", "Marketing"),
//                new Employee(8, "Said", "Tech"),
//                new Employee(9, "Omer", "Accounting"),
//                new Employee(10, "Bella", "Tech")
//
//                );
//        List<String> techDepartment = employees.stream()
//                .filter(emp -> emp.getDepartment().equals("Tech"))
//                .map((emp) -> emp.getName())
//                .collect(Collectors.toList());
//        System.out.println(techDepartment);
//
//        Map<Integer, String> employeesMap = employees.stream()
//                .collect(Collectors.toMap(emp -> emp.getId(), emp -> emp.getName()));
//        System.out.println(employeesMap);

    }
}