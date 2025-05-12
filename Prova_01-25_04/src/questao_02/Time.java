package questao_02;

import java.util.ArrayList;
import java.util.List;

public class Time {
    private String nome;
    private List<Personagem> personagens;

    public Time() {
        this.nome = "sem nome";
        this.personagens = new ArrayList<>();
    }
    public Time(String nome) {
        this.setNome(nome);
        this.personagens = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }
    public List<Personagem> getPersonagens() {
        return personagens;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void addPersonagem(Personagem personagem) {
        this.personagens.add(personagem);
    }

    public void exibirPersonagens(){
        for(Personagem personagem : personagens){
            System.out.println("\n" + personagem.toString());
        }
    }

    public void resumo(){
        System.out.println("\nResumo do Time: Nome: " + this.getNome() +
                "; Total de personagens: " + this.getPersonagens().size());
    }
}
