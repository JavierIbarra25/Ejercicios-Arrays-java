import java.util.Scanner;

public class EjercicioClase2 {
    public static void main(String[] args) {
        
        int nFav[] = {5,7,2,10,1,4};


        Scanner input = new Scanner(System.in);
        System.out.println("Hola, tienes una tabla con mis numeros favoritos (5,7,2,10,1,4)");

       
        int length = nFav.length;
        

        while (length > 0) {
            System.out.println("Introduce el número del índice entre 0 o " + (length - 1) + " que quieras quitar");
            int n = input.nextInt();

            if (n < 0) {
                break;
            }

            if (n >= 0 && n <=6) {

                for (int i = 0; i < length - 1; i++){
                    if (n == nFav[i]) {
                        length = length -  1;
                    } 
                }

            } else {
                System.out.println("Ese número no está en el índice, prueba de nuevo");
                n = input.nextInt();
            }
            
              
            System.out.println("has quitado el número " + nFav [n] + " te quedan " + (length - 1) + " números");
        }

        System.out.println("Ya no existen mas elementos en la tabla o has introducido un índice negativo");
        input.close();

    }
}
