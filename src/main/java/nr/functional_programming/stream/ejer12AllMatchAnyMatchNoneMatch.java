package nr.functional_programming.stream;

import java.util.Arrays;
import java.util.List;
import nr.functional_programming.models.User;

public class ejer12AllMatchAnyMatchNoneMatch {
    private static List<User> users;

    public static void main(String[] args) {
        setUpUser();
        System.out.println(users.stream().allMatch(e -> e.getName().indexOf("a") > -1));
        System.out.println(users.stream().anyMatch(e -> e.getName().indexOf("X") > -1));
        System.out.println(users.stream().noneMatch(e -> e.getName().indexOf("Axels") > -1));
    }

    private static void setUpUser() {
        users = Arrays.asList(new User(1, "Fernando"), new User(2, "Ximena"), new User(3, "Axel"), new User(4, "Diana"),
                new User(5, "Ximena"), new User(6, "Fernando"));
    }
}
