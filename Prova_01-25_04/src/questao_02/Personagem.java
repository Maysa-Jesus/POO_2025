package questao_02;

public abstract class Personagem {
    protected String nome;
    protected int nivel;

    public Personagem() {
        this.nome = "Indefinido";
        this.nivel = 0;
    }
    public Personagem(String nome, int nivel) {
        this.setNome(nome);
        this.setNivel(nivel);
    }

    public String getNome() {
        return nome;
    }
    public int getNivel() {
        return nivel;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public abstract String atacar();

    @Override
    public String toString() {
        return "Personagem{" +
                "nome='" + this.getNome() + '\'' +
                ", nivel=" + this.getNivel() +
                ", Ataque: " + atacar() +
                '}';
    }
}
