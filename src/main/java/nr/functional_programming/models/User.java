package nr.functional_programming.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private int id;
    private String name;

    public static void referenciaAMetodoEstatico() {
        System.out.println("Probrando referencia a Método Estatico");
    }

    public void referenciaAMetodoParticular() {
        System.out.println("Probrando referencia a Método Particular");
    }

    public void showName() {
        System.out.println(name);
    }
}
