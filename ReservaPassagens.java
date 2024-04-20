import java.util.ArrayList;
import java.util.List;

public class ReservaPassagens {
    
    private static List<Passagens> listaPassagens = new ArrayList<>();

    public static void reservar(Passagens psg){
        listaPassagens.add(psg);
    }

    public static List<Passagens> getListaPassagens(){
        return listaPassagens;
    }

    public static List<Passagens> getAviao() {
        List<Passagens> tempList = new ArrayList<>();

        for(Passagens tempPsg: listaPassagens) {
            if (tempPsg instanceof Aviao) {
                tempList.add(tempPsg);
            }
        }

        return tempList;
    }

    public static List<Passagens> getOnibus() {
        List<Passagens> tempList = new ArrayList<>();

        for(Passagens tempPsg: listaPassagens) {
            if (tempPsg instanceof Onibus) {
                tempList.add(tempPsg);
            }
        }

        return tempList;
    }

    public static List<Passagens> getTrem() {
        List<Passagens> tempList = new ArrayList<>();

        for(Passagens tempPsg: listaPassagens) {
            if (tempPsg instanceof Trem) {
                tempList.add(tempPsg);
            }
        }

        return tempList;
    }


    public static boolean excluir(String cpf) {

        for (Passagens tempPassag : listaPassagens){
            if (tempPassag.getCpf().equals(cpf)) {
                listaPassagens.remove(tempPassag);
                return true;
            }
        }

        return false;

    }

    public static boolean buscar(String cpf) {

        for (Passagens tempPassag : listaPassagens){
            if (tempPassag.getCpf().equals(cpf)) {
                System.out.println(tempPassag);
                return true;
            }
        }
    
        return false;
    
    }


    public static boolean alterar(String cpf) {
        for (Passagens temPassag : listaPassagens) {
            if (temPassag.getCpf().equals(cpf)) {

                System.out.println("Passagem encontrada:");
                System.out.println(temPassag);

                System.out.println("\nAtenção: ");
                System.out.println("\nSão permitidos alterar apenas os seguintes dados: CPF, Origem, Destino, Data, Bagagem");
                System.out.print("CPF: ");
                String novoCpf = Console.lerString();
                temPassag.setCpf(novoCpf);
                System.out.print("Origem: ");
                String novaOrigem = Console.lerString();
                temPassag.setOrigem(novaOrigem);
                System.out.print("Destino: ");
                String novoDestino = Console.lerString();
                temPassag.setDestino(novoDestino);
                System.out.print("Data: ");
                String novaData = Console.lerString();
                temPassag.setData(novaData);
                System.out.print("Bagagem: ");
                String novoBagagem = Console.lerString();
                temPassag.setBagagem(novoBagagem);
               
                System.out.println("\nPassagem atualizada com sucesso!");
                System.out.println("\nPassagem atualizada:");
                System.out.println(temPassag);
                
                return true;
            }
        }
        return false;
    }

    public static void excluirTodos(List<Passagens> listaPassagens) {
        if (listaPassagens != null) {
            listaPassagens.clear();
        }
    }

}
