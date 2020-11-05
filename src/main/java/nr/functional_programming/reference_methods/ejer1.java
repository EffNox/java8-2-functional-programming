package nr.functional_programming.reference_methods;

import java.util.ArrayList;
import java.util.List;

// import nr.functional_programming.interfaces.IUser;
import nr.functional_programming.interfaces.Trabajo;
import nr.functional_programming.interfaces.TrabajoString;
import nr.functional_programming.models.User;

public class ejer1 {
    public static void main(String[] args) {
        // Trabajo job = new Trabajo() {
        // @Override
        // public void accion() {
        // User.referenciaAMetodoEstatico();
        // }
        // };

        // Trabajo job = () -> User.referenciaAMetodoEstatico();
        // Trabajo job = User::referenciaAMetodoEstatico;
        // job.accion();

        User u = new User();
        // Trabajo job2 = () -> u.referenciaAMetodoParticular();
        Trabajo job2 = u::referenciaAMetodoParticular;
        job2.accion();

        // TrabajoString trabajoString = (v) -> v.toUpperCase();
        TrabajoString trabajoStringRM = String::toUpperCase;
        System.out.println(trabajoStringRM.accion("hola bro"));

        List<User> lstUser = new ArrayList<>();
        lstUser.add(new User(1,"Fernando"));
        lstUser.add(new User(2,"XImena"));
        lstUser.add(new User(3,"Amanda"));
        lstUser.add(new User(4,"Axel"));
        lstUser.forEach(User::showName);

        // IUser u = new IUser() {
            // @Override
            // public User crear(String name) {
                // return new User(name);
            // }
        // };
        // IUser u2 = (name) -> new User(name);
        // IUser u3 = User::new;

    }
}
