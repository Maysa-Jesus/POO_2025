package exe3;

public class Produto {
    public int id, qtde;
    public float preco;
    public String descricao;

    public Produto(){
        this.id = 0;
        this.descricao = "Indefinido";
        this.qtde = 0;
        this.preco = 0.0f;
    }

    public Produto(int id, String descricao, int qtde, float preco) {
        this.id = id;
        this.descricao = descricao;
        this.qtde = qtde;
        this.preco = preco;
    }

    public void comprar(int x){
        this.qtde += x;
        System.out.println("Compra de " + x + " realizada com sucesso!");
    }
    public void vender(int x){
        if(this.qtde >= x){
            this.qtde -= x;
            System.out.println("Venda de " + x + " realizada com sucesso!");
        }
        else{
            System.out.println("Venda de " + x + " não realizada! Estoque insuficiente!");
        }
    }
    public void subir(float x){
        this.preco += x;
        System.out.println("Aumento de " + x + " no preço realizado com sucesso!");
    }
    public void descer(float x){
        if(this.preco >= x){
            this.preco -= x;
            System.out.println("Redução de " + x + " no preço realizado com sucesso!");
        }
        else{
            System.out.println("Redução de " + x + " no preço não realizado! Valor negativo!");
        }
    }
    public void mostra(){
        System.out.println("Id: " + this.id +
                "\n Descrição: " + this.descricao +
                "\n Quantidade: " + this.qtde +
                "\n Preço: " + this.preco);
    }
}
