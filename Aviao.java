public class Aviao extends Passagens {
    
    private String classe;
    private String companhiaAerea;

    public Aviao(String cpf, String origem, String destino, String classe, String data, String bagagem, String companhiaAerea){
        super(cpf, origem, destino, data, bagagem);
        this.classe = classe;
        this.companhiaAerea = companhiaAerea;
    }

    public String getClasse() {
        return classe;
    }

    public String getCompanhiaAerea() {
        return companhiaAerea;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public void setCompanhiaAerea(String companhiaAerea) {
        this.companhiaAerea = companhiaAerea;
    }

    @Override
    public String toString() {
        
        return super.toString() +
        "\nClasse (econômica/ executiva/ primeira classe): " + classe +
        "\nCompanhia Aérea: " + companhiaAerea;

    }
}
