import exe3.Produto;

public class MainProduto {
    public static void main(String[] args) {
        Produto produto1 = new Produto();
        produto1.mostra();

        Produto produto2 = new Produto(101, "Notebook", 10, 3500);
        produto2.mostra();
        produto2.comprar(5);
        produto2.vender(3);
        produto2.subir(250);
        produto2.descer(300);
        produto2.mostra();
        produto2.comprar(3);
        produto2.vender(20);
        produto2.subir(100);
        produto2.descer(3600);
        produto2.mostra();
    }
}
