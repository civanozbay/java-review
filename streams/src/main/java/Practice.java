import java.util.Arrays;
import java.util.List;

public class Practice {

    public static void main(String[] args) {
        List<String> words = Arrays.asList("JAVA","APPLE","HONDA","DEVELOPER");

        words.stream()
                .map(String::length)
                .forEach(System.out::println);

        List<Dish> menu = Arrays.asList(
                new Dish("pork",false,800,Type.MEAT),
                new Dish("beef",false,700,Type.MEAT),
                new Dish("chicken",false,400,Type.MEAT),
                new Dish("fries",true,530,Type.MEAT),
                new Dish("rice",true,350,Type.MEAT),
                new Dish("fruit",true,120,Type.MEAT),
                new Dish("pizza",true,550,Type.MEAT),
                new Dish("prawns",false,300,Type.MEAT),
                new Dish("salmon",false,450,Type.MEAT)
                );
        System.out.println("--------------------------------------------");
        // print all dish's name that has less than 400 calories
        menu.stream()
                .filter(i -> i.getCalories()>400)
                .forEach(k-> System.out.println(k.getName()));
        System.out.println("--------------------------------------------");
        // print the length of the name of each dish
        menu.stream()
                .map(i -> i.getName().length())
                .forEach(System.out::println);
    }

}
