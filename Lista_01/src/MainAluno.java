import exe1.Aluno;

public class MainAluno {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno();
        aluno1.dadosAluno();
        System.out.println("Nota final: " + aluno1.notaFinal());

        Aluno aluno2 = new Aluno(123, "Alex", 19, 7.6f, 8.9f);
        aluno2.dadosAluno();
        System.out.println("Nota final: " + aluno2.notaFinal());

        Aluno aluno3 = new Aluno(456, "Allan", 15, 6.5f, 4.5f);
        aluno3.dadosAluno();
        System.out.println("Nota final: " + aluno3.notaFinal());
    }
}
