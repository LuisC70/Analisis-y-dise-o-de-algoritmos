import java.util.ArrayList;
import java.util.List;

public class Factorial {

    
    public static void permutaciones(List<Integer> elementos, String actual) {
        if (elementos.isEmpty()) {
            System.out.println(actual);
            return;
        }

        for (int i = 0; i < elementos.size(); i++) {
            int num = elementos.remove(i);
            permutaciones(elementos, actual + num + " ");
            elementos.add(i, num); 
        }
    }

    public static void main(String[] args) {
        int n = 4; 
        List<Integer> elementos = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            elementos.add(i);
        }

        System.out.println("Permutaciones de " + n + " elementos:");
        permutaciones(elementos, "");
    }
}


    

