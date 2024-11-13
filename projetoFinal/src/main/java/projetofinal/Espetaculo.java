package projetofinal;
import java.time.LocalDate;
import java.time.LocalTime;

public class Espetaculo {
    private String nome;
    private LocalDate data;
    private LocalTime hora;
    private double valorEntrada;

    
    public Espetaculo(String nome, LocalDate data, LocalTime hora, double valorEntrada) {
        this.nome = nome;
        this.data = data;
        this.hora = hora;
        this.valorEntrada = valorEntrada;
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
}

