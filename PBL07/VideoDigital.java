class VideoDigital extends ItemBibliotecaDigital implements Baixavel, Visualizar {
    private String formato;
    private int resolucao;
    
    public VideoDigital(String titulo, String autor, String formato, int resolucao) {
        super(titulo, autor);
        this.formato = formato;
        this.resolucao = resolucao;
    }
    
    @Override
    public String descricao() {
        return "Video Digital: " + titulo + " - Autor: " + autor + " - Formato: " + formato + " - Resolução: " + resolucao + "p";
    }
    
    @Override
    public void baixar() {
        System.out.println("Baixando o vídeo digital: " + titulo);
    }
    
    @Override
    public void imprimir() {
        System.out.println("Visualizando o vídeo digital: " + titulo);
    }
}
