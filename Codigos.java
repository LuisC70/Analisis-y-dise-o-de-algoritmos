import java.util.Arrays;
public class Codigos {

    public static void ejemploConstante(int[] arr) {
        System.out.println("Ejemplo O(1): Acceso directo");
        System.out.println("Primer elemento: " + arr[0]);
        System.out.println("Último elemento: " + arr[arr.length - 1]);
    }


    public static void ejemploLineal(int[] arr) {
        System.out.println("\nEjemplo O(n): Recorrer el arreglo");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Elemento en posición " + i + ": " + arr[i]);
        }
    }


    public static void ejemploCuadratico(int[] arr) {
        System.out.println("\nEjemplo O(n^2): Comparar todos con todos");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print("(" + arr[i] + "," + arr[j] + ") ");
            }
            System.out.println();
        }
    }


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

    public static void ejemploLogaritmico(int[] arr, int objetivo) {
        System.out.println("\nEjemplo O(log n): Búsqueda binaria");
        Arrays.sort(arr); 
        boolean encontrado = busquedaBinaria(arr, objetivo);
        System.out.println("¿Está el número " + objetivo + "? " + encontrado);
    }

    public static void main(String[] args) {
        int[] numeros = {10, 20, 30, 40, 50};

        ejemploConstante(numeros);      
        ejemploLineal(numeros);         
        ejemploCuadratico(numeros);     
        ejemploLogaritmico(numeros, 30); 
    }
}

