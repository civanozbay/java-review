import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class AppleTest {
    public static void main(String[] args) {
        List<Apple> inventory = new ArrayList<>();
        inventory.add(new Apple(300,Color.GREEN));
        inventory.add(new Apple(200,Color.YELLOW));
        inventory.add(new Apple(100,Color.GREEN));
        inventory.add(new Apple(50,Color.YELLOW));
        /*
        List<Apple> heavyApple = filterApples(inventory,new AppleHeavyPredicate());
        System.out.println(heavyApple);
        List<Apple> greenApples = filterApples(inventory,new AppleGreenColorPredicate());
        System.out.println(greenApples);
        */

        List<Apple> greenApple = filterApples(inventory,apple -> apple.getColor().equals(Color.GREEN));
        System.out.println(greenApple);
    }

    private static List<Apple> filterApples(List<Apple> inventory, Predicate<Apple>  apples) {
        List<Apple> result = new ArrayList<>();

        for(Apple apple : inventory){
            if(apples.test(apple)){
                result.add(apple);
            }
        }
        return result;
    }
    /*
        private static List<Apple> filterApples(List<Apple> inventory, ApplePredicate  applePredicate) {
        List<Apple> result = new ArrayList<>();

        for(Apple apple : inventory){
            if(applePredicate.test(apple)){
                result.add(apple);
            }
        }
        return result;
    }
     */
}
