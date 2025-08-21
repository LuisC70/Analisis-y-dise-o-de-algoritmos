public class Cuadratico {
        public static void main(String[] args) {
        int[] numeros = {10, 20, 30, 40, 50};

    
        System.out.println("O(n^2) - Tiempo cuadrático:");
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros.length; j++) {
                System.out.print("(" + numeros[i] + "," + numeros[j] + ") ");
            }
            System.out.println();
        }
    }
}

    

