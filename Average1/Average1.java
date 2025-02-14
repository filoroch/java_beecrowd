package Average1;
//import java.util.Scanner;

import java.text.DecimalFormat;

public class Average1 {
    public static void main(String[] args) {
        /**AVERAGE 1
         * Leia dois valores de ponto flutuante (precisa converter) que representam os valores de duas notas de estudantes. 
         * Apos calcular a MEDIA da nota dos estudantes, considere que, para o valor A, o peso é 3,5 e para B é 7.5
         */
        Scanner input = new Scanner(System.in);

        Double A = input.nextDouble();
        Double B = input.nextDouble();

        input.close();
        Double result = average(A, B);

        DecimalFormat outputFormat = new DecimalFormat("#.#####");
        result = Double.valueOf(outputFormat.format(result));

        System.out.println("MEDIA = " + result);
    }
    public static Double average(Double gradeA, Double gradeB){
        Double weightA = 3.5D;
        Double weightB = 7.5D;

        Double gradeWeightA = valueForWeights(weightA, gradeA);
        Double gradeWeightB = valueForWeights(weightB, gradeB);

        Double sumGrandesByWeights = gradeWeightA + gradeWeightB;

        Double sumWeights = weightA + weightB;

        // Peso + grade /soma dos pesos
        Double average = sumGrandesByWeights / sumWeights;

        return average;
    };
    public static Double valueForWeights(Double weight, Double grade){
        return weight * grade;
    };
}



   

