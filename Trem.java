public class Trem extends Passagens {
    
    private String idade;

    public Trem(String cpf, String origem, String destino, String data, String bagagem, String idade){
        super(cpf, origem, destino, data, bagagem);
        this.idade = idade;
    }

    @Override
    public String toString() {
        
        return super.toString() +
        "\nCriança/ Adulto/ Idoso: " + idade;

}

}
