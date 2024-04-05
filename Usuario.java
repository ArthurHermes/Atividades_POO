import java.util.Scanner;

public class Usuario{
    private String nome;
    private int idade;
    private int cpf;


    public Usuario(String nome, int idade, int cpf){
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
    }


    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public int getIdade(){
        return idade;
    }

    public void  setIdade(int idade){
        this.idade = idade;
    }

    public int getCpf(){
        return cpf;
    }

    public void setCpf(int cpf){
        this.cpf = cpf;
    }

    public static Usuario criarUsuario(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome de usuario:");
        String nome = scanner.nextLine();

        System.out.println("Digite sua idade:");
        int idade = scanner.nextInt();

        System.out.println("Digite seu CPF:");
        int cpf = scanner.nextInt();

        scanner.close();

        return new Usuario(nome, idade, cpf);
    }    

    public static void main(String[] args) {
        Usuario usuario = Usuario.criarUsuario();
        System.out.println("Usuario criado");
        System.out.println("Nome" + usuario.getNome());
        System.out.println("Idade" + usuario.getIdade());
        System.out.println("CPF: "+ usuario.getCpf());

    }



}

