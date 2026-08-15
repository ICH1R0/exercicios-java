package application;

import entities.Aluno;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Aluno aluno = new Aluno();

        System.out.print("Digite o nome do aluno: ");
        String nome = sc.nextLine();
        System.out.print("Digite o nota 1 do aluno: ");
        double nota = sc.nextDouble();
        System.out.print("Digite o nota 2 do aluno: ");
        double nota2 = sc.nextDouble();
        System.out.print("Digite o nota 3 do aluno: ");
        double nota3 = sc.nextDouble();

        System.out.print(aluno.condisaoPassagem(nota, nota2, nota3));

        sc.close();
    }
}
