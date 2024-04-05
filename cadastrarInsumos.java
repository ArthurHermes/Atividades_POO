import java.util.ArrayList;
import java.util.List;

public class cadastrarInsumos {
    private String nome;
    private int quantidade;
    private double preco;

  

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void exibirInsumo() {
        System.out.println("Nome: " + nome);
        System.out.println("Quantidade: " + quantidade);
        System.out.println("Preço: " + preco);
    }
}

class ListaDeInsumos {
    private List<cadastrarInsumos> listaInsumos;

    public ListaDeInsumos() {
        listaInsumos = new ArrayList<>();
    }

    public void adicionarInsumo(cadastrarInsumos insumo) {
        listaInsumos.add(insumo);
    }

    public void exibirTodosInsumos() {
        for (cadastrarInsumos insumo : listaInsumos) {
            insumo.exibirInsumo();
        }
    }
}
