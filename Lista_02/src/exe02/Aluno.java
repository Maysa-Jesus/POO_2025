package exe02;

public class Aluno {
    private int numeroAluno, idade;
    private String nome;
    private float p1, p2;

    public Aluno() {
        this.numeroAluno = 0;
        this.idade = 0;
        this.nome = "Indefinido";
        this.p1 = 0.0f;
        this.p2 = 0.0f;
    }
    public Aluno(int numeroAluno, int idade, String nome, float p1, float p2) {
        this.setNumeroAluno(numeroAluno);
        this.setIdade(idade);
        this.setNome(nome);
        this.setP1(p1);
        this.setP2(p2);
    }

    public int getNumeroAluno() {
        return numeroAluno;
    }
    public String getNome() {
        return nome;
    }
    public int getIdade() {
        return idade;
    }
    public float getP1() {
        return p1;
    }
    public float getP2() {
        return p2;
    }

    public void setNumeroAluno(int numeroAluno) {
        // Quando um método é chamado pela classe, esse método é um método de classe
        String aux = String.valueOf(numeroAluno); // converte o parâmetro int para String
        if(aux.length() == 6){
            this.numeroAluno = numeroAluno;
        }
        else{
            System.out.println("O número tem que ter exatamente 6 digitos");
        }

        /*if(numeroAluno >= 100000 && numeroAluno <= 999999) {
            this.numeroAluno = numeroAluno;
        }
        else{
            System.out.println("O número tem que ter exatamente 6 digitos");
        }*/
    }
    public void setNome(String nome) {
        if(nome.length() <= 30){
            this.nome = nome;
            return;
        }
        System.out.println("O nome excede o máximo de 30 caracteres");
        this.nome = "Inválido";
    }
    public void setIdade(int idade) {
        if(idade >= 0) {
            this.idade = idade;
        }
        else{
            System.out.println("A idade não pode ser negativa");
        }
    }
    public void setP1(float p1) {
        if(p1 >= 0) {
            this.p1 = p1;
        }
        else{
            System.out.println("A nota não pode ser negativa");
        }
    }
    public void setP2(float p2) {
        if(p2 >= 0) {
            this.p2 = p2;
        }
        else{
            System.out.println("A nota não pode ser negativa");
        }
    }

    public void notaFinal(){
        float notaFinal = ((this.getP1() + this.getP2()) / 2);
        System.out.println("Nota final: " + notaFinal);
    }
    public void dadosAluno(){
        System.out.println("Número do Aluno: " + this.getNumeroAluno() +
                "; Nome do Aluno: " + this.getNome() +
                "; Idade do Aluno: " + this.getIdade());
    }
}
