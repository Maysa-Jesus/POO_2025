package rh;

public class Gerente extends Funcionario{
    private float bonus;

    public Gerente(){
        super(); // chama o construtor da superclasse
    }

    public Gerente(String nome, String endereco, String cpf, float salario, float bonus) {
        super(nome, endereco, cpf, salario);
        this.bonus = bonus;
    }

    public float getBonus() {
        return bonus;
    }
    public void setBonus(float bonus) {
        this.bonus = bonus;
    }

    @Override
    public float calculaSalario(){
        return this.salario + this.bonus;
    }

    @Override // anula o método herdado
    public String toString(){
        return super.toString() +
                "\n Bônus: " + bonus;
    }
}
