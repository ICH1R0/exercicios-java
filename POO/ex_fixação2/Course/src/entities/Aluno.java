package entities;

public class Aluno {
    public String name;
    public double nota;
    public double nota2;
    public double nota3;

    public String condisaoPassagem (double nota, double nota2, double nota3) {
        double notaFinal = nota + nota2 + nota3;

        if (notaFinal >= 60) {
            String retorno = String.format("\nNota final: " + notaFinal + "\nPass");
            return retorno;
        }
        else {
            double falta = 60 - notaFinal;
            String retorno = String.format("\nNota final: " + notaFinal + "\nFailed \nMissing: %.2f", falta);
            return retorno;
        }
    }

}
