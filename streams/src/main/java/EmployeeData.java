import java.util.Arrays;
import java.util.stream.Stream;

public class EmployeeData {

    public static Stream<Employee> readAll (){
        return Stream.of(
                new Employee(100,"Mike","mike@cydeo.com", Arrays.asList("123124124123","123124123")),
                new Employee(101,"Ozzy","ozzy@cydeo.com", Arrays.asList("43287648273","9348938448")),
                new Employee(102,"Peter","peter@cydeo.com", Arrays.asList("49859404332","3845394856"))
        );
    }
}
