package functionalInterfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class UserTest {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        users.add(new User("Ali","kara",32));
        users.add(new User("Kemal","kapakara",25));
        users.add(new User("Tarik","Teke",15));

        // print all elements in the list
        //printName(users,p -> true);

        // print all users that last name starts with E
        printName(users , user -> user.getLastName().startsWith("T") );
    }
    private static void printName(List<User> users, Predicate<User> p){
        for (User user : users){
            if(p.test(user)){
                System.out.println(user.toString());
            }
        }
    }
}
