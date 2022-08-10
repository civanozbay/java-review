package task2;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.*;

public class Practice {

    public static void main(String[] args) {

        // one parameter return boolean value
        Predicate<Integer> greaterThan10 = num -> num>10;
        System.out.println(greaterThan10.test(5));

        // two input - return boolean value
        BiPredicate<Integer,Integer> greaterThan = (num1,num2) -> num1>num2;
        System.out.println(greaterThan.test(20,125));

        //one parameter , no return
        Consumer<String> printStar = str -> System.out.println("*** "+str+" ***");
        printStar.accept("Harold");

        BiConsumer<String,String> combine = (str1,str2) -> System.out.println( str1+""+str2);
        combine.accept("Harold","Finch");

        // create a method that takes string and integer print the string given number of times
        BiConsumer<String,Integer> print = (word,times) -> {
            for(int i=0;i<times;i++){
                System.out.println(word);
            }
        };
        print.accept("Civan",3);

        // another task
        Map<String,Integer> map = new LinkedHashMap<>();
        map.put("Steven",6000);
        map.put("Mike",4000);
        map.put("Joe",3000);
        map.put("Albus",2000);

        // print the name of the employees whose salary is greater than 5000
        map.forEach((key,value)->{
            if(value>5000){
                System.out.println(key);
            }
        });

        // one param and return one
        Function<Integer,Integer> squared = x -> x*x;
        System.out.println(squared.apply(4));




    }


}
