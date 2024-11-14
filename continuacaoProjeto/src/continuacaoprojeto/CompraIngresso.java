// ainda está dando erro, por isso comentei tudo
package continuacaoprojeto;
import java.util.Scanner;
/*
public class CompraIngresso {
    private static Scanner sc = new Scanner(System.in);
    private static CadastroEspetaculo cadastroEspetaculo;
    private static CadastroCliente cadastroCliente;

    public CompraIngresso(CadastroEspetaculo cadastroEspetaculo, CadastroCliente cadastroCliente) {
        this.cadastroEspetaculo = cadastroEspetaculo;
        this.cadastroCliente = cadastroCliente;
    }

    
    public void realizarCompra() {
        while (true) {
            // Exibir lista de espetáculos
            cadastroEspetaculo.exibirEspetaculos();
            System.out.print("Escolha o número do espetáculo para comprar ingresso (ou 0 para voltar ao menu principal): ");
            int numeroEspetaculo = sc.nextInt();
            sc.nextLine(); 

            if (numeroEspetaculo == 0) {
                return;
            }

            // Obter o espetáculo selecionado
            Espetaculo espetaculo = cadastroEspetaculo.selecionarEspetaculo(numeroEspetaculo);
            if (espetaculo == null) {
                System.out.println("Espetáculo inválido, tente novamente.");
                continue;
            }


            espetaculo.exibirAssentos();

            double valorTotal = 0;
            boolean continuarComprando = true;

            // Enquanto o usuário desejar comprar ingressos, continua o processo
            while (continuarComprando) {
                System.out.print("Escolha o número do assento desejado (linha coluna, ex: 1 2): ");
                int linha = sc.nextInt();
                int coluna = sc.nextInt();

                // Verificar se o assento está disponível
                if (!espetaculo.comprarIngresso(linha, coluna)) {
                    System.out.println("Assento já ocupado, escolha outro.");
                    continue;
                }

                // Solicitar o tipo de ingresso e calcular o valor
                System.out.println("Tipos de ingresso:");
                System.out.println("1 - Inteira");
                System.out.println("2 - Meia");
                System.out.println("3 - Professor");
                System.out.print("Escolha o tipo de ingresso: ");
                int tipoEntrada = sc.nextInt();
                sc.nextLine(); 

                double valorIngresso = 0;
                switch (tipoEntrada) {
                    case 1:
                        valorIngresso = espetaculo.getValorEntrada(); // Inteira
                        break;
                    case 2:
                        valorIngresso = espetaculo.getValorEntrada() / 2; // Meia
                        break;
                    case 3:
                        valorIngresso = espetaculo.getValorEntrada() * 0.7; // Professor 
                        break;
                    default:
                        System.out.println("Opção inválida, tente novamente.");
                        continue;
                }

                valorTotal += valorIngresso;

                
                System.out.print("Deseja comprar mais ingressos? (S/N): ");
                String resposta = sc.nextLine();
                if (resposta.equalsIgnoreCase("N")) {
                    continuarComprando = false;
                }
            }*/
/*
            // Solicitar o CPF do cliente para vincular com a pompra 
            System.out.print("Digite o CPF do cliente que está comprando os ingressos: ");
            String cpfCliente = sc.nextLine();

            // Verificar se o CPF existe 
            Cliente cliente = cadastroCliente.buscarClientePorCPF(cpfCliente);
            if (cliente == null) {
                System.out.println("Cliente não encontrado. O CPF informado não está cadastrado.");
            } else {
                System.out.printf("Valor total a ser pago: R$ %.2f\n", valorTotal);
                System.out.println("Compra realizada com sucesso!");
            }

            
            return;
        }
    }
}
*/