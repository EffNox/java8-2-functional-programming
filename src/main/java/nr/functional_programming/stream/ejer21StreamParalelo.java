package nr.functional_programming.stream;

import java.util.Arrays;
import java.util.List;
import nr.functional_programming.models.User;

public class ejer21StreamParalelo {
    private static List<User> users;

    public static void main(String[] args) {
        setUpUser();
        long tiempo1 = System.currentTimeMillis();
        users.stream().map(User::getName).forEach(e -> convertToUpperCase(e));
        long tiempo2 = System.currentTimeMillis();
        System.out.println("Nomal: " + (tiempo2 - tiempo1));
        
        tiempo1 = System.currentTimeMillis();
        users.parallelStream().map(User::getName).forEach(e -> convertToUpperCase(e));
        tiempo2 = System.currentTimeMillis();
        System.out.println("Paralelo: " + (tiempo2 - tiempo1));

    }

    private static String convertToUpperCase(String nom) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return nom.toUpperCase();
    }

    private static void setUpUser() {
        users = Arrays.asList(new User(1, "Fernando"), new User(2, "Ximena"), new User(3, "Axel"), new User(4, "Diana"),
                new User(5, "Ximena"), new User(6, "Fernando"));
    }
}
