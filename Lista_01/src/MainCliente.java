import exe2.Cliente;

public class MainCliente {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente();
        cliente1.informacoesCliente();

        Cliente cliente2 = new Cliente(54321, 9876, "Fulano", 0);
        cliente2.informacoesCliente();
        cliente2.realizarDeposito(200);
        cliente2.realizarSaque(300);
        cliente2.informacoesCliente();

        Cliente cliente3 = new Cliente(98765, 4321, "Beltrano", 0.50f);
        cliente3.informacoesCliente();
        cliente3.realizarDeposito(5000);
        cliente3.realizarSaque(2000);
        cliente3.informacoesCliente();
    }
}
