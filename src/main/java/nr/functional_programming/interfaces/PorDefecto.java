package nr.functional_programming.interfaces;

public interface PorDefecto {
    void showName(String nom);

    default String nomPorDefecto(String nom) {
        return nom + " Ticona";
    }

}
