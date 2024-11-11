// public class BubbleSort {
//     private final int[] vet; // Declara um array de inteiros chamado "vet", que armazenará o conjunto de dados a ser ordenado.

//     // Construtor que inicializa o array "vet" com o array fornecido como argumento.
//     public BubbleSort(int[] vet) {
//         if (vet == null) {
//             throw new IllegalArgumentException("Array não pode ser null");
//         }
//         this.vet = vet;
//     }

//     // Método para exibir o conteúdo do array "vet" com uma mensagem customizada.
//     public void exibirVetor(String mensagem) {
//         System.out.println(mensagem); // Exibe a mensagem fornecida.
        
//         // Percorre o array "vet" e imprime cada elemento em uma nova linha.
//         for (int i = 0; i < vet.length; i++) {
//             System.out.print(vet[i] + (i < vet.length - 1 ? ", " : ""));
//         }
//         System.out.println(); // Pula uma linha após imprimir todo o array.
//     }

//     // 1. Método que implementa o algoritmo de ordenação *Bubble Sort* padrão (sem otimização).
//     public void ordenar() {
//         int aux; // Variável auxiliar para armazenar temporariamente valores durante a troca.
//         int comparacoes = 0;
//         int trocar = 0;
        
//         for (int i = 0; i < vet.length - 1; i++) {
//             for (int j = 0; j < vet.length - 1 - i; j++) {
//                 comparacoes++;
//                 if (vet[j] > vet[j + 1]) {
//                     aux = vet[j];
//                     vet[j] = vet[j + 1];
//                     vet[j + 1] = aux;
//                     trocar++;
//                 }
//             }
//         }
//         System.out.println("Comparacoes: " + comparacoes);
//         System.out.println("Trocas: " + trocar);
//     }
    
//     // 2. Bubble Sort com Early Termination (término antecipado)
//     public void ordenarComEarlyTermination() {
//         int aux;
//         int comparacoes = 0;
//         int trocar = 0;
        
//         for (int i = 0; i < vet.length - 1; i++) {
//             boolean trocaFeita = false;
            
//             for (int j = 0; j < vet.length - 1 - i; j++) {
//                 comparacoes++;
//                 if (vet[j] > vet[j + 1]) {
//                     aux = vet[j];
//                     vet[j] = vet[j + 1];
//                     vet[j + 1] = aux;
//                     trocar++;
//                     trocaFeita = true;
//                 }
//             }
            
//             // Se não houve troca, o array já está ordenado
//             if (!trocaFeita) {
//                 break;
//             }
//         }
//         System.out.println("Comparacoes: " + comparacoes);
//         System.out.println("Trocas: " + trocar);
//     }

//     // 3. Método para ordenar em ordem decrescente
//     public void ordenarDecrescente() {
//         int aux;
//         int comparacoes = 0;
//         int trocar = 0;
        
//         for (int i = 0; i < vet.length - 1; i++) {
//             for (int j = 0; j < vet.length - 1 - i; j++) {
//                 comparacoes++;
//                 if (vet[j] < vet[j + 1]) {  // Alterando para ordem decrescente
//                     aux = vet[j];
//                     vet[j] = vet[j + 1];
//                     vet[j + 1] = aux;
//                     trocar++;
//                 }
//             }
//         }
//         System.out.println("Comparacoes: " + comparacoes);
//         System.out.println("Trocas: " + trocar);
//     }

//     // 4. Método para ordenar recursivamente (Bubble Sort recursivo)
//     public void ordenarRecursivo(int n) {
//         if (n == 1) return;  // Caso base: se o array tem apenas 1 elemento, já está ordenado.
        
//         // Passagem Bubble Sort
//         for (int i = 0; i < n - 1; i++) {
//             if (vet[i] > vet[i + 1]) {
//                 int aux = vet[i];
//                 vet[i] = vet[i + 1];
//                 vet[i + 1] = aux;
//             }
//         }
        
//         // Chamada recursiva para ordenar os n-1 primeiros elementos
//         ordenarRecursivo(n - 1);
//     }
    
//     // 5. Verificação de entrada (null)
//     public void verificarEntrada() {
//         if (vet == null) {
//             throw new IllegalArgumentException("O array fornecido é nulo.");
//         }
//     }

//     // 6. Exibição da complexidade do algoritmo
//     public void exibirComplexidade() {
//         System.out.println("O Bubble Sort possui uma complexidade O(n^2) no pior caso.");
//     }
    
//     // 7. Método para exibir o vetor de forma personalizada
//     public void exibirVetorComFormatacao() {
//         System.out.print("Vetor: [");
//         for (int i = 0; i < vet.length; i++) {
//             System.out.print(vet[i] + (i < vet.length - 1 ? ", " : ""));
//         }
//         System.out.println("]");
//     }

//     // 8. Bubble Sort usando while em vez de for
//     public void ordenarComWhile() {
//         int aux;
//         int comparacoes = 0;
//         int trocar = 0;
//         int i = 0; // Controle para o laço externo
//         while (i < vet.length - 1) {
//             boolean trocaFeita = false; // Flag para verificar se houve troca
            
//             int j = 0; // Controle para o laço interno
//             while (j < vet.length - 1 - i) {
//                 comparacoes++;
//                 if (vet[j] > vet[j + 1]) {
//                     aux = vet[j];
//                     vet[j] = vet[j + 1];
//                     vet[j + 1] = aux;
//                     trocar++;
//                     trocaFeita = true;
//                 }
//                 j++;
//             }
            
//             if (!trocaFeita) break;
//             i++;
//         }
//         System.out.println("Comparacoes: " + comparacoes);
//         System.out.println("Trocas: " + trocar);
//     }