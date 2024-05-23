
import java.util.Scanner;

public class ContaTerminal {
    private String nome;
    private int idade;
    private String endereco;
    private String numeroTelefone;
    private String numeroAgencia;
    private String nomeBanco;
    private double saldo;

    // Construtor
    public ContaTerminal(String nome, int idade, String endereco, String numeroTelefone, String numeroAgencia, String nomeBanco, double saldo) {
        this.nome = nome;
        this.idade = idade;
        this.endereco = endereco;
        this.numeroTelefone = numeroTelefone;
        this.numeroAgencia = numeroAgencia;
        this.nomeBanco = nomeBanco;
        this.saldo = saldo;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getNumeroTelefone() {
        return numeroTelefone;
    }

    public void setNumeroTelefone(String numeroTelefone) {
        this.numeroTelefone = numeroTelefone;
    }

    public String getNumeroAgencia() {
        return numeroAgencia;
    }

    public void setNumeroAgencia(String numeroAgencia) {
        this.numeroAgencia = numeroAgencia;
    }

    public String getNomeBanco() {
        return nomeBanco;
    }

    public void setNomeBanco(String nomeBanco) {
        this.nomeBanco = nomeBanco;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitando as informações do usuário
        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();
        scanner.nextLine(); // Consumir a nova linha deixada pelo nextInt

        System.out.print("Digite seu endereço: ");
        String endereco = scanner.nextLine();

        System.out.print("Digite seu número de telefone: ");
        String numeroTelefone = scanner.nextLine();

        System.out.print("Digite o número da agência: ");
        String numeroAgencia = scanner.nextLine();

        System.out.print("Digite o nome do banco: ");
        String nomeBanco = scanner.nextLine();

        System.out.print("Digite o saldo: ");
        double saldo = scanner.nextDouble();

        // Criando um objeto da classe ContaTerminal
        ContaTerminal conta = new ContaTerminal(nome, idade, endereco, numeroTelefone, numeroAgencia, nomeBanco, saldo);

        // Exibindo os dados da conta
        System.out.println("\nInformações da Conta:");
        System.out.println("Nome: " + conta.getNome());
        System.out.println("Idade: " + conta.getIdade());
        System.out.println("Endereço: " + conta.getEndereco());
        System.out.println("Número de Telefone: " + conta.getNumeroTelefone());
        System.out.println("Número da Agência: " + conta.getNumeroAgencia());
        System.out.println("Nome do Banco: " + conta.getNomeBanco());
        System.out.println("Saldo: " + conta.getSaldo());

        scanner.close();
    }
}
