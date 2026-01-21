import java.util.*;

public class Ejercicio6 {
    public static void main(String[] args) {
        //listas sin ordenar
        List<String> nombres = new ArrayList<>();
        nombres.add("Pedro");
        nombres.add("Ana");
        nombres.add("Luis");
        nombres.add("Ana");
        nombres.add("Zaira");
        nombres.add("Pedro");

        //la psamos a hashset para eliminar dubplicados
        Set<String> setSinDuplicados = new HashSet<>(nombres);

        //lo volovemos a pasar a lista para ordenarla
        List<String> listaFinal = new ArrayList<>(setSinDuplicados);
        Collections.sort(listaFinal);


        System.out.println(listaFinal);
    }
}