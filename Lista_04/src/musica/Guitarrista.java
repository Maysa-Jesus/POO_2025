package musica;

public class Guitarrista extends Musico{
    private String tipoGuitarra;

    public Guitarrista(String tipoGuitarra) {
        super();
        this.tipoGuitarra = "Indefinido";
    }

    public Guitarrista(String nome, int idade, String tipoGuitarra) {
        super(nome, idade);
        this.setTipoGuitarra(tipoGuitarra);
    }

    public String getTipoGuitarra() {
        return tipoGuitarra;
    }
    public void setTipoGuitarra(String tipoGuitarra) {
        this.tipoGuitarra = tipoGuitarra;
    }

    @Override
    public String toString() {
        return "Guitarrista{" +
                super.toString() +
                "tipoGuitarra='" + tipoGuitarra + '\'' +
                '}';
    }

    @Override
    public String tocar() {
        return "Guitarrista tocando solo de guitarra";
    }
}
