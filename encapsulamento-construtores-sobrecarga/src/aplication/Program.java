package aplication;

import entities.ContaUsuario;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main (String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        ContaUsuario usuario;

        System.out.print("Digite o número da sua conta: ");
        int numConta = sc.nextInt();
        System.out.print("Digite o titular da conta: ");
        sc.nextLine();
        String nome = sc.nextLine();
        System.out.print("Deseja fazer um primeiro deposito (y/n)? ");
        char resposta = sc.next().charAt(0);
        if (resposta == 'y'){
            System.out.print("Qual o valor do primeiro deposito? ");
            double depositoInicial = sc.nextDouble();
            usuario = new ContaUsuario(numConta, nome, depositoInicial);
        }
        else {
            usuario = new ContaUsuario(numConta, nome);
        }

        ContaUsuario usuario = new ContaUsuario(numConta, nome, saldo);

        System.out.println("Dados da Conta: ");
        System.out.println("Conta " + usuario.getNumConta() + ", Titular" + usuario.getNome() + ", Saldo: " + usuario.getSaldo());

        System.out.print("Valor do deposito: ");
        usuario.setSaldo(usuario.deposito(sc.nextDouble()));

        System.out.println("Atualização da conta:");
        System.out.println("Conta " + usuario.getNumConta() + ", Titular" + usuario.getNome() + ", Saldo: " + usuario.getSaldo());

        System.out.print("Valor do saque: ");
        usuario.setSaldo(usuario.saque(sc.nextDouble()));

        System.out.println("Atualização da conta:");
        System.out.println("Conta " + usuario.getNumConta() + ", Titular" + usuario.getNome() + ", Saldo: " + usuario.getSaldo());









        sc.close();
    }
}
