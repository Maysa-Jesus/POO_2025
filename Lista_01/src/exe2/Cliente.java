package exe2;

public class Cliente {
    public int numeroConta, numeroAgencia;
    public float saldo;
    public String nome;

    public Cliente(){
        this.numeroConta = 0;
        this.numeroAgencia = 0;
        this.nome = "Indefinido";
        this.saldo = 0.0f;
    }
    public Cliente(int numeroConta, int numeroAgencia, String nome, float saldo) {
        this.numeroConta = numeroConta;
        this.numeroAgencia = numeroAgencia;
        this.nome = nome;
        this.saldo = saldo;
    }
    public void realizarDeposito(float valor){
        this.saldo += valor;
        System.out.println("Depósito de " + valor + " realizado com sucesso!");
    }
    public void realizarSaque(float valor){
        if(this.saldo >= valor){
            this.saldo -= valor;
            System.out.println("Saque de " + valor + " realizado com sucesso!");
        }
        else{
            System.out.println("Saque de " + valor + " não realizado! Saldo insuficiente!");
        }
    }
    public void informacoesCliente(){
        System.out.println("Agência: " + this.numeroAgencia +
                "\n Conta: " + this.numeroConta +
                "\n Nome: " + this.nome +
                "\n Saldo: " + this.saldo);
    }
}
