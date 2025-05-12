package exe00;

public class CarItem {
    private int id;
    private float quantity;
    // associação todo-parte
    private Product product;

    public CarItem() {
    }
    // o product já está criado, associação fraca
    // associação
    public CarItem(int id, float quantity, Product product) {
        this.setId(id);
        this.setQuantity(quantity);
        this.setProduct(product);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getQuantity() {
        return quantity;
    }

    public void setQuantity(float quantity) {
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }
    // o product já está criado, associação fraca
    // associação
    public void setProduct(Product product) {
        this.product = product;
    }

    public String toString() {
        return "\nCarItem{" +
                " id=" + getId() +
                ", quantity=" + getQuantity()+
                ", product=" + product +
                '}';
    }
}