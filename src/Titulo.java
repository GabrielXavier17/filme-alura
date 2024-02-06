public class Titulo {

    private String Nome;
    private int AnoDeLancamento;
    private boolean IncluidoNoPlano;
    private double SomaDasAvaliacoes;
    private int TotalDeAvaliacoes;
    private int DuracaoEmMinutos;

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public int getAnoDeLancamento() {
        return AnoDeLancamento;
    }

    public void setAnoDeLancamento(int AnoDeLancamento) {
        this.AnoDeLancamento = AnoDeLancamento;
    }


    public boolean isIncluidoNoPlano() {
        return IncluidoNoPlano;
    }

    public void setIncluidoNoPlano(boolean IncluidoNoPlano) {
        this.IncluidoNoPlano = IncluidoNoPlano;
    }

    public double getSomaDasAvaliacoes() {
        return SomaDasAvaliacoes;
    }

    public void setSomaDasAvaliacoes(double SomaDasAvaliacoes) {
        this.SomaDasAvaliacoes = SomaDasAvaliacoes;
    }

    public int getTotalDeAvaliacoes() {
        return TotalDeAvaliacoes;
    }

    public void setTotalDeAvaliacoes(int TotalDeAvaliacoes) {
        this.TotalDeAvaliacoes = TotalDeAvaliacoes;
    }

    public int getDuracaoEmMinutos() {
        return DuracaoEmMinutos;
    }

    public void setDuracaoEmMinutos(int DuracaoEmMinutos) {
        this.DuracaoEmMinutos = DuracaoEmMinutos;
    }

    public void exibeFichaTecnica(){
        System.out.println("Nome do filme: " + Nome);
        System.out.println("Ano de lançamento: " + AnoDeLancamento);
    }

    public void avalia(double nota){
        SomaDasAvaliacoes += nota;
        TotalDeAvaliacoes++;

    }


    public double pegaMedia() {
        return SomaDasAvaliacoes / TotalDeAvaliacoes;
    }




}
