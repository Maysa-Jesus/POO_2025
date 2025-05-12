import questao_02.Arqueiro;
import questao_02.Guerreiro;
import questao_02.Mago;
import questao_02.Time;

public class MainQuestao02 {
    public static void main(String[] args) {
        Guerreiro g1 = new Guerreiro("Thor", 200, "Mjolnir");
        Guerreiro g2 = new Guerreiro("Homem de Ferro", 300, "Armadura");
        Guerreiro g3 = new Guerreiro("Capitão América", 250, "Escudo");
        Arqueiro a1 = new Arqueiro("Gavião Arqueiro", 350, 25);
        Mago m1 = new Mago("Feiticeira Escarlate", 55, "Chamas");

        Time t1 = new Time("Vingadores");

        t1.addPersonagem(g1);
        t1.addPersonagem(g2);
        t1.addPersonagem(g3);
        t1.addPersonagem(a1);
        t1.addPersonagem(m1);

        t1.exibirPersonagens();
        t1.resumo();
    }
}
