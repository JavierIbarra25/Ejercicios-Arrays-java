import java.util.Scanner;

public class EjercicioClase {
    public static void main(String[] args) {
        int contador = 0;
        int SumPositivos = 0;
        int SumNegativos = 0;
        int contadorPositivos = 0;
        int contadorNegativos = 0;

        Scanner input = new Scanner (System.in);

        System.out.println("Introduce el número total de números de los que quieres calcular la media");
        int n = input.nextInt();

        int [] numeros = new int [n];

        for (int i = 0; i < numeros.length; i++){
            System.out.println("Introduce un número: ");
            numeros [i] = input.nextInt();

            if (numeros [i] == 0){
                contador++;
            }
            else if (numeros [i] > 0){
                SumPositivos = SumPositivos + numeros[i];
                contadorPositivos++;
            }
            else{
                SumNegativos = SumNegativos + numeros[i];
                contadorNegativos++;
            }
        }

        if (contadorPositivos == 0){
            System.out.println("imposible de realizar la media de los positivos");
        }else{
            double PositivoMedia = (double) SumPositivos / contadorPositivos;
            System.out.println("la media de números positivos es " + PositivoMedia);
        }

        if (contadorNegativos == 0){
            System.out.println("imposible de realizar la media de los negativos");
        }else{
            double NegativoMedia = (double) SumNegativos / contadorNegativos;
            System.out.println("la media de números negativos es " + NegativoMedia);
        }

        System.out.println("El número de ceros es + " + contador);

    }
}
