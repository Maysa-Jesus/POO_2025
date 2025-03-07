package exe4;

public class Rio {
    public float nivel;
    public boolean poluido;
    public String nome;

    public Rio(){
        this.nome = "Indefinido";
        this.nivel = 0.0f;
        this.poluido = false;
    }
    public Rio(String nome, float nivel, boolean poluido) {
        this.nome = nome;
        this.nivel = nivel;
        this.poluido = poluido;
    }
    public void chover(float x){
        this.nivel += x;
        System.out.println("Aumento de " + x + " no nível do rio realizado!");
    }
    public void ensolarar(float x){
        if(this.nivel >= x){
            this.nivel -= x;
            System.out.println("Diminuição de " + x + " no nível do rio realizado!");
        }
        else{
            System.out.println("Diminuição de " + x + " no nível do rio não realizado! Nível insuficiente!");
        }
    }
    public void limpar(){
        if(this.poluido){
            this.poluido = false;
            System.out.println("O rio foi limpo com sucesso!");
        }
        else{
            System.out.println("O rio já está limpo!");
        }
    }
    public void sujar(){
        if(this.poluido){
            System.out.println("O rio foi ainda mais poluido!");
        }
        else{
            this.poluido = true;
            System.out.println("O rio foi poluido com sucesso!");        }

    }
    public String mostra(){
        return "Nome: " + this.nome +
                "\n Nível: " + this.nivel +
                "\n Poluição: " + (this.poluido ? "Sim!" : "Não!");
    }
}
