public class cadastrarInsumos {
    private String nome;
    private int quantidade;
    private double preco;

    public cadastrarInsumos(String nome, int quantidade, double preco){
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;

    }
    public String getNome(){
        return nome;
    }
    public void setName(String nome){
        this.nome = nome;
    }
    public int getQuantidade(){
        return quantidade;
    }
    public void setQuantidade(int quantidade){
        this.quantidade = quantidade;
    }
    public double setPreco(){
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
    public void exibirInsumo(){
        System.out.println("nome: "+ nome);
        System.out.println("quantidade: "+ quantidade);
        System.out.println("preco" + preco);
    }
}

