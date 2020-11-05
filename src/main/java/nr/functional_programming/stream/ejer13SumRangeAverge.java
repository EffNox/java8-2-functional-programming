package nr.functional_programming.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

import nr.functional_programming.models.User;

public class ejer13SumRangeAverge {
    private static List<User> users;

    public static void main(String[] args) {
        setUpUser();
        System.out.println(users.stream().mapToInt(User::getId).sum());
        System.out.println(users.stream().mapToInt(User::getId).average().getAsDouble());
        System.out.println(IntStream.rangeClosed(1,20).sum());
    }

    private static void setUpUser() {
        users = Arrays.asList(new User(1, "Fernando"), new User(2, "Ximena"), new User(3, "Axel"), new User(4, "Diana"),
                new User(5, "Ximena"), new User(6, "Fernando"));
    }
}
