package entities;

public class ContaUsuario  {

    private int numConta;
    private String nome;
    private double saldo;

    public ContaUsuario(){};

    public ContaUsuario(int numConta, String nome, double depositoInicial) {
        this.numConta = numConta;
        this.nome = nome;
        deposito(depositoInicial);
    }

    public ContaUsuario(int numConta, String nome) {
        this.numConta = numConta;
        this.nome = nome;
    }

    public int getNumConta() {
        return numConta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public double deposito(double deposito){
        return saldo += deposito;
    }

    public  double saque (double saque){
        return saldo = (saldo - 5) - saque;
    }

    public String toString() {
        return ("Conta " + getNumConta() + ", Titular: " + getNome() + ", Saldo: " + getSaldo());
    }
}
