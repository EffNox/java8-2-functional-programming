package nr.functional_programming.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import nr.functional_programming.models.User;

public class ejer16toSet {
    private static List<User> users;

    public static void main(String[] args) {
        setUpUser();
        users.stream().map(User::getName).collect(Collectors.toSet()).forEach(System.out::println);
    }

    private static void setUpUser() {
        users = Arrays.asList(new User(1, "Fernando"), new User(2, "Ximena"), new User(3, "Axel"), new User(4, "Diana"),
                new User(5, "Ximena"), new User(6, "Fernando"));
    }
}
