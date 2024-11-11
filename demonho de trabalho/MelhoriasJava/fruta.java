// Hash com Base na Quantidade de Letras e Dígitos
// Essa função hash conta quantas letras e quantos dígitos existem na chave. O índice final é calculado 
// multiplicando essas quantidades e aplicando o módulo pelo tamanho da tabela.
//     @Override
//     protected int hashFunction(String key) {
//         int letterCount = 0;
//         int digitCount = 0;
//         System.out.println("Calculando o hash para a chave (quantidade de letras e dígitos): " + key);

//         for (char ch : key.toCharArray()) {
//             if (Character.isLetter(ch)) {
//                 letterCount++;
//                 System.out.println("Letra encontrada: " + ch);
//             } else if (Character.isDigit(ch)) {
//                 digitCount++;
//                 System.out.println("Dígito encontrado: " + ch);
//             }
//         }

//         int hashValue = letterCount * digitCount;
//         int finalIndex = hashValue % size;
//         System.out.println("Índice final (letterCount * digitCount % size): " + finalIndex);

//         return finalIndex;
//     }

