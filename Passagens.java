public class Passagens {
    
    private String cpf;
    private String origem;
    private String destino;
    private String data;
    private String bagagem;

    public Passagens(String cpf, String origem, String destino, String data, String bagagem){
        this.cpf = cpf;
        this.origem = origem;
        this.destino = destino;
        this.data = data;
        this.bagagem = bagagem;
    }

    public String getCpf() {
        return cpf;
    }

    public String getDestino() {
        return destino;
    }

    public String getOrigem() {
        return origem;
    }


    public String getData() {
        return data;
    }

    public String getBagagem() {
        return bagagem;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }
    
    public void setData(String data) {
        this.data = data;
    }
    
    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public void setBagagem(String bagagem) {
        this.bagagem = bagagem;
    }


    @Override
    public String toString() {
        
        return "\nCPF: " + cpf +
        "\nOrigem: " + origem + 
        "\nDestino: " + destino +
        "\nData: " + data +
        "\nBagagem: " + bagagem;
    }

}
