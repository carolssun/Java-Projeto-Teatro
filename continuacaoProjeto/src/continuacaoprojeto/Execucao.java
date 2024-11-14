
package continuacaoprojeto;

import java.util.Scanner;

public class Execucao {
    
    private static Scanner sc = new Scanner(System.in);
    private static CadastroEspetaculo cadastroEspetaculo = new CadastroEspetaculo();
    private static CadastroCliente cadastroCliente = new CadastroCliente();

   public static void main(String[] args) {
    int opcao;

    do {
        System.out.println("\n***** Menu Principal *****\n");
        System.out.println("1 - Cadastrar Espetáculo");
        System.out.println("2 - Cadastrar Cliente");
        System.out.println("3 - Compra de Ingressos");
        System.out.println("4 - Sair");
        System.out.print("Escolha uma opção: ");
        opcao = sc.nextInt();
        sc.nextLine();  

        switch (opcao) {
            case 1:
                System.out.println("\n***** Cadastro de Espetáculo *****");
                cadastroEspetaculo.cadastrarEspetaculo();  // Só chama aqui após escolha do menu
                break;

            case 2:
                System.out.println("\n***** Cadastro de Cliente *****");
                cadastroCliente.cadastrarCliente();
                break;

            case 3:
                System.out.println("\n***** Compra de Ingressos *****");
                // compraIngresso.realizarCompra();
                break;

            case 4:
                System.out.println("Saindo do sistema...");
                break;

            default:
                System.out.println("Opção inválida! Tente novamente.");
        }
    } while (opcao != 4);

    sc.close();
   }
}
