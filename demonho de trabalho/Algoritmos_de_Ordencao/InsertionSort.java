public class InsertionSort {
    
    // Método que implementa o algoritmo de ordenação por inserção.
    public static int[] insertionSort(int[] arr) {
        int i = 1; // Começamos da segunda posição, pois o primeiro elemento já é considerado "ordenado".
        
        // Laço externo que percorre o array a partir do segundo elemento.
        while (i < arr.length) {
            int j = i;

            // Laço interno que compara o elemento atual (arr[j]) com os anteriores para posicioná-lo na posição correta.
            while ((j > 0) && (arr[j - 1] > arr[j])) {
                // Se o elemento anterior é maior que o atual, eles trocam de lugar para "empurrar" o maior para a direita.
                int tmp = arr[j]; // Armazena temporariamente o valor de arr[j].
                arr[j] = arr[j - 1]; // Move arr[j - 1] para a posição j.
                arr[j - 1] = tmp; // Coloca o valor original de arr[j] na posição j - 1.
                
                j--; // Continua comparando o elemento atual com o próximo anterior.
            }

            i++; // Passa para o próximo elemento para continuar a ordenação.
        }

        return arr; // Retorna o array já ordenado.
    }

    // Método auxiliar para exibir o conteúdo do array com uma mensagem customizada.
    public static void exibirVetor(String mensagem, int[] arr) {
        System.out.println(mensagem); // Imprime a mensagem fornecida.
        
        // Percorre o array e imprime cada elemento em uma linha.
        for (int num : arr) {
            System.out.println(num);
        }
    }
}
