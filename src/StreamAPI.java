import java.util.*;

public class StreamAPI {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1,2,3,4,5);

        // UC 2.1 - forEach
        System.out.println("UC 2.1 - forEach:");
        numbers.stream()
                .forEach(n -> System.out.print(n + " "));
    }
}
