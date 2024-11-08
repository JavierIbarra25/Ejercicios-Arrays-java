import java.util.Arrays;
import java.util.Scanner;

public class EjercicioArray2Corregido{
    public static void main(String[] args) {

        int nFav [] = {5,7,2,10,1,4};
        int length = nFav.length;

        Scanner input = new Scanner(System.in);
        System.out.println("Hola, tienes una tabla con mis numeros favoritos " + Arrays.toString(nFav));

        boolean flag = true;

        while (length > 0 && flag) {
            System.out.println("Introduce el número del índice entre 0 o " + (length -1) + " que quieras quitar");
            int n = input.nextInt();

            if (n < 0) {
                flag = false;
            }
            else if (n >= 0 && n < length) {
                // Imprimir el número que se va a eliminar
                System.out.println("Has quitado el número " + nFav[n]);

                for (int i = n; i < length -1; i++){
                        nFav[i] = nFav[i + 1];
                }
                    length --;

                System.out.println("Te quedan " + length + " números: " + Arrays.toString(Arrays.copyOf(nFav, length)));

            } else {
                System.out.println("Ese número no está en el índice, prueba de nuevo");
            }

        }

        System.out.println("Ya no existen mas elementos en la tabla o has introducido un índice negativo");
        input.close();

    }
}