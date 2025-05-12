import questao_01.Paciente;

public class MainQuestao01 {
    public static void main(String[] args) {
        Paciente pc1 = new Paciente();
        System.out.println(pc1.exibirPaciente());
        pc1.setCpf("245.65.7258-11");
        pc1.setNome("Emanuel Alvez da Penha Sanches Santos de Sousa e Oliveira");
        pc1.setIdade(-19);
        pc1.setPeso(-20);
        System.out.println(pc1.exibirPaciente());
        pc1.setCpf("245.657.258-11");
        pc1.setNome("Emanuel Alvez da Penha Sanches Santos de Sousa");
        pc1.setIdade(19);
        pc1.setPeso(70);
        System.out.println(pc1.exibirPaciente());

        Paciente pc2 = new Paciente("123.456.789-10", "Pedro Sanches da Silva", 20, 85.8f);
        System.out.println(pc2.exibirPaciente());
        pc2.ganharPeso(5.0f);
        System.out.println(pc2.exibirPaciente());
        pc2.perderPeso(10.5f);
        System.out.println(pc2.exibirPaciente());
        pc2.perderPeso(90);
        System.out.println(pc2.exibirPaciente());
    }
}