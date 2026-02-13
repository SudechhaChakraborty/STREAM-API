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

        // UC 2.2 - map (double values)
        System.out.println("UC 2.2 - map (double values):");
        List<Integer> doubled = numbers.stream()
                .map(n -> n * 2)
                .collect(Collectors.toList());
        System.out.println(doubled);
        System.out.println();

        // UC 2.3 - collect into new list
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
    }
}
