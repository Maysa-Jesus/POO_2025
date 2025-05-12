package musica;

public class Pianista extends Musico{
    private boolean tecladoDigital;

    public Pianista() {
        super();
    }

    public Pianista(String nome, int idade, boolean tecladoDigital) {
        super(nome, idade);
        this.setTecladoDigital(tecladoDigital);
    }

    public boolean isTecladoDigital() {
        return tecladoDigital;
    }
    public void setTecladoDigital(boolean tecladoDigital) {
        this.tecladoDigital = tecladoDigital;
    }

    @Override
    public String toString() {
        return "Pianista{" +
                super.toString() +
                "tecladoDigital=" + tecladoDigital +
                '}';
    }

    @Override
    public String tocar() {
        return this.tecladoDigital ?
        "Pianista tocando uma peça em teclado digital":
        "Pianista tocando uma peça em piano acústico";

    }
}
