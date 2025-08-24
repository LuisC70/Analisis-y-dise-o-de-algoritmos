    import java.util.ArrayList;
    import java.util.List;

public class Exponencial {


    public static void tiempoExponencial(int n) {
        List<List<Integer>> subconjuntos = new ArrayList<>();
        int total = 1 << n; 
        for (int i = 0; i < total; i++) {
            List<Integer> subset = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                if ((i & (1 << j)) != 0) {
                    subset.add(j);
                }
            }
            subconjuntos.add(subset);
        }
        System.out.println("O(2^n): generados " + subconjuntos.size() + " subconjuntos");
    }

    public static void main(String[] args) {
        tiempoExponencial(5);
    }
}

    

