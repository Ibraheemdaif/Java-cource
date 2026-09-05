import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {
    static void main() {


        //============= Case 1 (Count the number of strings longer than 5 characters) =============

        List<String> names = Arrays.asList("Mona", "Ali", "Ahmed", "Sara", "Amr", "Laila", "Kareem", "Nada", "Nour", "Samy", "");

        long count = names.stream()
                .filter(str -> str.length() > 5)
                .count();
        System.out.println(count);


        //============= Case 2 (Find the first element in a stream that matches a given condition.)=============

        String requireElement = names.stream()
                                     .filter(str -> str.startsWith("A"))
                                     .findFirst().get();
        System.out.println(requireElement);


        //============= Case 3 (Check if any number is divisible by 5 in a list.)=============

        List<Integer> numbers = Arrays.asList(3,5,7,2,1,8,9,7,6,0);
        boolean isDivisible = numbers.stream()
                .anyMatch(num -> num % 5 == 0);

        System.out.println(isDivisible);

        //============= Case 4 (Collect elements into a Set instead of a List)================

        Set<Integer> set = numbers.stream()
                .collect(Collectors.toSet());
        System.out.println(set);

        //============= Case 5 (Skip the first 3 elements and return the rest.)================

        List<Integer> updatedList = numbers.stream()
                .skip(3)
                .toList();
        System.out.println(updatedList);






    }
}
