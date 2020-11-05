package nr.functional_programming.stream;

import java.util.Arrays;
import java.util.List;
import nr.functional_programming.models.User;

public class ejer3Filter {
    private static List<User> users;

    public static void main(String[] args) {
        setUpUser();
        users.stream().filter(v -> v.getName() != "Axel").filter(v -> v.getId() < 3)
                .forEach(System.out::println);
    }

    private static void setUpUser() {
        users = Arrays.asList(new User(1, "Fernando"), new User(2, "Ximena"), new User(3, "Axel"), new User(4, "Diana"),
                new User(5, "Ximena"), new User(6, "Fernando"));
    }
}
