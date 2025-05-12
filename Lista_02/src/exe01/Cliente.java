package exe01;

public class Cliente {
    private String  numeroConta, numeroAgencia, nome;
    private float saldo;

    // construtores
    public Cliente() {
        this.numeroConta = "000000-0";
        this.numeroAgencia = "0000-0";
        this.nome = "Indefinido";
        this.saldo = 0;
    }
    public Cliente(String numeroConta, String numeroAgencia, String nome, float saldo) {
        this.setNumeroConta(numeroConta);
        this.setNumeroAgencia(numeroAgencia);
        this.setNome(nome);
        this.setSaldo(saldo);
    }

    // getters
    public String getNumeroConta() {
        return this.numeroConta;
    }
    public String getNumeroAgencia() {
        return this.numeroAgencia;
    }
    public String getNome() {
        return this.nome;
    }
    public float getSaldo() {
        return this.saldo;
    }

    // setters
    public void setNumeroConta(String numeroConta) {
        // Quando um método é chamado por um objeto, esse método é um método de instância
        if(numeroConta.length() == 8){
            if(numeroConta.charAt(6) == '-'){
                String numeros = numeroConta.substring(0, 6);
                char digitoVerif = numeroConta.charAt(7);

                // verifica se os 6 primeiros e o último digito são números
                if (numeros.matches("\\d{6}") && Character.isDigit(digitoVerif)) {
                    this.numeroConta = numeroConta;
                }
            }
            else{
                System.out.println("Número da conta inválido. Formato necessário: 123456-7");
                this.numeroConta = "000000-0";
            }
        }
        else{
            System.out.println("Número da conta inválido. Tamanho necessário: 8 digitos");
            this.numeroConta = "000000-0";
        }

    }
    public void setNumeroAgencia(String numeroAgencia) {
        if(numeroAgencia.length() == 6){
            if(numeroAgencia.charAt(4) == '-'){ // caracter é aspas simples
                String numeros = numeroAgencia.substring(0, 4);
                char digitoVerif = numeroAgencia.charAt(5);

                // verifica se os 4 primeiros e o último digito são números
                if (numeros.matches("\\d{4}") && Character.isDigit(digitoVerif)) {
                    this.numeroAgencia = numeroAgencia;
                }
            }
            else{
                System.out.println("Número da agência inválido. Formato necessário: 1234-5");
                this.numeroAgencia = "0000-0";
            }
        }
        else{
            System.out.println("Número da agência inválido. Tamanho necessário: 6 digitos");
            this.numeroAgencia = "0000-0";
        }

    }
    public void setNome(String nome) {
        if(nome.length() <= 30){
            this.nome = nome;
        }
        else{
            System.out.println("O nome excede o máximo de 30 caracteres");
            this.nome = "Inválido";
        }

    }
    public void setSaldo(float saldo){
        if(saldo >= 0){
            this.saldo = saldo;
        }
        else{
            System.out.println("O saldo não pode ser negativo");
        }
    }

    // métodos
    public void realizarDeposito(float valor){
        if (valor > 0) {
            this.setSaldo(this.getSaldo() + valor);
            System.out.println("Depósito de " + valor + " realizado com sucesso!");
        }
        else {
            System.out.println("O valor do depósito " + valor + " é inválido.");
        }
    }
    public void realizarSaque(float valor){
        if(valor <= 0){
            System.out.println("O valor do saque " +  valor + " é inválido");
        }
        else if(valor > this.getSaldo()){
            System.out.println("Saldo insuficiente para saque de " + valor);
        }
        else {
            this.setSaldo(this.getSaldo() - valor);
            System.out.println("Saque de " + valor + " realizado com sucesso!");
        }

    }
    public String exibirDados(){
        return "Número da conta: " + this.getNumeroConta() +
                "; Número da agência: " + this.getNumeroAgencia() +
                "; Nome: " + this.getNome() +
                "; Saldo da conta: " + this.getSaldo();
    }

}
