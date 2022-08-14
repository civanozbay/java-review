import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalDemo {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(2,4,2,10,23);

        //empty() - isPresent()
        Optional<String> empty = Optional.empty();
        System.out.println(empty.isPresent());
        System.out.println(Optional.of(numbers).isPresent()); // why we did this ? - because it numbers is not belong to Option class that's why we convert this to optinal

        //ifPresent
        Optional<Integer> bigNumber = numbers.stream().filter(x -> x > 100).findAny();
        bigNumber.ifPresent(System.out::println);

        //get
        // System.out.println(bigNumber.get()); // anlamadim

        //orElse
        System.out.println(bigNumber.orElse(0));




    }
}
