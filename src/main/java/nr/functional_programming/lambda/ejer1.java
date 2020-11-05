package nr.functional_programming.lambda;

import nr.functional_programming.interfaces.MiNombre;
import nr.functional_programming.interfaces.PorDefecto;
import nr.functional_programming.interfaces.Sumar;

public class ejer1 implements PorDefecto {
    public static void main(String[] args) {
        MiNombre miAnonimo = new MiNombre() {
            @Override
            public String nombre() {
                return "Fernando clase anonima";
            }
        };
        System.out.println(miAnonimo.nombre());

        MiNombre miLambda = () -> "Fernado lambda";
        System.out.println(miLambda.nombre());
        Sumar suma0 = new Sumar() {
            @Override
            public int suma(int a, int v) {
                return a + v;
            }
        };
        System.out.println(suma0.suma(10, 5));

        Sumar suma1 = (a, v) -> a + v;
        System.out.println(suma1.suma(10, 5));

        Sumar suma2 = (a, v) -> {
            a = v * v;
            a += a * v;
            System.out.println(a);
            return a;
        };
        suma2.suma(10, 5);
        ejer1 e = new ejer1();
        System.out.println(e.nomPorDefecto("Fernando"));
    }

    @Override
    public void showName(String nom) {

    }

}
