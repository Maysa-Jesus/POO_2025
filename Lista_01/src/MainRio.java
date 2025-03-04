import exe4.Rio;

public class MainRio {
    public static void main(String[] args) {
        Rio rio1 = new Rio();
        rio1.mostra();

        Rio rio2 = new Rio("Nilo", 10.5f, true);
        rio2.mostra();
        rio2.chover(2);
        rio2.ensolarar(3.5f);
        rio2.sujar();
        rio2.limpar();
        rio2.mostra();
        rio2.chover(1);
        rio2.ensolarar(10.5f);
        rio2.limpar();
        rio2.sujar();
        rio2.limpar();
        rio2.mostra();
    }
}
