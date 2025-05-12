package questao_02;

public class Guerreiro extends Personagem {
    private String arma;

    public Guerreiro() {
        super();
        this.arma = "sem arma";
    }
    public Guerreiro(String nome, int nivel, String arma) {
        super(nome, nivel);
        this.setArma(arma);
    }

    public String getArma() {
        return arma;
    }

    public void setArma(String arma) {
        this.arma = arma;
    }

    @Override
    public String atacar(){
        return "Guerreiro atacando com " + this.getArma();
    }

    @Override
    public String toString() {
        return "Guerreiro{" +
                super.toString() +
                "arma='" + this.getArma() + '\'' +
                '}';
    }
}
