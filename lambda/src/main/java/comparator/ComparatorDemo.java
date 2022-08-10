package comparator;

import java.util.*;

import static java.util.Comparator.comparing;

public class ComparatorDemo {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(10, 20, 30, 40, 50);
        System.out.println(integers);

        // Ascendıng order
        Collections.sort(integers);
        System.out.println(integers);

        //Descendıng order
        Collections.sort(integers,new MyComparator());
        System.out.println(integers);

        Collections.sort(integers,((o1, o2) -> (o1>o2) ? -1: (o2<o1) ? 1 : 0));

        //Ascendıng
        integers.sort(((o1, o2) -> o1.compareTo(o2)));

        //Descendıng
        integers.sort(((o1, o2) -> o2.compareTo(o1)));


        List<Apple> myInventory =Arrays.asList(
                new Apple(10,Color.GREEN),
                new Apple(20,Color.YELLOW),
                new Apple(5,Color.GREEN),
                new Apple(30,Color.YELLOW)
        );
        Comparator<Apple> sortApple = comparing((Apple apple) -> apple.getWeight());
        myInventory.sort(sortApple);
        System.out.println(myInventory);

        myInventory.sort(comparing((apple)-> apple.getWeight()));

        myInventory.sort(comparing(Apple::getWeight));

        //REVERSED
        myInventory.sort(comparing(Apple::getWeight).reversed());

        //CHAINING
        myInventory.
                sort(comparing(Apple::getColor).
                        reversed().
                            thenComparing(Apple::getColor));
        System.out.println(myInventory);
    }
}
