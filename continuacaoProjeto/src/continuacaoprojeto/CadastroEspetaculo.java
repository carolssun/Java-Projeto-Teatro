package continuacaoprojeto;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class CadastroEspetaculo {
    private Espetaculo[] lista = new Espetaculo[1000];
    private int qtdClientes = 0; 
    private Scanner sc = new Scanner(System.in);
    

    
    public CadastroEspetaculo() {
       
    }

    public void cadastrarEspetaculo() {
        DateTimeFormatter formatoData = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter formatoHora = DateTimeFormatter.ofPattern("HH:mm");

        Espetaculo espetaculo = new Espetaculo("", null, null, 0.0);

        System.out.print("Digite o nome do espetáculo: ");
        espetaculo.setNome(sc.nextLine());

        System.out.print("Digite a data do espetáculo (dd/MM/yyyy): ");
        String dataString = sc.nextLine();
        espetaculo.setData(LocalDate.parse(dataString, formatoData));

        System.out.print("Digite a hora do espetáculo (HH:mm): ");
        String horaString = sc.nextLine();
        espetaculo.setHora(LocalTime.parse(horaString, formatoHora));

        System.out.print("Digite o valor da entrada inteira: R$ ");
        espetaculo.setValorEntrada(sc.nextDouble());

        System.out.println("\nEspetáculo cadastrado com sucesso!");
        espetaculo.exibirDetalhes();

       
    }
}
