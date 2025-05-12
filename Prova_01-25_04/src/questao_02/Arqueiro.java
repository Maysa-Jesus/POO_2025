package questao_02;

public class Arqueiro extends Personagem {
    private int flechas;

    public Arqueiro() {
        super();
        this.flechas = 0;
    }
    public Arqueiro(String nome, int nivel, int flechas) {
        super(nome, nivel);
        this.setFlechas(flechas);
    }

    public int getFlechas() {
        return flechas;
    }

    public void setFlechas(int flechas) {
        this.flechas = flechas;
    }

    @Override
    public String atacar() {
        return "Arqueiro disparando " + this.getFlechas() + " flechas";
    }

    @Override
    public String toString() {
        return "Arqueiro{" +
                super.toString() +
                "flechas='" + this.getFlechas() + '\'' +
                '}';
    }
}
