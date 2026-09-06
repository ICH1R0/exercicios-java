package aplication;

import entities.Pessoa;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        System.out.print("Quantas pessoas serão digitadar? ");
        Pessoa[] vect = new Pessoa[sc.nextInt()];

        for (int i = 0; i < vect.length; i++) {
            sc.nextLine();
            System.out.println("Dados da " + (i+1) + "a Pessoa");
            System.out.print("Nome: "); String nome = sc.nextLine();
            System.out.print("Idade: ");int idade = sc.nextInt();
            System.out.print("Altura: ");double altura = sc.nextDouble();
            System.out.println(" ");
            vect[i] = new Pessoa(nome, altura, idade);
        }

        double sum = 0;
        for (int i = 0; i < vect.length; i++) {
            sum += vect[i].getAltura();
        }
        double media = sum / vect.length;

        System.out.println(" ");
        System.out.printf("Altura média: %.2f%n", media);

        int menores = 0;
        for (int i = 0; i < vect.length; i++) {
            if (vect[i].getIdade() < 16) {
                menores++;
            }
        }

        int porcentagem = menores * (100 / vect.length);
        System.out.println(" ");
        System.out.println("Pessoas com menos de 16 anos: " + porcentagem +"%");

        for (int i = 0; i < vect.length; i++) {
            if (vect[i].getIdade() < 16) {
                System.out.println("Nome: " + vect[i].getNome());
            }
        }

        sc.close();
    }
}
