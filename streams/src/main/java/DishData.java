import java.util.Arrays;
import java.util.List;

public class DishData {
    public static List<Dish> getAll(){
        return Arrays.asList(
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
    }
}
