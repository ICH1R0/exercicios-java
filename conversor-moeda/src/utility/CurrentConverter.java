package utility;

public class CurrentConverter {

    public static double transformaDollarEmReal(double valorDollar, double dollar){
        return valorDollar*dollar;
    }

    public static double aplicacaoTaxa(double transformarDollarEmReal){
        return transformarDollarEmReal * 0.06;
    }
}
