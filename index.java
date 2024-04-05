import java.util.Scanner;

public class index{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("-------------Bem-Vindo-------------");


        //1 - Cadastrar Usúario
        //2 - Consultar Usúarios
        //3 - Cadastrar Insumos
        //4 - Consultar insumos
        //5 - Criar pedido
        //0 - Sair


        int op;

        while(true){
            try{
                System.out.println("---------------------");
                System.out.println("1 - Cadastrar Usuario");
                System.out.println("2 - Consultar Usuarios");
                System.out.println("3 - Cadastrar Insumos");
                System.out.println("4 - Consultar Insumos");
                System.out.println("5 - Criar Pedido");
                System.out.println("0 - Sair");
                System.out.println("---------------------");
                System.out.println("Selecione a baixo a opcao que deseja realizar");
                op = sc.nextInt();

                switch (op) {
                    case 0:
                        break;
                    case 1:
                        System.out.println("Insira o nome do Usuario");
                    

                    case 2:

                    case 3:

                    case 4:

                    case 5:

                }
            }catch(java.util.InputMismatchException e){
                System.out.println("Erro: Entrada inválida. Por favor, digite um número valido.");
            }
            
        }
    }
}