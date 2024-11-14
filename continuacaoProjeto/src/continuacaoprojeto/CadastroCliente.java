package continuacaoprojeto;

import java.util.Scanner;
public class CadastroCliente {

    private Cliente[] lista = new Cliente[1000];
    private int qtdClientes = 0; 
    private Scanner sc = new Scanner(System.in);
    
    public void cadastrarCliente() {
        String cpf;

        System.out.print("Digite o CPF do cliente: ");
        cpf = sc.next(); 

        // Verificar se cliente já existe pelo CPF
        Cliente clienteExistente = null;
        for (int i = 0; i < qtdClientes; i++) {
            if (lista[i] != null && lista[i].getCPF().equals(cpf)) {
                clienteExistente = lista[i];
                break;
            }
        }

        if (clienteExistente != null) {
            // Cliente já existe, exibir nome
            System.out.println("Cliente já cadastrado: " + clienteExistente.getNome());
        } else {
            // Cliente não existe, cadastrar novo cliente
            lista[qtdClientes] = new Cliente(); 
            lista[qtdClientes].setCPF(cpf);

            System.out.print("Digite o nome do cliente: ");
            sc.nextLine(); // Limpa o buffer do scanner
            lista[qtdClientes].setNome(sc.nextLine());

            qtdClientes++; 
        }
    }

    public void exibirClientes() {
        for (int i = 0; i < qtdClientes; i++) {
            System.out.println("Cliente " + (i + 1) + ": " + lista[i].getNome() + " - CPF: " + lista[i].getCPF());
        }
    }
    
    public Cliente buscarClientePorCPF(String cpf) {
    for (int i = 0; i < qtdClientes; i++) {
        if (lista[i] != null && lista[i].getCPF().equals(cpf)) {
            return lista[i];
        }
    }
    return null; // Retorna null se o cliente não for encontrado
}

}

