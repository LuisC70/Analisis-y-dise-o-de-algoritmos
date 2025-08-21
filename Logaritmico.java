
    import java.util.Arrays;

public class Logaritmico {
 
    public static boolean busquedaBinaria(int[] arr, int objetivo) {
        int izquierda = 0, derecha = arr.length - 1;
        while (izquierda <= derecha) {
            int medio = (izquierda + derecha) / 2;
            if (arr[medio] == objetivo) {
                return true;
            } else if (arr[medio] < objetivo) {
                izquierda = medio + 1;
            } else {
                derecha = medio - 1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] numeros = {10, 20, 30, 40, 50};

        
        Arrays.sort(numeros); 
        int objetivo = 30;

        System.out.println("O(log n) - Tiempo logarítmico:");
        boolean encontrado = busquedaBinaria(numeros, objetivo);
        System.out.println("¿Está el número " + objetivo + "? " + encontrado);
    }
}

    

