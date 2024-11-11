// Hash com Base na Quantidade de Caracteres Repetidos
// Essa função calcula o hash baseando-se na quantidade de caracteres que aparecem mais de uma vez na chave.


//     protected int hashFunction(String key) {
//         HashMap<Character, Integer> charCount = new HashMap<>();
//         System.out.println("Calculando o hash para a chave (quantidade de caracteres repetidos): " + key);

//         // Conta as ocorrências de cada caractere
//         for (char ch : key.toCharArray()) {
//             charCount.put(ch, charCount.getOrDefault(ch, 0) + 1);
//         }

//         // Conta quantos caracteres têm mais de uma ocorrência
//         int repeatedCount = 0;
//         for (int count : charCount.values()) {
//             if (count > 1) {
//                 repeatedCount++;
//             }
//         }

//         System.out.println("Quantidade de caracteres repetidos: " + repeatedCount);
//         int finalIndex = repeatedCount % size;
//         System.out.println("Índice final (repeatedCount % size): " + finalIndex);

//         return finalIndex;
//     }
// }
