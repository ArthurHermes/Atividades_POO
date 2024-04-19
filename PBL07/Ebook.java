package PBL07;

public class Ebook extends ItemBibliotecaDigital implements Baixavel {

    public Ebook(String titulo, String autor) {
        super(titulo, autor);

    }
    public String descricao(){
        return "Nome"+ titulo +"autor"+ autor;
    }
    @Override
    public void baixar() {
        
    }
}
