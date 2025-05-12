package questao_01;

public class Paciente {
    private String cpf;
    private String nome;
    private int idade;
    private float peso;

    public Paciente() {
        this.cpf = "000.000.000-00";
        this.nome = "sem nome";
        this.idade = 0;
        this.peso = 0.0f;
    }
    public Paciente(String cpf, String nome, int idade, float peso) {
        this.setCpf(cpf);
        this.setNome(nome);
        this.setIdade(idade);
        this.setPeso(peso);
    }

    public String getCpf() {
        return cpf;
    }
    public String getNome() {
        return nome;
    }
    public int getIdade() {
        return idade;
    }
    public float getPeso() {
        return peso;
    }

    public void setCpf(String cpf) {
        if(cpf.length() == 14){
            if(cpf.charAt(3) == '.'){
                if(cpf.charAt(7) == '.'){
                    if(cpf.charAt(11) == '-'){
                        this.cpf = cpf;
                    }
                    else{
                        System.out.println("Formato de CPF inválido. Necessário: 123.456.789-10");
                        this.cpf = "000.000.000-00";
                    }
                }
                else{
                    System.out.println("Formato de CPF inválido. Necessário: 123.456.789-10");
                    this.cpf = "000.000.000-00";
                }
            }
            else{
                System.out.println("Número de CPF inválido. Necessário: 123.456.789-10");
                this.cpf = "000.000.000-00";
            }
        }
        else{
            System.out.println("Número de CPF inválido. Tamanho necessário: 14 caracteres");
            this.cpf = "000.000.000-00";
        }
    }

    public void setNome(String nome) {
        if(nome.length() <= 50){
            this.nome = nome;
            return;
        }
        System.out.println("O nome deve ter no máximo 50 caracteres");
        this.nome = "sem nome";
    }

    public void setIdade(int idade) {
        if(idade >= 0) {
            this.idade = idade;
        }
        else{
            System.out.println("A idade não pode ser negativa");
        }
    }

    public void setPeso(float peso) {
        if(peso >= 0) {
            this.peso = peso;
        }
        else{
            System.out.println("O peso deve ser positivo");
        }
    }

    public void ganharPeso(float quilos){
        this.setPeso(this.getPeso() + quilos);
    }
    public void perderPeso(float quilos){
        this.setPeso(this.getPeso() - quilos);
    }
    public String exibirPaciente(){
        return "\nPaciente{" +
                "CPF='" + this.getCpf() + '\'' +
                ", Nome='" + this.getNome() + '\'' +
                ", Idade=" + this.getIdade() +
                ", Peso=" + this.getPeso() +
                '}';
    }
}
