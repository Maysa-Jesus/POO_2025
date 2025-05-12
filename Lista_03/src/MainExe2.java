import exe02.Passageiro;
import exe02.Reserva;
import exe02.Voo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class MainExe2 {
    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        Passageiro p1 = new Passageiro(1, "22244455588", "João");

        LocalDate objData = LocalDate.parse("12/04/2025", formatter);
        Voo voo1 = new Voo(11, objData,  "Campinas", "Salvador");

        Reserva re1 = new Reserva(111, 7, p1, voo1);
        System.out.println(re1);
        re1.verificarValidade();

        // teste forçando data antiga para verificar a validade
        LocalDate objData2 = LocalDate.parse("31/03/2025", formatter);
        LocalDate dataPassada = LocalDate.parse("24/03/2025", formatter);
        Passageiro p2 = new Passageiro(2, "22233355599", "José");

        Voo voo2 = new Voo(12, objData2, "São Paulo", "Rio de Janeiro");
        Reserva re2 = new Reserva(112, 5, p2, voo2);
        re2.setData(dataPassada); // colocando data antiga propositalmente
        System.out.println(re2);
        re2.verificarValidade();
    }
}