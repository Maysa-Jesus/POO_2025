package exe0;

import javax.swing.*;

public class Carro {
    // variaveis
    // cujo tipo de dados são primitivos
    public int ano;
    public float velocidade;

    // cujo tipo de dados são Classes
    public String marca, modelo;

    // método construtor
    public Carro(){
        this.marca = "marca não definida";
        this.modelo = "modelo não definido";
    }

    public Carro( int ano, float velocidade, String marca, String modelo) {
        this.ano = ano;
        this.velocidade = velocidade;
        this.marca = marca;
        this.modelo = modelo;
    }

    // método de instância
    public void exibirDetalhes(){
        // this representa o objeto que chama o método
        /*System.out.println("Marca: " + this.marca +
                "\n Modelo: " + this.modelo +
                "\n Ano: " + this.ano +
                "\n Velocidade: " + this.velocidade);*/
        // abrir caixa de diálogo
        JOptionPane.showMessageDialog(null, "Marca: " + this.marca +
                "\n Modelo: " + this.modelo +
                "\n Ano: " + this.ano +
                "\n Velocidade: " + this.velocidade);
    }

    // acelerar o carro de x unidades
    public void acelerar(float x){
        this.velocidade = this.velocidade + x;
    }

    // frear o carro em x unidades
    // velocidade não pode ficar negativa após a frenagem
    public void frear(float x){
        if(this.velocidade >= x){
            this.velocidade -= x;
        }
        else{
            //System.out.println("Velocidade não pode ser negativa");
            // abrir caixa de diálogo
            JOptionPane.showMessageDialog(null, "Velocidade não pode ser negativa");
        }
    }
}
