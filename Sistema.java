public class Sistema {
    

    private static void menu() {

        System.out.println("\nRESERVA DE PASSAGEM - MENU");
        System.out.println("1) Passagem de Ônibus");
        System.out.println("2) Passagem de Avião");
        System.out.println("3) Passagem de Trem");
        System.out.println("4) Listar todos os tickets de ÔNIBUS");
        System.out.println("5) Listar todos os tickets de AVIÃO");
        System.out.println("6) Listar todos os tickets de TREM");
        System.out.println("7) Buscar passagem");
        System.out.println("8) Cancelar passagem");
        System.out.println("9) Alterar passagem");
        System.out.println("10) Excluir todos os registros");
        System.out.println("0) Sair");
        System.out.print("Informe uma opção:");

    }

        private static void verificarOp(int op){ 

            String cpf;
            String origem;
            String destino;
            String data;
            String bagagem;
            String classe;
            String companhiaAerea;
            String assento;
            String idade;


        switch (op) {

            case 1:

            System.out.println("\n--- Passagem de Ônibus ---");
            System.out.print("CPF: ");
            cpf = Console.lerString();
            System.out.print("Origem: ");
            origem = Console.lerString();
            System.out.print("Destino: ");
            destino = Console.lerString();
            System.out.print("Data (DD/MM/AAAA): ");
            data = Console.lerString();
            System.out.print("Bagagem (S/N): ");
            bagagem = Console.lerString();
            System.out.print("Tipo de assento (Normal/ Semi-Leito/ Leito): ");
            assento = Console.lerString();

            Onibus onibus = new Onibus(cpf, origem, destino, data, bagagem, assento);
            ReservaPassagens.reservar(onibus);

            System.out.println("\nPassagem reservada com sucesso!");
            
                
            break;
        

            case 2:

            System.out.println("\n--- Passagem de Avião ---");
            System.out.print("CPF: ");
            cpf = Console.lerString();
            System.out.print("Origem: ");
            origem = Console.lerString();
            System.out.print("Destino: ");
            destino = Console.lerString();
            System.out.print("Classe (Econômica/ Executiva/ Primeira Classe): ");
            classe = Console.lerString();
            System.out.print("Data (DD/MM/AAAA): ");
            data = Console.lerString();
            System.out.print("Bagagem (S/N): ");
            bagagem = Console.lerString();
            System.out.print("Companhia Aérea (LATAM/ GOL/ AZUL): ");
            companhiaAerea = Console.lerString();

            Aviao aviao = new Aviao(cpf, origem, destino, classe, data, bagagem, companhiaAerea);
            ReservaPassagens.reservar(aviao);

            System.out.println("\nPassagem reservada com sucesso!");

            break;


            case 3:

            System.out.println("\n--- Passagem de Trem ---");
            System.out.print("CPF: ");
            cpf = Console.lerString();
            System.out.print("Origem: ");
            origem = Console.lerString();
            System.out.print("Destino: ");
            destino = Console.lerString();
            System.out.print("Data (DD/MM/AAAA): ");
            data = Console.lerString();
            System.out.print("Bagagem (S/N): ");
            bagagem = Console.lerString();
            System.out.print("Idade (Criança/ Adulto/ Idoso): ");
            idade = Console.lerString();

            Trem trem = new Trem(cpf, origem, destino, data, bagagem, idade);
            ReservaPassagens.reservar(trem);

            System.out.println("\nPassagem reservada com sucesso!");

            break;


            case 4:

            System.out.println("\n--- PASSAGENS RESERVADAS *ÔNIBUS* ---");

            for (Passagens tempPassagens : ReservaPassagens.getListaPassagens()) {
                    
                if(tempPassagens instanceof Onibus) {
                    System.out.println(tempPassagens);
                } else {
                    System.out.println("Não existem reservas");
                }
            }

            break;

            case 5:


            System.out.println("\n--- PASSAGENS RESERVADAS *AVIÃO* ---");

            for (Passagens tempPassagens : ReservaPassagens.getListaPassagens()) {
                    
                if(tempPassagens instanceof Aviao) {
                    System.out.println(tempPassagens);
                } else {
                    System.out.println("Não existem reservas");
                }

            }

            break;

            case 6:


            System.out.println("\n--- PASSAGENS RESERVADAS *TREM* ---");

            for (Passagens tempPassagens : ReservaPassagens.getListaPassagens()) {
                    
                if(tempPassagens instanceof Trem) {
                    System.out.println(tempPassagens);
                } else {
                    System.out.println("Não existem reservas");
                }
            }

            break;

            
            case 7:

            System.out.println("\n--- BUSCAR PASSGEM ---");

            System.out.println("Digite o CPF: ");
            cpf = Console.lerString();

            if (ReservaPassagens.buscar(cpf)){
                System.out.println("\nPassagem encontrada!");
            } else {
                System.out.println("\nCPF " + cpf + " não localizado");
            }

            break;

            case 8:

            System.out.println("\n--- CANCELAR PASSGEM ---");

            System.out.println("Digite o CPF: ");
            cpf = Console.lerString();

            if (ReservaPassagens.excluir(cpf)){
                System.out.println("\nPassagem cancelada com sucesso!");
            } else {
                System.out.println("\nCPF " + cpf + " não localizado");
            }

            break;

            
            case 9:


            System.out.println("\n--- ALTERAR PASSAGEM ---");

            System.out.print("Digite o CPF: ");
            cpf = Console.lerString();

            if (ReservaPassagens.alterar(cpf)){
            } else {
                System.out.println("\nCPF " + cpf + " não localizado");
            }
            
            break;

            case 10:

            System.out.println("\n--- EXCLUIR REGISTROS ---");

                
            if (!ReservaPassagens.getListaPassagens().isEmpty()) {
                ReservaPassagens.excluirTodos(ReservaPassagens.getListaPassagens());
                System.out.println("Todos os registros foram excluídos com sucesso!");
            } else {
                System.out.println("A lista de passagens já está vazia.");
            }

            break;

            case 0:

            System.out.println("\nO Sistema foi finalizado...");
                break;

            default:
                System.out.println("\nOpção inválida. Digite novamente.");
                break;
        }

        System.out.println();

    }

    public static void executar() {

        int op;

        do {

            menu();
            op = Console.lerInt();
            verificarOp(op);

        } while (op != 0);
    }

}




