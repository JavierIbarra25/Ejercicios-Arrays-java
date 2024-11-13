import java.util.Random;

public class Ejercicio7 {
    public static void main(String[] args) {

        // Crear un objeto Random
        Random rand = new Random();
        
        // Crear un array de 100 enteros
        int[] numerosAleatorios = new int[100];
        
        // Llenar el array con números aleatorios
        for (int i = 0; i < numerosAleatorios.length; i++) {
            // rand.nextInt(21) genera un número aleatorio entre 0 y 20
            numerosAleatorios[i] = rand.nextInt(21);
        }
        
        // Imprimir el array
        for (int num : numerosAleatorios) {
            System.out.print(num + " ");
        }

    }
}
