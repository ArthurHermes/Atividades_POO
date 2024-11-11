// public class QuickSort {
//     private final int[] vetor;

//     // Vetor estático com 7 números aleatórios
//     public QuickSort() {
//         this.vetor = new int[] { 34, 7, 23, 32, 5, 62, 15 };
//     }

//     public void ordenar() {
//         // Inicia a ordenação com a primeira chamada recursiva
//         quickSort(0, vetor.length - 1, true);
//     }

//     private void quickSort(int inicio, int fim, boolean primeiraRecursao) {
//         if (inicio < fim) {
//             int posicaoPivo = separarPosicionarPivo(inicio, fim, primeiraRecursao);
//             // Continua a recursão, mas nas chamadas subsequentes, primeiraRecursao será false
//             quickSort(inicio, posicaoPivo - 1, false);
//             quickSort(posicaoPivo + 1, fim, false);
//         }
//     }

//     private int separarPosicionarPivo(int inicio, int fim, boolean primeiraRecursao) {
//         int pivo = vetor[inicio];
//         int i = inicio + 1;
//         int f = fim;
//         int menores = 0;
//         int maiores = 0;

//         while (i <= f) {
//             if (vetor[i] <= pivo) {
//                 i++;
//             } else if (pivo < vetor[f]) {
//                 f--;
//             } else {
//                 int troca = vetor[i];
//                 vetor[i] = vetor[f];
//                 vetor[f] = troca;
//                 i++;
//                 f--;
//             }
//         }

//         // Coloca o pivô em sua posição correta
//         vetor[inicio] = vetor[f];
//         vetor[f] = pivo;

//         // Calcula menores e maiores se for a primeira chamada recursiva
//         if (primeiraRecursao) {
//             for (int j = inicio; j < fim + 1; j++) {
//                 if (vetor[j] < pivo) {
//                     menores++;
//                 } else if (vetor[j] > pivo) {
//                     maiores++;
//                 }
//             }
//             System.out.println("Pivô: " + pivo);
//             System.out.println("Quantidade de menores que o pivô: " + menores);
//             System.out.println("Quantidade de maiores que o pivô: " + maiores);
//         }

//         return f;
//     }

//     public void exibirVetor(String mensagem) {
//         System.out.println(mensagem);
//         for (int valor : vetor) {
//             System.out.println(valor);
//         }
//     }

//     public static void main(String[] args) {
//         QuickSort qs = new QuickSort();
//         qs.exibirVetor("Vetor original:");
//         qs.ordenar();
//         qs.exibirVetor("Vetor ordenado:");
//     }
// }
