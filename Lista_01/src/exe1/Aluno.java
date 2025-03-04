package exe1;

public class Aluno {
    public int numeroAluno, idade;
    public float p1, p2;
    public String nome;

    public Aluno() {
        this.numeroAluno = 0;
        this.nome = "Indefinido";
        this.idade = 0;
        this.p1 = 0.0f;
        this.p2 = 0.0f;
    }

    public Aluno(int numeroAluno, String nome,int idade, float p1, float p2) {
        this.numeroAluno = numeroAluno;
        this.nome = nome;
        this.idade = idade;
        this.p1 = p1;
        this.p2 = p2;
    }

    public float notaFinal(){
        return (this.p1 + this.p2) / 2;
    }

    public void dadosAluno(){
        System.out.println("Número: " + this.numeroAluno +
                "\n Nome: " + this.nome +
                "\n Idade: " + this.idade +
                "\n Situação: " + this.passou());
    }

    public String passou(){
        // Operador ternário
        return (this.notaFinal() >= 6) ? "O aluno passou!" : "O aluno não passou!";
    }

}

