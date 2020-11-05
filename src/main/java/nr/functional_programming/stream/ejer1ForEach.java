package nr.functional_programming.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import nr.functional_programming.models.User;

public class ejer1ForEach {
    private static List<User> users;

    public static void main(String[] args) {
        setUpUser();
        Stream.of(users).forEach(System.out::println);
        users.stream().forEach(v->v.setName(v.getName()+ " Apellido"));
        users.stream().forEach(System.out::println);
    }

    private static void setUpUser() {
        users = Arrays.asList(
            new User(1,"Fernando"),
            new User(2,"Ximena"),
            new User(3,"Axel"),
            new User(4,"Diana"),
            new User(5,"Ximena"),
            new User(6,"Fernando")
        );
    }
}
