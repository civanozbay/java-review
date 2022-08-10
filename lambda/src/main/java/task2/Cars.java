package task2;

import lombok.Builder;

@Builder
public class Cars {
    private int make;
    private int year;
    private double topSpeed;

    public Cars(int make, int year, double topSpeed) {
        this.make = make;
        this.year = year;
        this.topSpeed = topSpeed;
    }

    @Override
    public String toString() {
        return "Cars{" +
                "make=" + make +
                ", year=" + year +
                ", topSpeed=" + topSpeed +
                '}';
    }

    public int getMake() {
        return make;
    }

    public void setMake(int make) {
        this.make = make;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(double topSpeed) {
        this.topSpeed = topSpeed;
    }
}
