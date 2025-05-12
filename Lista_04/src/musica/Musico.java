package musica;

public abstract class Musico {
    protected String nome;
    protected int idade;

    public Musico() {
        this.nome = "Indefino";
    }

    public Musico(String nome, int idade) {
        this.setNome(nome);
        this.setIdade(idade);
    }

    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Musico{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                '}';
    }

    public abstract String tocar();
}
