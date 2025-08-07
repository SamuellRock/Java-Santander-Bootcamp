import smartphone.Iphone;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Iphone meuIphone = new Iphone();

        int opcao = -1;

        while (opcao != 0) {
            System.out.println("\n\n=== MENU DO Iphone ===");
            System.out.println("1 - Reprodutor Musical");
            System.out.println("2 - Aparelho Telefônico");
            System.out.println("3 - Navegador na Internet");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar buffer

            switch (opcao) {
                case 1:
                    menuMusica(meuIphone, scanner);
                    break;
                case 2:
                    menuTelefone(meuIphone, scanner);
                    break;
                case 3:
                    menuInternet(meuIphone, scanner);
                    break;
                case 0:
                    System.out.println("Encerrando Iphone...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }

        scanner.close();
    }

    private static void menuMusica(Iphone Iphone, Scanner scanner) {
        int opcao;
        do {
            System.out.println("\n\n--- Reprodutor Musical ---");
            System.out.println("1 - Tocar");
            System.out.println("2 - Pausar");
            System.out.println("3 - Selecionar música");
            System.out.println("0 - Voltar");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    Iphone.tocar();
                    break;
                case 2:
                    Iphone.pausar();
                    break;
                case 3:
                    System.out.print("Digite o nome da música: ");
                    String musica = scanner.nextLine();
                    Iphone.selecionarMusica(musica);
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);
    }

    private static void menuTelefone(Iphone Iphone, Scanner scanner) {
        int opcao;
        do {
            System.out.println("\n\n--- Aparelho Telefônico ---");
            System.out.println("1 - Ligar");
            System.out.println("2 - Atender");
            System.out.println("3 - Iniciar correio de voz");
            System.out.println("0 - Voltar");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o número: ");
                    String numero = scanner.nextLine();
                    Iphone.ligar(numero);
                    break;
                case 2:
                    Iphone.atender();
                    break;
                case 3:
                    Iphone.iniciarCorreioVoz();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);
    }

    private static void menuInternet(Iphone Iphone, Scanner scanner) {
        int opcao;
        do {
            System.out.println("\n\n--- Navegador na Internet ---");
            System.out.println("1 - Exibir página");
            System.out.println("2 - Adicionar nova aba");
            System.out.println("3 - Atualizar página");
            System.out.println("0 - Voltar");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Digite a URL: ");
                    String url = scanner.nextLine();
                    Iphone.exibirPagina(url);
                    break;
                case 2:
                    Iphone.adicionarNovaAba();
                    break;
                case 3:
                    Iphone.atualizarPagina();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);
    }
}
