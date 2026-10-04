package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        System.out.print("Quantos números vai digitar: ");
        double[] vetor = new double[sc.nextInt()];

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite um numero: ");
            vetor[i] = sc.nextDouble();
        }

        System.out.println(" ");
        System.out.print("Valores: ");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + "  ");
        }

        double sum = 0;
        for (int i = 0; i < vetor.length; i++) {
            sum += vetor[i];
        }

        System.out.println(" ");
        System.out.println("Soma: " + sum);
        System.out.print("Média: " + (sum / vetor.length));




        sc.close();
    }
}
