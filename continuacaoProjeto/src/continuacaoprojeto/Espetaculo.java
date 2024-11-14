
package continuacaoprojeto;
import java.time.LocalDate;
import java.time.LocalTime;

public class Espetaculo {
    private String nome;
    private LocalDate data;
    private LocalTime hora;
    private double valorEntrada;
    private String[][] assentos;

    
    public Espetaculo(String nome, LocalDate data, LocalTime hora, double valorEntrada) {
        this.nome = nome;
        this.data = data;
        this.hora = hora;
        this.valorEntrada = valorEntrada;
        this.assentos = new String[5][10]; 
        inicializarAssentos();
    }
    
    private void inicializarAssentos() {
        for (int i = 0; i < assentos.length; i++) {
            for (int j = 0; j < assentos[i].length; j++) {
                assentos[i][j] = "Disponível"; // "Disponível" significa que o assento está livre
            }
        }
    }

    // Métodos Get e Set
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    public double getValorEntrada() {
        return valorEntrada;
    }

    public void setValorEntrada(double valorEntrada) {
        this.valorEntrada = valorEntrada;
    }

    
    public void exibirDetalhes() {
        System.out.println("Espetáculo: " + nome);
        System.out.println("Data: " + data);
        System.out.println("Hora: " + hora);
        System.out.println("Valor da Entrada: R$" + valorEntrada);
    }
    
    public void exibirAssentos() {
        System.out.println("Assentos disponíveis para " + nome + ":");
        for (int i = 0; i < assentos.length; i++) {
            for (int j = 0; j < assentos[i].length; j++) {
                System.out.print(assentos[i][j] + "\t"); // Exibe o status de cada assento
            }
            System.out.println(); // Nova linha para a próxima linha de assentos
        }
    }
}


