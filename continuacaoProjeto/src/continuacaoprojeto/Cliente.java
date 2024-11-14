package continuacaoprojeto;
public class Cliente {

    private String nome;
    private String CPF;
    private static int clientes;//quantidade de clienres -> variavel compartilhada por todos os objetos, pois é estática 


    public Cliente() {
        clientes++; 
    } 
    
    public Cliente(String nome, String CPF) {
        this.nome = nome;
        this.CPF = CPF;
        clientes++;
    }

    public static int getClientes(){
        return clientes; 
    }

    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return CPF;
    }


    public void setCPF(String CPF) {
        this.CPF = CPF;
    }


   public String toString(){
       String s;
       s="\n\n *** CADASTRO DE ESPETÁCULO ***";
       s+="\n\n Nome = " + this.nome;
       s+="\n CPF = " + this.CPF;
       return s; 
   }

}


