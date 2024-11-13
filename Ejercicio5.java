
import java.util.Scanner; 
public class Ejercicio5 {
    
    public static void main(String[] args) {
        
        int [] numeros = new int[10];
        Scanner input = new Scanner(System.in);
        System.out.println("Escribe 10 números de los que se debe calcular el máximo y mínimo");

        for(int i = 0; i < numeros.length; i++){
            System.out.println("Introduce el número " + i+ ": ");
            numeros [i] = input.nextInt();
            }

        int numMax = numeros[0];
        int numMin = numeros[0];

        for (int i = 1; i<numeros.length; i++){
                
            if(numeros [i] > numMax){
                numMax = numeros [i];
            }    
            if (numeros[i] < numMin) {
                numMin = numeros[1];
            }


        }
        
        System.out.print("Los números introducidos son: ");
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == numMax) {
                System.out.print(numeros[i] + "(máximo) ");
            } else if (numeros[i] == numMin) {
                System.out.print(numeros[i] + "(mínimo) ");
            } else {
                System.out.print(numeros[i] + " ");
            }
        }

        input.close();

    }
}
