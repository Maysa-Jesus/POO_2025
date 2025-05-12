package musica;

import rh.Funcionario;

import java.util.ArrayList;
import java.util.List;

public class Recital {
    private String tema;
    private List<Musico> musicos;

    public Recital() {
        this.tema = "Indefinido";
        this.musicos = new ArrayList<Musico>();
    }

    public Recital(String tema) {
        this.tema = tema;
        this.musicos = new ArrayList<Musico>();
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public List<Musico> getMusicos() {
        return musicos;
    }

    public void addMusico(Musico musico) {
        // músico pode se comportar como baterista, guitarrista ou pianista
        this.musicos.add(musico);
    }

    public void apresentarTodos(){
        for(Musico obj: this.musicos){
            // polimorfismo -> obj vai executar o tocar
            // de classes diferentes
            System.out.println(obj.tocar());
        }
    }

    public void resumoRecital(){
        this.apresentarTodos();
        System.out.println("\nResumo: Número total de músicos: " + this.musicos.size() +
                            "; Tema: " + this.tema);
    }
}
