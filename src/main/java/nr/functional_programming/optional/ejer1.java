package nr.functional_programming.optional;

import java.util.Optional;

public class ejer1 {
    public static void main(String[] args) {
        isPresent(null);
    }

    public static void probarOptional(String name) {
        System.out.println(name.length());
    }

    public static void crearOptional(String name) {
        Optional<String> optional = Optional.empty();
        optional.get();
    }

    public static void orElseOptional(String name) {
        Optional<String> optional = Optional.ofNullable(name);
        // Optional<String> optional2 = Optional.of(name);
        String nombreOfNull = optional.orElse("hola");
        // String nombreOf = optional2.orElse("hola");
        System.out.println(nombreOfNull);
    }

    public static void orElseThrow(String name) {
        Optional<String> optional = Optional.ofNullable(name);
        optional.orElseThrow(NullPointerException::new);
        System.out.println(optional.get());
    }

    public static void isPresent(String name) {
        Optional<String> optional = Optional.ofNullable(name);
        System.out.println(optional.isPresent());
    }

}
