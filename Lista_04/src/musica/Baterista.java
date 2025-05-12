package musica;

public class Baterista extends Musico{
    private int nroDeTambores;

    public Baterista() {
        super();
    }

    public Baterista(String nome, int idade, int nroDeTambores) {
        super(nome, idade);
        this.setNroDeTambores(nroDeTambores);
    }

    public int getNroDeTambores() {
        return nroDeTambores;
    }
    public void setNroDeTambores(int nroDeTambores) {
        this.nroDeTambores = nroDeTambores;
    }

    @Override
    public String toString() {
        return "Baterista{" +
                super.toString() +
                "nroDeTambores=" + nroDeTambores +
                '}';
    }

    @Override
    public String tocar() {
        return "Baterista fazendo batida com " + this.nroDeTambores + " tambores";
    }
}
