package JavaCollectors.JavaCollectors;

import java.util.*;
import java.util.stream.Collectors;

public class JavaCollectors {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(3,4,5,6,6,70);
        // p.s. collectors are terminate operations
        //toCollection(Supplier) : is used to create a collection using collector
        System.out.println("***********TOCOLLECTION()***********");
        List<Integer> numberList = numbers.stream()
                .filter(x -> x % 2 == 0)
                .collect(Collectors.toCollection(ArrayList::new));
        System.out.println(numberList);

        Set<Integer> numberSet= numbers.stream()
                .filter(x-> x%2==0)
                .collect(Collectors.toCollection(HashSet::new));
        System.out.println(numberSet);

        //toList() : returns a Collector interface that gathers the input data into a new list
        System.out.println("***********TOLIST()***********");
        List<Integer> numberList2 = numbers.stream()
                .filter(x -> x % 2 == 0)
                .collect(Collectors.toList());

        System.out.println(numberList2);
        //toSet() : returns a collector interface that gathers the input data into a new set
        System.out.println("***********TOSET()***********");
        Set<Integer> numberList3 = numbers.stream()
                .filter(x -> x % 2 == 0)
                .collect(Collectors.toSet());
        System.out.println(numberList3);

        //toMap(Function,Function) : returns a collector interface that gathers the input data into a new map
        System.out.println("***********TOMAP()***********");
        // i cant implement the data because cant access to dish classes
        /*
        Map<String,Integer> dishMap = DishData.getAll().stream()
                .collect(Collectors.toMap(Dish::getName,Dish::getCalories));
        System.out.println(dishMap);
        */
        //counting() : returns a Collector that counts the number of the elements
        System.out.println("***********counting()***********");
        Long evenCount = numbers.stream()
                .filter(x -> x % 2 == 0)
                .collect(Collectors.counting());
        System.out.println(evenCount);
        System.out.println("***********SummingInt()***********");
        //summingInt(ToIntFunction) : returns a Collector that produces the sum of a integer-valued func
        /*
        DishData.getAll().stream()
                .collect(Collectors.summingInt(Dish::getCalories));
        */

        // averageingInt(ToIntFunction) : returns  the average of the integers passed values
        /*
        DishData.getAll().stream()
                .collect(Collectors.averagingInt(Dish::getCalories));
        */

        //joining() : is used to join various elements of a character or string array into a single string object
        System.out.println("***********joining()***********");
        List<String> strings = Arrays.asList("Java", "JS", "TS");
        String collect = strings.stream()
                .collect(Collectors.joining(","));
        System.out.println(collect);


        // IT IS A INTERVIEW QUESTION
        System.out.println("***********partioningBy()***********");
        // partioningBy() : is used to partition a stream of objects(or set of elements) based on a given predicate
        /*
        Map<Boolean,List<Dish>> veggieDish = DishData.getAll().stream()
                .collect(Collectors.partitioningBy(Dish::isVegeterian));

        */
        System.out.println("***********groupingBy()***********");
        // groupingBy() : is used for groping objects by some property and storing results in a map instance
        /*
        Map<Boolean,List<Dish>> veggieDish = DishData.getAll().stream()
                .collect(Collectors.groupingBy(Dish::getType));
        */













    }
}
