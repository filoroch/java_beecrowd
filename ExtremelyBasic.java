import java.io.IOException;
import java.util.Scanner;
 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class ExtremelyBasic {
 
    public static void main(String[] args) throws IOException {
 
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n");

        int A = scanner.nextInt();
        int B = scanner.nextInt();

        scanner.close();

        System.out.println("X = " + somaAB(A, B));
    }

    public static int somaAB (int A, int B) {
        return A + B;
    }
}