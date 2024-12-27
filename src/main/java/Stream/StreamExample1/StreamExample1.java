import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample1 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 12, 8, 20, 7);
        List<Integer> filteredNumbers = numbers.stream()
                .filter(n -> n > 10)
                .collect(Collectors.toList());

        System.out.println(filteredNumbers); // [12, 20]
    }
}