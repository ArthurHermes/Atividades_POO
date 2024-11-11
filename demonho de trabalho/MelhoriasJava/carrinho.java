// Hash com Base no Comprimento da Palavra e Soma das Posições das Consoantes


//     @Override
//     protected int hashFunction(String key) {
//         int consonantPositionSum = 0;
//         System.out.println("Calculando o hash para a chave (soma das posições das consoantes): " + key);

//         for (int i = 0; i < key.length(); i++) {
//             char ch = key.toLowerCase().charAt(i);
//             if (!(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')) {
//                 consonantPositionSum += (i + 1); // Posições iniciam em 1
//                 System.out.println("Consoante na posição " + (i + 1) + ": " + ch);
//             }
//         }

//         int hashValue = consonantPositionSum * key.length();
//         int finalIndex = hashValue % size;
//         System.out.println("Índice final (consonantPositionSum * length % size): " + finalIndex);

//         return finalIndex;
//     }
