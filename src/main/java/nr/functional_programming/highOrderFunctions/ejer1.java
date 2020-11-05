package nr.functional_programming.highOrderFunctions;

import java.util.function.Function;
import nr.functional_programming.interfaces.ISumar;

public class ejer1 implements ISumar {
    public static void main(String[] args) {
        ejer1 hof = new ejer1();
        // System.out.println(hof.suma(2, 3));
        // System.out.println(hof.apply(2, 3));
        // ISumar sumai = (a, b) -> a + b;
        // System.out.println(hof.sumarHighOrder(sumai, 2, 5));
        System.out.println(hof.sumarHighOrder((a, b) -> a + b, 2, 5));
        Function<String, String> fn = e -> e.toUpperCase();
        System.out.println(hof.printUpperCase(fn,"fernando"));
    }

    public int suma(int a, int b) {
        return a + b;
    }

    @Override
    public int apply(int a, int b) {
        return a + b;
    }

    public int sumarHighOrder(ISumar suma, int a, int b) {
        return suma.apply(a, b);
    }

    public String printUpperCase(Function<String, String> fn, String nom) {
        return fn.apply(nom);
    }

}
