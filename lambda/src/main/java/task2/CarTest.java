package task2;

import java.util.ArrayList;
import java.util.List;

public class CarTest {
    public static void main(String[] args) {
        List<Cars> c = new ArrayList<>();
        c.add(new Cars(1990,2000,250));
        c.add(new Cars(1990,2022,350));
        c.add(new Cars(1990,1990,100));

        List<Cars> cars1 = filteredCars(c, new CarYear());
        System.out.println(cars1);

        List<Cars> newCarList = filteredCars(c,new CarTopSpeed());
        System.out.println(newCarList);

        // new car with lambda
        CarFilter carFilter = (Cars cars) -> cars.getYear() > 2015;
        List<Cars> cars = filteredCars(c, carFilter);
        System.out.println(cars);

        // fast car with lambda
        // if you have only one variable, you can remove variable type and ()
        List<Cars> fastCar = filteredCars(c,car -> car.getTopSpeed() > 160);
        System.out.println(fastCar);

    }
    public static List<Cars> filteredCars(List<Cars> cars,CarFilter carFilter){
        List<Cars> filteredCars = new ArrayList<>();
        for (Cars car : cars){
            if(carFilter.filter(car))
                filteredCars.add(car);
        }
        return filteredCars;
    }
}
