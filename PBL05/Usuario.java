import java.util.Scanner;

public class Usuario {
    private String nome;
    private int idade;
    private int cpf;

    public Usuario(String nome, int idade, int cpf) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
    }

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

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public static Usuario criarUsuario(Scanner scanner) {
        System.out.println("Digite o nome do usuário:");
        String nome = scanner.nextLine();

        System.out.println("Digite a idade do usuário:");
        int idade = scanner.nextInt();

        System.out.println("Digite o CPF do usuário:");
        int cpf = scanner.nextInt();

        // Consumir a nova linha pendente
        scanner.nextLine();

        return new Usuario(nome, idade, cpf);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Cadastro usuário:");
        Usuario usuario = Usuario.criarUsuario(scanner);
        System.out.println("Usuário criado:");
        System.out.println("Nome: " + usuario.getNome());
        System.out.println("Idade: " + usuario.getIdade());
        System.out.println("CPF: " + usuario.getCpf());
        scanner.close();
    }
}
