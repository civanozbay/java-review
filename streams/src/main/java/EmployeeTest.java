import Tasks_Stream_2.State;

import java.util.ArrayList;
import java.util.List;

public class EmployeeTest {
    public static void main(String[] args) {

        //print all emails - one employee has one email -> One To One
        EmployeeData.readAll()
                .map(Employee::getEmpEmail)
                .forEach(System.out::println);

        //print all phone numbers
        EmployeeData.readAll()
                .map(Employee::getEmpPhoneNumbers)
                .forEach(System.out::println);

        EmployeeData.readAll()
                .flatMap(employee -> employee.getEmpPhoneNumbers().stream()) // we use flattering in here
                .forEach(System.out::println);

        System.out.println("===========================================");
        EmployeeData.readAll()
                .map(Employee::getEmpPhoneNumbers)
                .flatMap(List::stream)
                .forEach(System.out::println);


        // Task from the Stream-2 presentation
        System.out.println("===========================================");
        State asd = new State();
        asd.addCity("ankara");
        asd.addCity("marmaris");
        asd.addCity("mus");

        // null liste -> function -> data ekle -> print=
        asd.getCities().stream()
                .forEach(System.out::println);

        System.out.println("===========================================");
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);




    }
}
