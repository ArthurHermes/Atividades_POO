public class BubbleSort {
    private final int[] vet; // Declara um array de inteiros chamado "vet", que armazenará o conjunto de dados a ser ordenado.

    // Construtor que inicializa o array "vet" com o array fornecido como argumento.
    public BubbleSort(int[] vet) {
        this.vet = vet;
    }

    // Método para exibir o conteúdo do array "vet" com uma mensagem customizada.
    public void exibirVetor(String mensagem) {
        System.out.println(mensagem); // Exibe a mensagem fornecida.
        
        // Percorre o array "vet" e imprime cada elemento em uma nova linha.
        for (int i = 0; i < vet.length; i++) {
            System.out.print("\n" + vet[i]);
        }
        
        System.out.println(); // Pula uma linha após imprimir todo o array.
    }

    // Método que implementa o algoritmo de ordenação *Bubble Sort*.
    public void ordenar() {
        int aux; // Variável auxiliar para armazenar temporariamente valores durante a troca.
        int comparacoes = 0;
        int trocar = 0;
        // Laço externo para controlar o número de passagens.
        for (int i = 0; i < vet.length - 1; i++) {

            
            // Laço interno para comparar e trocar elementos adjacentes, diminuindo o limite a cada passagem.
            for (int j = 0; j < vet.length - 1 - i; j++) {
                
                // Se o elemento atual é maior que o próximo, os valores são trocados.
                comparacoes++;
                if (vet[j] > vet[j + 1]) {
                    aux = vet[j];           // Armazena o valor de vet[j] temporariamente em "aux".
                    vet[j] = vet[j + 1];    // Move o valor de vet[j + 1] para a posição j.
                    vet[j + 1] = aux;       // Coloca o valor original de vet[j] na posição j + 1.
                    trocar++;   
                }
            }

        }
        System.out.println("Comparacoes: " + comparacoes);
        System.out.println("Trocas: " + trocar);
    }
}
