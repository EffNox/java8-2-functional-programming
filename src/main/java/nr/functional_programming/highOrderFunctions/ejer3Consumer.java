package nr.functional_programming.highOrderFunctions;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class ejer3Consumer {
    public static void main(String[] args) {
        List<String> noms = Arrays.asList("Fernando", "Ximena", "Azel", "yHobna");
        ejer3Consumer hof = new ejer3Consumer();
        hof.filtrar(noms, System.out::println, 15);
    }

    public void filtrar(List<String> lst, Consumer<String> consumer, int maxCarac) {
        lst.stream().filter(logicaPred(maxCarac)).forEach(consumer);
    }

    public Predicate<String> logicaPred(int maxCarac) {
        return e -> e.length() < maxCarac;
    }

}
