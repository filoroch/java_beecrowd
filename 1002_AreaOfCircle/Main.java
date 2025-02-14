import java.io.IOException;
import java.util.Scanner;
 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Main {
 
    public static void main(String[] args) throws IOException {
 
        /**
         * Escreva a sua solução aqui
         * Code your solution here
         * Escriba su solución aquí
         */
        Scanner input = new Scanner(System.in);
        Double A = input.nextDouble();
        input.close();

        System.out.println("A=" + areaOfCircle(A));;

    }
    public static Double areaOfCircle(Double Raio){
        final Double N_PI = 3.13159;
        return N_PI*Math.pow(Raio, 2);
    }
}