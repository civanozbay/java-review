package task2;

import java.util.ArrayList;
import java.util.List;

public class CarTest2 {
    public static void main(String[] args) {
        List<Cars> c = new ArrayList<>();
        //c.add(new Cars(1990,2000,250));
        //c.add(new Cars(1990,2022,350));
        //c.add(new Cars(1990,1990,100));

        c.add(Cars.builder().make(123).topSpeed(200).year(1990).build());
        c.add(Cars.builder().make(654).topSpeed(230).year(2013).build());



    }
}
