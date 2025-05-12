package exe02;

public class Passageiro {
    private int id;
    private String cpf, nome;

    public Passageiro() {
        this.cpf = "11111111111";
        this.nome = "indefinido";
    }
    public Passageiro(int id, String cpf, String nome) {
        this.setId(id);
        this.setCpf(cpf);
        this.setNome(nome);
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String toString() {
        return "\nPassageiro{" +
                "id=" + id +
                ", cpf='" + cpf + '\'' +
                ", nome='" + nome + '\'' +
                '}';
    }
}
