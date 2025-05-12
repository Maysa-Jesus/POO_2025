package exe02;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Voo {
    private int id;
    private LocalDate data;
    private String origem, destino;

    public Voo() {
        this.origem = "Indefinido";
        this.destino = "Indefinido";
    }
    public Voo(int id, LocalDate data, String origem, String destino) {
        this.setId(id);
        this.setData(data);
        this.setOrigem(origem);
        this.setDestino(destino);
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getData() {
        return data;
    }
    public void setData(LocalDate data) {
        this.data = data;
    }

    public String getOrigem() {
        return origem;
    }
    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getDestino() {
        return destino;
    }
    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return "\nVoo{" +
                "id=" + id +
                ", data=" + data.format(formatter) +
                ", origem='" + origem + '\'' +
                ", destino='" + destino + '\'' +
                '}';
    }
}
