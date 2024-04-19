package PBL07;

class VideoDigital extends ItemBibliotecaDigital implements Baixavel, Visualizar {
    
    public VideoDigital(String titulo, String autor) {
        super(titulo, autor);
    }
    
    @Override
    public String descricao() {
        return "Video Digital: " + titulo + " - Autor: " + autor;
    }
    
    @Override
    public void baixar() {
        System.out.println("Baixando o vídeo digital: " + titulo);
    }
    
    @Override
    public void visualizar() {
        System.out.println("Visualizando o vídeo digital: " + titulo);
    }
}
