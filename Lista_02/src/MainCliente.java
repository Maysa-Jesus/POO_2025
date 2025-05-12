import exe01.Cliente;

public class MainCliente {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente();
        System.out.println(cliente1.exibirDados());

        Cliente cliente2 = new Cliente("123456-7", "1234-5", "Fulano", 1000.0f);
        System.out.println(cliente2.exibirDados());
        cliente2.realizarDeposito(-1);
        cliente2.realizarSaque(-1);
        cliente2.realizarSaque(300);
        cliente2.realizarDeposito(200);
        cliente2.realizarSaque(1000);
        System.out.println(cliente2.exibirDados());

        Cliente cliente3 = new Cliente("123456-a", "124-54", "Ciclano Alvez da Penha Sanches Santos", -2);
        System.out.println(cliente3.exibirDados());

        // Ao tentar acessar variáveis privadas diretamente sem getters ou setters tem-se erro
        // Por exemplo: System.out.println(cliente.nome);
        // O código acima irá gerar um erro de compilação

    }
}
