package functionalInterfaces;

import java.util.function.*;

public class Examples {
    public static void main(String[] args) {
        ////////////*********PREDICATE**************/////////////
        // how to write this like that :
        // 1.we are using java ready functional interface
        // 2.a represent the parameter
        // 3.we dont need to write access modifier and type of "a" and return type
        Predicate<Integer> lesserThan = a -> a<18; // implementation of test method that belongs to predicate interface

        boolean test = lesserThan.test(50);// output is null because if the method return something you should assign the value
        // or directly write to system.out.println
        System.out.println(test);

        ////////////*********CONSUMER**************/////////////
        Consumer<Integer> display = i -> System.out.println(i);
        display.accept(50); //since it does not return anything we dont need to assign value

        ////////////*********BICONSUMER**************/////////////
        BiConsumer<Integer,Integer> addTwo = (x,y) -> System.out.println(x+y);
        addTwo.accept(100,200);

        ////////////*********FUNCTION**************/////////////
        Function<String,String> fun = s -> "Hello " + s;
        String ozzy = fun.apply("Ozzy");
        System.out.println(ozzy);

        ////////////*********SUPPLIER**************/////////////
        Supplier<Double> randomValue = () -> Math.random();
        System.out.println(randomValue.get());

    }
}
