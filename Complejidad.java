public class Complejidad {
    public static void main(String[] args) {
        int[] numeros = {10, 20, 30, 40, 50};

        
        int valor = numeros[2]; 

        System.out.println("Elemento en la posición 2: " + valor);
    }
}

//Complejidad Temporal (O(1)): Acceder a numeros[2] siempre toma el mismo tiempo, no importa si el arreglo tiene 5 o 1 millón de elementos.
//Complejidad Espacial (O(1)): Solo se guarda la variable valor, así que no se necesita memoria extra.

    

