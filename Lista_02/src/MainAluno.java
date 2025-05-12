import exe02.Aluno;

public class MainAluno {
    public static void main(String[] args) {
        Aluno aluno0 = new Aluno();
        aluno0.dadosAluno();

        Aluno aluno1 = new Aluno(123456, 20, "Fulano da Silva", 7.5f, 8.0f);
        aluno1.dadosAluno();
        aluno1.notaFinal();

        Aluno aluno2 = new Aluno(1234, -5, "Ciclano Alvez da Penha Sanches Santos", -2.0f, 10.0f);
        aluno2.dadosAluno();
        aluno2.notaFinal();

        // Ao tentar acessar variáveis privadas diretamente sem getters ou setters tem-se erro
        // Por exemplo: aluno1.numeroAluno = 253689;
        // O código acima irá gerar um erro de compilação
    }
}
