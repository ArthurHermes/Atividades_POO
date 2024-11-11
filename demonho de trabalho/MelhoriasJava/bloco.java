// Esta versão multiplica o hashCode() por uma constante para obter 
// maior variação de bits antes de aplicar a máscara e o operador %.



//     @Override
//     protected int hashFunction(String key) {
//         int hashValue = (key.hashCode() * 31) & 0x7FFFFFFF; // Multiplica por 31 e aplica a máscara
//         int finalIndex = hashValue % size;
//         System.out.println("Índice final ((key.hashCode() * 31) & 0x7FFFFFFF % size): " + finalIndex);
//         return finalIndex;
//     }

