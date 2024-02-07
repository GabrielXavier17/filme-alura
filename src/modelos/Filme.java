package modelos;

import calculos.Classificavel;
import modelos.Titulo;

public class Filme extends Titulo implements Classificavel {
    private String diretor;

    public Filme(String nome, int anoDeLancamento) {
        super(nome, anoDeLancamento);
    }

    public String getDiretor(){
        return diretor;
    }


    public void setDiretor(String diretor) {
        this.diretor = diretor;

    }

    @Override
    public double getClassificacao() {
        return pegaMedia() / 2;
    }

    @Override
    public String toString() {
        return "Filme: " + this.getNome() + " (" + this.getAnoDeLancamento() + ")" ;
    }
}