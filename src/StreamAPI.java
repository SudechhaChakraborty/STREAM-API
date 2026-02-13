import java.util.*;
import java.util.stream.Collectors;

public class StreamAPI {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1,2,3,4,5);

        // UC 2.1 - forEach
        System.out.println("UC 2.1 - forEach:");
        numbers.stream()
                .forEach(n -> System.out.print(n + " "));
        System.out.println("\n");

        // UC 2.2 - map
        System.out.println("UC 2.2 - map (double values):");
        List<Integer> doubled = numbers.stream()
                .map(n -> n * 2)
                .collect(Collectors.toList());
        System.out.println(doubled);
        System.out.println();

        // UC 2.3 - collect
        System.out.println("UC 2.3 - collect:");
        List<Integer> collectedList = numbers.stream()
                .collect(Collectors.toList());
        System.out.println(collectedList);
        System.out.println();

        // UC 2.4 - filter even numbers
        System.out.println("UC 2.4 - filter (even numbers):");
        List<Integer> evenNumbers = numbers.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
        System.out.println(evenNumbers);
        System.out.println();

        // UC 2.5 - findFirst even number
        System.out.println("UC 2.5 - findFirst (first even number):");
        Optional<Integer> firstEven = numbers.stream()
                .filter(n -> n % 2 == 0)
                .findFirst();
        firstEven.ifPresent(System.out::println);
        System.out.println();

        // UC 2.6 - min and max
        System.out.println("UC 2.6 - min and max:");
        Optional<Integer> min = numbers.stream().min(Integer::compareTo);
        Optional<Integer> max = numbers.stream().max(Integer::compareTo);
        System.out.println("Minimum: " + min.get());
        System.out.println("Maximum: " + max.get());
        System.out.println();

        // UC 2.7 - sum and average
        System.out.println("UC 2.7 - sum and average:");
        int sum = numbers.stream()
                .mapToInt(Integer::intValue)
                .sum();

        double average = numbers.stream()
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0);

        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
    }
}
