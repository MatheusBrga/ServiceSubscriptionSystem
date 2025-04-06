import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SubscriptionSystem subscriptionSystem = new SubscriptionSystem();
        Scanner scanner = new Scanner(System.in);

        subscriptionSystem.cadastrarServico(new Service("Netflix", 20.90, "Entretenimento"));
        subscriptionSystem.cadastrarServico(new Service("Spotify", 21.90, "Música"));
        subscriptionSystem.cadastrarServico(new Service("Amazon Prime", 19.90, "Entretenimento"));

        int opcao;

        do{
            System.out.println("===== MENU =====\n");
            System.out.println("1 - Cadastrar usuário");
            System.out.println("2 - Listar usuários");
            System.out.println("3 - Listar serviços disponíveis");
            System.out.println("4 - Assinar serviço");
            System.out.println("5 - Cancelar serviço");
            System.out.println("6 - Exibir assinaturas de um usuário");
            System.out.println("7 - Calcular total mensal de um usuário");
            System.out.println("8 - Sair\n");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao){
                case 1:
                    System.out.print("Informe seu nome: ");
                    String nomeCadastro = scanner.nextLine();
                    System.out.print("Informe seu CPF: ");
                    String cpfCadastro = scanner.nextLine();
                    subscriptionSystem.cadastrarNovoUsuario(nomeCadastro, cpfCadastro);
                    break;

                case 2:
                    subscriptionSystem.listarUsuariosCadastrados();
                    break;

                case 3:
                    subscriptionSystem.listarServicosDisponiveis();
                    break;

                case 4:
                    System.out.print("Informe seu CPF: ");
                    String cpfServico = scanner.nextLine();
                    System.out.print("Informe o nome do serviço que deseja: ");
                    String nomeServico = scanner.nextLine();
                    subscriptionSystem.assinarServico(cpfServico, nomeServico);
                    break;

                case 5:
                    System.out.print("Informe seu CPF: ");
                    String cpfCancelarServico = scanner.nextLine();
                    System.out.print("Informe o nome do serviço que deseja cancelar: ");
                    String nomeCancelarServico = scanner.nextLine();
                    subscriptionSystem.cancelarAssinatura(cpfCancelarServico, nomeCancelarServico);
                    break;

                case 6:
                    System.out.print("Informe seu CPF: ");
                    String cpfExibirAssinaturas = scanner.nextLine();
                    subscriptionSystem.exibirAssinaturasDeUmUsuario(cpfExibirAssinaturas);
                    break;

                case 7:
                    System.out.print("Informe seu CPF: ");
                    String cpfValorMensal = scanner.nextLine();
                    subscriptionSystem.calculoMensalDeUmUsuario(cpfValorMensal);
                    break;

                case 8:
                    System.out.println("Saindo do Sistema...");
                    break;

                default:
                    System.out.println("Você não informou uma opção válida!");
                    break;
            }

        } while(opcao != 8);

        scanner.close();
    }
}
