import java.util.List;
import java.util.Optional;

public class Main {
    // ========== Case 1 (Calculate the sum of a list of integers using reduce.) ==========
    static void main() {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);

        int sum = numbers.stream()
                .reduce(0,(a,b) -> a + b);
        System.out.println(sum);

        // ========== Case 2 (Find the maximum and minimum value in a list.) ==========

        Optional<Integer> max = numbers.stream()
                .max(Integer::compareTo);

        Optional<Integer> min = numbers.stream()
                .min(Integer::compareTo);

        int maxValue = max.orElse(0);
        int minValue = min.orElse(0);

        System.out.println(maxValue); // 5
        System.out.println(minValue); // 1



        // ========== Case 3 (Calculate the average of a list of doubles.) ==========

        List<Double> doubles = List.of(2.5, 4.0, 7.5, 10.0);

        double average = doubles.stream()
                .mapToDouble(d -> d.doubleValue())
                .average()
                .orElse(0.0);
        System.out.println(average); // 6


        // ========== Case 3 (Multiply all integers in a list together using reduce.) ==========

        int product = numbers.stream()
                .reduce(1, (a, b) -> a * b);

        System.out.println(product); // 120

        // ========== Case 3 (Count how many numbers are positive in a list.) ==========

        long positiveCount = numbers.stream()
                .filter(n -> n > 0)
                .count();

        System.out.println(positiveCount); // 5
    }
}