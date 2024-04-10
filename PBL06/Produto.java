package PBL06;

public class Produto {
    private String id;
    private String marca;
    private String cor; // Exemplo: Preto, Branco, Azul //
    private String modelo; // Exemplo: Oversized, Reta, Slim //

}



// Roupa e suas classes filhas //
class Roupa extends Produto{
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




//Tenis e suas classes filhas //

class Tenis extends Produto{
    private String tecido; // Exemplo: Couro, Camurça, Couro Sintetico //
}

class Esportivo extends Tenis{
    private String categoria; // Exemplo: Corrida, Academia ou algum esporte mais especifico //

}

class Casual extends Tenis{

}