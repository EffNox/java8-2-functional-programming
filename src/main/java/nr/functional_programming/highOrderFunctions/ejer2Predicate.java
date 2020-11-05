package nr.functional_programming.highOrderFunctions;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ejer2Predicate {
    public static void main(String[] args) {
        List<Integer> l = Arrays.asList(6, 23, -5, 4, 69, -9, -67, 46);
        BiFunction<List<Integer>, Predicate<Integer>, List<Integer>> filtrar = (lst1, pred) -> lst1.stream()
                .filter(e -> pred.test(e)).collect(Collectors.toList());
        System.out.println(filtrar.apply(l, e -> e > 0));
    }
}
