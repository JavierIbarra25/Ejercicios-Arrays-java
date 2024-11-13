import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio6 {
    
    public static void main(String[] args) {

        int [] numeros = new int[15];
        Scanner input = new Scanner(System.in);
        int ultNumero = numeros.length;

        System.out.println("Escribe 15 números dentro de la tabla");

        for(int i= 0; i<numeros.length; i++){
            System.out.println("Escribe un número");
            numeros[i] = input.nextInt();
            
            if (numeros[i] == ultNumero) {
                numeros [i] = numeros [0];
            }
        }
        
        for (int i = 0; i<numeros.length -1; i++){
            numeros[i] = numeros[i] + 1;
        }

        System.out.println(Arrays.toString(numeros));
        input.close();
    }
}
