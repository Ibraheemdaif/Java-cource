import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {
    static void main() {
        //=========== case 1 =========
        List<List<String>> listOfLists = Arrays.asList(
                Arrays.asList("A", "B"),
                Arrays.asList("C", "D"),
                Arrays.asList("E", "F")
        );

        List<String> flattenedList = listOfLists.stream()
                .flatMap(list -> list.stream())
                .collect(Collectors.toList());

        //=========== case 2 =========

        List<String> words = Arrays.asList("hello", "world");

        List<String> uniqueCharacters = words.stream()
                .flatMap(word -> Arrays.stream(word.split("")))
                .distinct()
                .collect(Collectors.toList());

        //=========== case 3 =========
        List<Optional<String>> optionalList = Arrays.asList(
                Optional.of("Java"),
                Optional.empty(),
                Optional.of("Stream"),
                Optional.empty()
        );

        List<String> nonEmptyValues = optionalList.stream()
                .filter(opt -> opt.isPresent())
                .map(opt -> opt.get())
                .collect(Collectors.toList());


        //=========== case 4 =========

        List<String> names = Arrays.asList("Ali", "Mona", "Ahmed", "Sara");

        List<Integer> lengths = names.stream()
                .map(str -> str.length())
                .collect(Collectors.toList());

        //=========== case 5 =========

        List<String> wordList = Arrays.asList("apple", "banana", "Avocado", "orange", "apricot");

        List<String> filteredWords = wordList.stream()
                .map(word -> word.toUpperCase())
                .filter(word -> word.startsWith("A"))
                .collect(Collectors.toList());

    }
}