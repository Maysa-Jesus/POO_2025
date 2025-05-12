package exe00;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ShoppingCart {
    private int id;
    private Date date;
    private float finalPrice;
    private String address;
    private List<CarItem> carItens;

    public ShoppingCart(){
        this.date = new Date();
        this.address = "no address";
        // alocar espaço na memória para o vator
        this.carItens = new ArrayList<CarItem>();
    }

    public ShoppingCart(int id, String address) {
        this.setId(id);
        this.date = new Date();
        this.setAddress(address);
        // Não tem como usar setter no item abaixo
        this.carItens = new ArrayList<CarItem>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public float getFinalPrice() {
        return finalPrice;
    }

    public void setFinalPrice(float finalPrice) {
        this.finalPrice = finalPrice;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List getCarItens() {
        return carItens;
    }

    // Não pode ser implementado, pois estamos em uma composição
    /*public void setCarItens(List carItens) {
        this.carItens = carItens;
    }*/

    public void addCarItem(int id, float quantity, Product product){
        this.carItens.add(new CarItem(id, quantity, product));
        this.calculateFinalPrice();
    }

    public void calculateFinalPrice(){
        double soma = 0;
        // percorrer o vetor
        for(CarItem obj: this.carItens){
            soma += obj.getProduct().getPrice() * obj.getQuantity();
        }
        this.finalPrice = (float) soma;
    }

    public String toString() {
        return "ShoppingCart{" +
                "id=" + id +
                ", date=" + date +
                ", finalPrice=" + finalPrice +
                ", address='" + address + '\'' +
                ", carItens=\n" + carItens + // toString vai retornar os valores
                '}';
    }
}
