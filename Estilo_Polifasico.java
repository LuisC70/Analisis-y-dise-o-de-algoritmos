import java.util.*;

public class Estilo_Polifasico {
    
                                                                           // Mezcla dos listas ordenadas en una nueva lista
    public static List<Integer> merge(List<Integer> a, List<Integer> b) {
        List<Integer> result = new ArrayList<>();
        int i = 0, j = 0;

        while (i < a.size() && j < b.size()) {                             // List<Integer> = una lista dinamica de numeros enteros (objetos Integer).
            if (a.get(i) <= b.get(j)) {
                result.add(a.get(i));
                i++;
            } else {
                result.add(b.get(j));
                j++;
            }
        }
                                                                             // .get(indice) → devuelve el elemento en la posicion indice.
                                                                             // Añadimos los elementos que sobren
        while (i < a.size()) result.add(a.get(i++));
        while (j < b.size()) result.add(b.get(j++));                         // a.size() devuelve el numero de elementos que hay en la lista.

        return result;
    }

    public static void main(String[] args) {
                                                                             // Secuencias iniciales simuladas (runs ya ordenados)
        List<Integer> run1 = Arrays.asList(1, 4, 7);
        List<Integer> run2 = Arrays.asList(2, 5, 8);
        List<Integer> run3 = Arrays.asList(3, 6, 9);
        List<Integer> run4 = Arrays.asList(0, 10, 11);

                                                                             // Primera fase de mezcla
        List<Integer> temp1 = merge(run1, run2);
        List<Integer> temp2 = merge(run3, run4);

        System.out.println("Primera mezcla:");
        System.out.println(temp1);
        System.out.println(temp2);

                                                                             // Segunda fase de mezcla
        List<Integer> finalResult = merge(temp1, temp2);

        System.out.println("Resultado final ordenado:");
        System.out.println(finalResult);
    }
}


    

