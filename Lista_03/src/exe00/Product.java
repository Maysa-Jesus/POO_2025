package exe00;

public class Product {
    private int id;
    private String description;
    private double price;

    public Product(){
        this.description = "no description";
    }
    public Product(int id, String description, double price){
        this.setId(id);
        this.setDescription(description);
        this.setPrice(price);
    }

    public String getDescription() {
        return this.description;
    }
    public double getPrice() {
        return this.price;
    }
    public int getId() {
        return this.id;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String toString() {
        return " Product{" +
                " id=" + getId() +
                ", description='" + getDescription() + '\'' +
                ", price=" + getPrice() +
                '}';
    }

}
