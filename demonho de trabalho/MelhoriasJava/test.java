// Hash com Base na Quantidade de Vogais
// Essa função calcula o hash somando o número de vogais presentes na chave, multiplicando pelo comprimento da 
// chave e, em seguida, aplicando o módulo com o tamanho da tabela.

//     @Override
//     protected int hashFunction(String key) {
//         int vowelCount = 0;
//         System.out.println("Calculando o hash para a chave (contando vogais): " + key);

//         for (char ch : key.toLowerCase().toCharArray()) {
//             if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
//                 vowelCount++;
//                 System.out.println("Vogal encontrada: " + ch);
//             }
//         }

//         int hashValue = vowelCount * key.length();
//         int finalIndex = hashValue % size;
//         System.out.println("Índice final (vowelCount * length % size): " + finalIndex);

//         return finalIndex;
//     }
// }
