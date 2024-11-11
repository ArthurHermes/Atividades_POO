// public class TrablhadoComForAsHa {
//      // Método que implementa o algoritmo de ordenação por inserção.
//      public static int[] insertionSort(int[] arr) {
//         // Laço externo que percorre o array a partir do segundo elemento.
//         for (int i = 1; i < arr.length; i++) {
//             // Laço interno que compara o elemento atual (arr[i]) com os anteriores para posicioná-lo na posição correta.
//             for (int j = i; j > 0 && arr[j - 1] > arr[j]; j--) {
//                 // Se o elemento anterior é maior que o atual, eles trocam de lugar para "empurrar" o maior para a direita.
//                 int tmp = arr[j]; // Armazena temporariamente o valor de arr[j].
//                 arr[j] = arr[j - 1]; // Move arr[j - 1] para a posição j.
//                 arr[j - 1] = tmp; // Coloca o valor original de arr[j] na posição j - 1.
//             }
//         }

//         return arr; // Retorna o array já ordenado.
//     }
// }


// public class InsertionSort {

//     // 1. Exemplo de Insertion Sort para ordenar inteiros em ordem crescente
//     public static int[] insertionSort(int[] arr) {
//         for (int i = 1; i < arr.length; i++) {
//             int current = arr[i];
//             int j = i - 1;

//             while (j >= 0 && arr[j] > current) {
//                 arr[j + 1] = arr[j];
//                 j--;
//             }
//             arr[j + 1] = current;
//         }
//         return arr;
//     }

//     // 2. Exemplo de Insertion Sort ordenando em ordem decrescente
//     public static int[] insertionSortDesc(int[] arr) {
//         for (int i = 1; i < arr.length; i++) {
//             int current = arr[i];
//             int j = i - 1;

//             // Alteração para ordenar em ordem decrescente
//             while (j >= 0 && arr[j] < current) {
//                 arr[j + 1] = arr[j];
//                 j--;
//             }
//             arr[j + 1] = current;
//         }
//         return arr;
//     }

//     // 3. Exemplo de ordenação usando uma flag para detectar quando o array já está ordenado
//     public static int[] insertionSortWithFlag(int[] arr) {
//         for (int i = 1; i < arr.length; i++) {
//             int current = arr[i];
//             int j = i - 1;
//             boolean trocou = false; // Flag para verificar se houve troca

//             while (j >= 0 && arr[j] > current) {
//                 arr[j + 1] = arr[j];
//                 j--;
//                 trocou = true;
//             }
//             arr[j + 1] = current;

//             if (!trocou) {
//                 break; // O array já está ordenado, saímos mais cedo
//             }
//         }
//         return arr;
//     }

//     // 4. Exemplo de Insertion Sort com String em ordem alfabética
//     public static String[] insertionSortString(String[] arr) {
//         for (int i = 1; i < arr.length; i++) {
//             String current = arr[i];
//             int j = i - 1;

//             // Usando compareTo() para ordenar em ordem alfabética
//             while (j >= 0 && arr[j].compareTo(current) > 0) {
//                 arr[j + 1] = arr[j];
//                 j--;
//             }
//             arr[j + 1] = current;
//         }
//         return arr;
//     }

//     // 5. Exemplo de Insertion Sort com Comparator para ordem personalizada
//     public static String[] insertionSortWithComparator(String[] arr, java.util.Comparator<String> comparator) {
//         for (int i = 1; i < arr.length; i++) {
//             String current = arr[i];
//             int j = i - 1;

//             // Usando um Comparator para comparação personalizada
//             while (j >= 0 && comparator.compare(arr[j], current) > 0) {
//                 arr[j + 1] = arr[j];
//                 j--;
//             }
//             arr[j + 1] = current;
//         }
//         return arr;
//     }

//     // 6. Exemplo de ordenação de objetos (classe Pessoa) com Insertion Sort
//     public static class Pessoa {
//         String nome;
//         int idade;

//         Pessoa(String nome, int idade) {
//             this.nome = nome;
//             this.idade = idade;
//         }

//         @Override
//         public String toString() {
//             return nome + " (" + idade + " anos)";
//         }
//     }

//     public static Pessoa[] insertionSortPessoa(Pessoa[] arr) {
//         for (int i = 1; i < arr.length; i++) {
//             Pessoa current = arr[i];
//             int j = i - 1;

//             // Ordenando pela idade
//             while (j >= 0 && arr[j].idade > current.idade) {
//                 arr[j + 1] = arr[j];
//                 j--;
//             }
//             arr[j + 1] = current;
//         }
//         return arr;
//     }

//     // 7. Exemplo de Insertion Sort para ordenar números decimais (float/double)
//     public static double[] insertionSortDouble(double[] arr) {
//         for (int i = 1; i < arr.length; i++) {
//             double current = arr[i];
//             int j = i - 1;

