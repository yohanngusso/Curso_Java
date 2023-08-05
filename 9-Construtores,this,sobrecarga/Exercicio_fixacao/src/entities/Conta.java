package entities;

public class Conta {
    private int numeroConta;
    private String nomeTitular;
    private double saldoConta;

    //Construtores
    //para adicionar valor de deposito
    public Conta(int numeroConta, String nomeTitular, double saldoConta){
        this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitular;
        this.saldoConta = saldoConta;
    }

    // caso não queria adicionar valor
    public Conta(int numeroConta, String nomeTitular){
        this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitular;
    }

    //GETTERS E SETTERS 

    public int getNumeroConta() {
        return numeroConta;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public double getsaldoConta() {
        return saldoConta;
    }

    // MÉTODOS

    public void deposito(double saldoConta){
        this.saldoConta += saldoConta;
    }

    public void saqueSaldo(double saldoConta){
        this.saldoConta = (this.saldoConta - saldoConta) - 5.00 ;
    }

    public String toString(){
        return "Account "
                + numeroConta
                + ", "
                + "Holder: "
                + nomeTitular
                + ", "
                + "Balance: "
                + "$ "
                + String.format("%.2f", saldoConta);
    }
}
