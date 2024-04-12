package PBL06;


public class Roupa extends Produto{
    private String tamanho; // Exemplo: P, M, G, GG //
    private String tipoTecido; // Exemplo: Dri-fit, Algodão, Couro //
}

class Camiseta extends Roupa{
    private String tipoDaManga; // Exemplo: Curta, longa //

}
class Calca extends Roupa{
    private String tipoDaCalca; // Exemplo: Normal, Com rasgos //

}

class Jaqueta extends Roupa{
    private String estilo_fecho; // Exemplo: Ziper, Botão //
}