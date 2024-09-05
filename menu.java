import java.util.Scanner;

public class Menu {
    private SistemaEncomendas sistema;

    public Menu(SistemaEncomendas sistema) {
        this.sistema = sistema;
    }

    public void exibirMenu() {
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;

        do {
            System.out.println("\n===== Sistema de Registro de Encomendas =====");
            System.out.println("1. Registrar nova encomenda");
            System.out.println("2. Listar encomendas");
            System.out.println("3. Remover encomenda (retirada)");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();  // Consumir a nova linha

            switch (opcao) {
                case 1:
                    registrarEncomenda(scanner);
                    break;
                case 2:
                    sistema.listarEncomendas();
                    break;
                case 3:
                    removerEncomenda(scanner);
                    break;
                case 4:
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 4);

        scanner.close();
    }

    private void registrarEncomenda(Scanner scanner) {
        System.out.print("Nome do destinatário: ");
        String nome = scanner.nextLine();

        System.out.print("Apartamento: ");
        String apartamento = scanner.nextLine();

        System.out.print("Código de rastreio da encomenda: ");
        String codigoRastreio = scanner.nextLine();

        Morador morador = new Morador(nome, apartamento);
        Encomenda encomenda = new Encomenda(codigoRastreio, morador);
        sistema.registrarEncomenda(encomenda);
        SistemaNotificacao.notificarMorador(morador, encomenda);
    }

    private void removerEncomenda(Scanner scanner) {
        System.out.print("Digite o código de rastreio da encomenda para remover: ");
        String codigoRastreio = scanner.nextLine();
        sistema.removerEncomenda(codigoRastreio);
    }
}
