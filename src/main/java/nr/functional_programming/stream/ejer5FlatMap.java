package nr.functional_programming.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ejer5FlatMap {
    public static void main(String[] args) {
        List<List<String>> noms = new ArrayList<List<String>>(
                Arrays.asList(
                    new ArrayList<String>(Arrays.asList("Fernando", "Ximena", "Axel")),
                        new ArrayList<String>(Arrays.asList("Miguel", "Yomara", "Cinthya"))));

        List<String> nomsUniqueList = noms.stream().flatMap(e -> e.stream()).collect(Collectors.toList());
        nomsUniqueList.forEach(System.out::println);
    }
}
