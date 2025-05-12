package exe00;

public class Carro {

    // modificador de acesso private - variaveis encapsuladas
    private String marca;
    private String modelo;
    private int ano;
    private float velocidade;

    // Construtores
    public Carro() {
        this.marca = "sem marca";
        this.modelo = "sem modelo";
    }
    public Carro(String marca, String modelo, int ano, float velocidade) {
        this.setMarca(marca);
        this.setModelo(modelo);
        this.setAno(ano);
        this.setVelocidade(velocidade);
    }

    // getters
    public String getMarca() {
        return this.marca;
    }
    public String getModelo() {
        return this.modelo;
    }
    public int getAno() {
        return this.ano;
    }
    public float getVelocidade() {
        return this.velocidade;
    }

    // setters
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public void setAno(int ano) {
        if (ano >= 0) {
            this.ano = ano;
        }
        else{
            System.out.println("O ano não pode ser negativo!");
        }
    }
    public void setVelocidade(float velocidade) {
        // isso é encapsular
        if (velocidade >= 0) {
            this.velocidade = velocidade;
        }
        else{
            System.out.println("A velocidade não pode ser negativa!");
        }
    }

    // acelerar o Carro
    public void acelerar(float x){
        this.setVelocidade(this.getVelocidade() + x);
        this.verificaLimiteVelocdade();
    }

    // frear o Carro
    public void frear(float x){
        this.setVelocidade(this.getVelocidade() - x);
    }

    // exibir os dados
    public String exibirDados(){
        return "Marca: " + this.marca +
                " Modelo: " + this.modelo +
                " Ano: " + this.ano +
                " Velocidade: " + this.velocidade;
    }

    // verifica se o carro ultrapassou 200 km/h
    // método só pode ser usado na própria classe
    private void verificaLimiteVelocdade(){
        if (this.velocidade > 200){
            this.velocidade = 200;
            System.out.println("Velocidade não pode ultrapassar 200 km/h!");
        }
    }
}