//             // Comparando e ordenando números decimais
//             while (j >= 0 && arr[j] > current) {
//                 arr[j + 1] = arr[j];
//                 j--;
//             }
//             arr[j + 1] = current;
//         }
//         return arr;
//     }

//     // 8. Exemplo de uma versão recursiva do Insertion Sort
//     public static void insertionSortRecursive(int[] arr, int n) {
//         if (n <= 1) return; // Caso base: array de tamanho 1 já está ordenado

//         // Ordenar o subarray de tamanho n-1
//         insertionSortRecursive(arr, n - 1);

//         int current = arr[n - 1];
//         int j = n - 2;

//         // Inserindo o último elemento na posição correta
//         while (j >= 0 && arr[j] > current) {
//             arr[j + 1] = arr[j];
//             j--;
//         }
//         arr[j + 1] = current;
//     }

//     // 9. Exemplo de Shell Sort com Insertion Sort (para otimização de performance)
//     public static int[] shellSort(int[] arr) {
//         int n = arr.length;
//         for (int gap = n / 2; gap > 0; gap /= 2) {
//             for (int i = gap; i < n; i++) {
//                 int current = arr[i];
//                 int j = i;

//                 // Usando o Insertion Sort modificado para usar o gap
//                 while (j >= gap && arr[j - gap] > current) {
//                     arr[j] = arr[j - gap];
//                     j -= gap;
//                 }
//                 arr[j] = current;
//             }
//         }
//         return arr;
//     }

//     // 10. Exemplo de Exibição de Array com uma mensagem
//     public static void exibirVetor(String mensagem, int[] arr) {
//         System.out.println(mensagem);
//         for (int num : arr) {
//             System.out.print(num + " ");
//         }
//         System.out.println();
//     }

//     public static void exibirVetor(String mensagem, String[] arr) {
//         System.out.println(mensagem);
//         for (String str : arr) {
//             System.out.println(str);
//         }
//     }

//     public static void exibirVetor(String mensagem, Pessoa[] arr) {
//         System.out.println(mensagem);
//         for (Pessoa p : arr) {
//             System.out.println(p);
//         }
//     }

//     public static void main(String[] args) {
//         // Testando os diferentes métodos de Insertion Sort

//         // 1. Teste para ordenação de inteiros
//         int[] arr1 = {5, 2, 9, 1};
//         exibirVetor("Array original (crescente):", arr1);
//         insertionSort(arr1);
//         exibirVetor("Array ordenado (crescente):", arr1);

//         // 2. Teste para ordenação em ordem decrescente
//         int[] arr2 = {5, 2, 9, 1};
//         exibirVetor("Array original (decrescente):", arr2);
//         insertionSortDesc(arr2);
//         exibirVetor("Array ordenado (decrescente):", arr2);

//         // 3. Teste para ordenação com flag
//         int[] arr3 = {5, 2, 9, 1};
//         exibirVetor("Array original (flag):", arr3);
//         insertionSortWithFlag(arr3);
//         exibirVetor("Array ordenado (flag):", arr3);

//         // 4. Teste para ordenar Strings
//         String[] arr4 = {"banana", "maçã", "laranja", "abacaxi"};
//         exibirVetor("Array de Strings original:", arr4);
//         insertionSortString(arr4);
//         exibirVetor("Array de Strings ordenado:", arr4);

//         // 5. Teste para ordenar Strings com Comparator
//         String[] arr5 = {"banana", "maçã", "laranja", "abacaxi"};
//         exibirVetor("Array de Strings original (comparator):", arr5);
//         insertionSortWithComparator(arr5, (s1, s2) -> Integer.compare(s1.length(), s2.length()));
//         exibirVetor("Array de Strings ordenado por tamanho:", arr5);

//         // 6. Teste para ordenar objetos (Pessoa)
//         Pessoa[] pessoas = {
//             new Pessoa("Carlos", 25),
//             new Pessoa("Ana", 20),
//             new Pessoa("João", 30),
//             new Pessoa("Maria", 22)
//         };
//         exibirVetor("Array de pessoas original:", pessoas);
//         insertionSortPessoa(pessoas);
//         exibirVetor("Array de pessoas ordenado por idade:", pessoas);

//         // 7. Teste para ordenar números decimais
//         double[] arr6 = {5.5, 2.3, 9.8, 1.1};
//         exibirVetor("Array de números decimais original:", arr6);
//         insertionSortDouble(arr6);
//         exibirVetor("Array de números decimais ordenado:", arr6);

//         // 8. Teste para ordenação recursiva
//         int[] arr7 = {5, 2, 9, 1};
//         exibirVetor("Array original (recursivo):", arr7);
//         insertionSortRecursive(arr7, arr7.length);
//         exibirVetor("Array ordenado (recursivo):", arr7);

//         // 9. Teste para Shell Sort
//         int[] arr8 = {5, 2, 9, 1, 5, 6};
//         exibirVetor("Array original (Shell Sort):", arr8);
//         shellSort(arr8);
//         exibirVetor("Array ordenado (Shell Sort):", arr8);
//     }
// }

