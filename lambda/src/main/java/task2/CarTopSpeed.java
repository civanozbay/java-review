package task2;

public class CarTopSpeed implements CarFilter{
    @Override
    public boolean filter(Cars cars) {
        return cars.getTopSpeed()>160;

    }
}
