package nr.functional_programming.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ejer18PartitioningBy {

    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(5, 7, 35, 56, 2, 3, 67, 4, 98);
        // TODO: BELLEZA PAPA 
        Map<Boolean, List<Integer>> mayoresQue10 = nums.stream().collect(Collectors.partitioningBy(e -> e > 10));
        System.out.println(mayoresQue10);
        mayoresQue10.get(true).forEach(System.out::println);
        mayoresQue10.get(false).forEach(System.out::println);
    }

}
