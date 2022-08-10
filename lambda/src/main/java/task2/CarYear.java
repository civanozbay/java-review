package task2;

public class CarYear implements CarFilter{

    @Override
    public boolean filter(Cars cars) {
        return cars.getYear() > 2015;
    }
}
