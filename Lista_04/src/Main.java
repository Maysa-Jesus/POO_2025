import rh.Assistente;
import rh.Diretor;
import rh.Funcionario;
import rh.Gerente;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void mostraDadosDetalhados(Funcionario obj){
        System.out.println(obj.toString() + "\nSalário final: " + obj.calculaSalario());
    }

    public static void main(String[] args) {
        Assistente as1 = new Assistente("João", "São Paulo", "123456789/88", 3000, 10);
        mostraDadosDetalhados(as1);
        Gerente ge1 = new Gerente("Pedro", "São Joaquim", "456789123/55", 5000, 2000);
        mostraDadosDetalhados(ge1);
        Diretor di1 = new Diretor("Vitor", "Claraval", "789456123/44", 7000, 1000);
        mostraDadosDetalhados(di1);

        // vetor de funcionários
        List<Funcionario> vetor = new ArrayList<Funcionario>();
        // adiciona no vetor
        vetor.add(as1);
        vetor.add(ge1);
        vetor.add(di1);

        // calcula folha de pagamento
        float folha = 0;
        for(Funcionario obj: vetor ){
            folha += obj.calculaSalario();
        }
        System.out.println("Folha de pagamento: " + folha);
    }

}