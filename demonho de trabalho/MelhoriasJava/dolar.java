//  Hash com Base na Quantidade de Letras Únicas
//  Aqui o hash é calculado com base na quantidade de caracteres únicos na chave, multiplicando esse valor pelo 
//  comprimento da chave para dar peso à quantidade de letras distintas.

//     @Override
//     protected int hashFunction(String key) {
//         HashSet<Character> uniqueChars = new HashSet<>();
//         System.out.println("Calculando o hash para a chave (número de letras únicas): " + key);

//         for (char ch : key.toLowerCase().toCharArray()) {
//             uniqueChars.add(ch);
//         }

//         int uniqueCount = uniqueChars.size();
//         System.out.println("Quantidade de caracteres únicos: " + uniqueCount);

//         int hashValue = uniqueCount * key.length();
//         int finalIndex = hashValue % size;
//         System.out.println("Índice final (uniqueCount * length % size): " + finalIndex);

//         return finalIndex;
//     }
