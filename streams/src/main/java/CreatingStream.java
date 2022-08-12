import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class CreatingStream {

    public static void main(String[] args) {

        //Creating Stream from Array
        String[] courses = {"Java","JS","TS"};
        Stream<String> courseStream = Arrays.stream(courses);

        //Creating stream from collection
        List<String> courseList = Arrays.asList("Java","JS","TS");
        Stream<String> courseStream2 = courseList.stream();

        List<Course> myCourses = Arrays.asList(
                new Course("Java",100),
                new Course("DS",101),
                new Course("Spring",102)
        );

        Stream<Course> myCourseStream = myCourses.stream();


        //Creating stream from values (there is no so much using for that one)
        Stream<Integer> stream = Stream.of(1,23,4,5);







    }
}
