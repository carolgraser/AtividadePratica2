public class Onibus extends Passagens {
    
    String assento;

    public Onibus(String cpf, String origem, String destino, String data, String bagagem, String assento){
        super(cpf, origem, destino, data, bagagem);
        this.assento = assento;
    }

    @Override
    public String toString() {
        
        return super.toString() +
        "\nAssento: " + assento;

}

}
