package PBL07;

public class Ebook extends ItemBibliotecaDigital implements Baixavel {
    private String formato;
    private int tamanhoMB;

    public Ebook(String titulo, String autor, String formato, int tamanhoMB) {
        super(titulo, autor);
        this.autor = autor;
        this.formato = formato;
        this.tamanhoMB = tamanhoMB;
    }
    public String descricao(){
        return "Nome"+ titulo +"autor"+ autor;
    }

    @Override
    public String descricao() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void baixar() {
        // TODO Auto-generated method stub
        
    }
}

