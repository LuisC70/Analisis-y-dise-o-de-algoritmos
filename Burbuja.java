public class Burbuja {
    public static void main(String[] args) {
        int[] numeros = {5, 2, 9, 1, 5, 6};

        System.out.println("Arreglo original:");
        for (int num : numeros) {
            System.out.print(num + " ");
        }

        
        for (int i = 0; i < numeros.length - 1; i++) {
            for (int j = 0; j < numeros.length - 1 - i; j++) {
                if (numeros[j] > numeros[j + 1]) {
                    
                    int temp = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = temp;
                }
            }
        }

        System.out.println("\n\nArreglo ordenado con Burbuja:");
        for (int num : numeros) {
            System.out.print(num + " ");
        }
    }
}

    

