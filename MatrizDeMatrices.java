import java.util.Scanner;

public class MatrizDeMatrices {
    public static void main (String [] args){

        Scanner input = new Scanner(System.in);

        //Pedir el número  de submatrices
        System.out.println("Introduce el número de submatrices: ");
        int numSubmatriz = input.nextInt();
        int[][] Submatriz = new int[numSubmatriz][];

        // Pedir los elementos para cada submatriz
         for (int i = 0; i<numSubmatriz; i++){
            System.out.println("Introduce el número de elementos para la submatriz " + (i+1) + ": " );
            int numElementos = input.nextInt();
            Submatriz [i] = new int [numElementos];

             for (int j = 0; j< numElementos; j++){
                System.out.println("Introduce el elemento" + (j+1)  + " de la submatriz " + (i+1) + ": " );
                Submatriz [i][j] = input.nextInt();
             }
         }

         // Contamos los elementos únicos en el array
         int uniqueCount = 0;
         for (int i = 1; i <Submatriz.length; i++) {
            if (Submatriz[i] != Submatriz[i - 1]) {
                uniqueCount++;
            }
        }

        input.close();

    }
}
