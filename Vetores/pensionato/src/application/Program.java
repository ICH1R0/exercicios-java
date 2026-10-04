package application;

import entities.Aluguel;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Aluguel[] vect = new Aluguel[10];

        System.out.print("Quantos quartos deseja alugar? ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println();
            System.out.println("Aluguel# " + i + ":");
            System.out.print("Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.print("email: ");
            String email = sc.next();
            System.out.print("Room: ");
            int roomNumber = sc.nextInt();

            vect[roomNumber] = new Aluguel(nome, email);
        }

        System.out.println();
        System.out.println("Quartos ocupados: ");
        for (int i = 0; i < vect.length; i++) {
            if (vect[i] != null) {
                System.out.println(i + ": " + vect[i]);
            }
        }

        sc.close();
    }
}
