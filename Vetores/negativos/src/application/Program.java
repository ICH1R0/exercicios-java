package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        System.out.print("Quantos números você vai digitar: ");
        double[] vect = new double[sc.nextInt()];

        for (int i = 0; i < vect.length; i++) {
            System.out.print("Digite um número: ");
            vect[i] = sc.nextDouble();
        }

        System.out.println(" ");
        System.out.println("Números negativos:");
        for (int i = 0; i < vect.length; i++) {
            if (vect[i] < 0) {
                System.out.println(vect[i]);
            }
        }

        sc.close();
    }
}
