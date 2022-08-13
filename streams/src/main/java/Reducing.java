import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Reducing {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(4,5,3,9);
        Integer result = numbers.stream().reduce(0, (a, b) -> a + b); //whats happening=is gonna take the initial value and its take the first element and then implement logic
        System.out.println(result);

        // No initial value
        Optional<Integer> result2 = numbers.stream().reduce((a, b) -> a + b);
        System.out.println(result2);

        // max and min
        Optional<Integer> min = numbers.stream().reduce(Integer::min);
        Optional<Integer> max = numbers.stream().reduce(Integer::max);
        Optional<Integer> sum = numbers.stream().reduce(Integer::sum);

        System.out.println("Min "+min.get() +" Max "+max.get()+" Sum "+sum.get());

        //TASK (same thing is two of them)
        int dishCount = DishData.getAll().stream()
                .map(d -> 1).reduce(0, (a, b) -> a + b);

        long dcount = DishData.getAll().stream().count();


    }
}
