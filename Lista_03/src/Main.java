import exe00.CarItem;
import exe00.Product;
import exe00.ShoppingCart;

public class Main {
    public static void main(String[] args) {
        // crie dois produtos
        // crie 1 item de carrinho para cada produto
        Product prod1 = new Product(1, "Raquete", 300);
        Product prod2 = new Product(2, "Bolinha", 10);
        //CarItem car1 = new CarItem(11, 5, prod1);
        //CarItem car2 = new CarItem(12, 10, prod2);
        //System.out.println(car1.exibeCarItem());
        //System.out.println(car2.exibeCarItem());

        ShoppingCart sc1 = new ShoppingCart(111, "Franca");
        sc1.addCarItem(11, 5, prod1);
        sc1.addCarItem(12, 10, prod2);
        System.out.println(sc1.toString());
    }
}