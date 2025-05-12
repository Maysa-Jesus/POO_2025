package exe02;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Reserva {
    private int id, validade;
    private LocalDate data;
    private Passageiro passageiro;
    private Voo voo;
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public Reserva() {
        this.data = LocalDate.now();
        this.passageiro = new Passageiro();
        this.voo = new Voo();
    }
    public Reserva(int id, int validade, Passageiro passageiro, Voo voo) {
        this.data = LocalDate.now();
        this.id = id;
        this.validade = validade;
        this.passageiro = passageiro;
        this.voo = voo;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public int getValidade() {
        return validade;
    }
    public void setValidade(int validade) {
        this.validade = validade;
    }

    public LocalDate getData() {
        return data;
    }
    public void setData(LocalDate data) {
        this.data = data;
    }

    public Passageiro getPassageiro() {
        return passageiro;
    }
    public void setPassageiro(Passageiro passageiro) {
        this.passageiro = passageiro;
    }

    public Voo getVoo() {
        return voo;
    }
    public void setVoo(Voo voo) {
        this.voo = voo;
    }

    public void verificarValidade() {
        LocalDate dataExpiracao = this.data.plusDays(this.validade);

        if (LocalDate.now().isBefore(dataExpiracao)) {
            System.out.println("A reserva ainda é válida! Expiração: " + dataExpiracao.format(formatter));
        } else {
            System.out.println("A reserva expirou em: " + dataExpiracao.format(formatter));
        }
    }

    public String toString() {
        return "\nReserva{" +
                "id=" + id +
                ", validade=" + validade +
                ", data=" + this.data.format(formatter) +
                ", passageiro=" + passageiro +
                ", voo=" + voo +
                '}';
    }
}
