package application;

import utility.CurrentConverter;

import java.time.LocalDate;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor do dollar: ");
        double valorDollar = sc.nextDouble();
        System.out.print("Quantos dollars deseja comprar: ");
        double dollar = sc.nextDouble();
        double valorEmReal = CurrentConverter.transformaDollarEmReal(valorDollar, dollar);
        double valorTotal = valorEmReal + CurrentConverter.aplicacaoTaxa(valorEmReal);
        System.out.printf("Valor a pagar em reais: %.2f%n", valorTotal);






        sc.close();
    }
}
