import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String filePath = "Estrutura_de_Dados\\TabelaHash_2\\female_names.txt"; // Caminho para o arquivo de nomes
        HashTable table1 = new HashTableFunction1(5000); // Instância da tabela hash com a primeira função hash
        HashTable table2 = new HashTableFunction2(5000); // Instância da tabela hash com a segunda função hash
        List<String> nomes = new ArrayList<>(); // Lista para armazenar os nomes lidos do arquivo

        // Ler o arquivo e armazenar cada linha (nome) na lista "nomes"
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                nomes.add(line.trim()); // Adiciona cada linha, removendo espaços em branco nas extremidades
            }
        } catch (IOException e) {
            e.printStackTrace(); // Exibe a pilha de erro se houver problema ao ler o arquivo
        }

        // Inserir os nomes nas duas tabelas hash, medindo o tempo de inserção
        long startTime, endTime;

        // Inserção na tabela 1 usando a primeira função hash
        startTime = System.nanoTime(); // Marca o início do tempo
        for (String name : nomes) {
            table1.insert(name); // Insere cada nome na tabela 1
        }
        endTime = System.nanoTime(); // Marca o fim do tempo
        long timeTable1Insert = (endTime - startTime) / 1_000_000; // Converte para milissegundos

        // Inserção na tabela 2 usando a segunda função hash
        startTime = System.nanoTime(); // Marca o início do tempo
        for (String name : nomes) {
            table2.insert(name); // Insere cada nome na tabela 2
        }
        endTime = System.nanoTime(); // Marca o fim do tempo
        long timeTable2Insert = (endTime - startTime) / 1_000_000; // Converte para milissegundos

        // Exibe o tempo total de inserção para cada tabela
        System.out.println("Tempo total de inserção na Tabela 1 (Função Hash 1): " + timeTable1Insert + " ms");
        System.out.println("Tempo total de inserção na Tabela 2 (Função Hash 2): " + timeTable2Insert + " ms");

        // Testar eficiência das buscas nas tabelas
        testEfficiency(table1, table2);
    }

    // Método para testar a eficiência de busca e colisão das tabelas
    private static void testEfficiency(HashTable table1, HashTable table2) {
        long startTime, endTime;

        // Tempo de busca na tabela 1
        startTime = System.nanoTime();
        for (String name : table1.getTable()) {
            if (name != null) table1.search(name); // Busca por cada nome não-nulo na tabela
        }
        endTime = System.nanoTime();
        long timeTable1Search = (endTime - startTime) / 1_000_000; // Converte para milissegundos

        // Tempo de busca na tabela 2
        startTime = System.nanoTime();
        for (String name : table2.getTable()) {
            if (name != null) table2.search(name); // Busca por cada nome não-nulo na tabela
        }
        endTime = System.nanoTime();
        long timeTable2Search = (endTime - startTime) / 1_000_000; // Converte para milissegundos

        // Exibe o número de colisões e o tempo de busca para cada tabela
        System.out.println("\nTabela 1 (Função Hash 1):");
        System.out.println("Número de colisões: " + table1.getCollisions());
        System.out.println("Tempo total de busca: " + timeTable1Search + " ms");

        System.out.println("\nTabela 2 (Função Hash 2):");
        System.out.println("Número de colisões: " + table2.getCollisions());
        System.out.println("Tempo total de busca: " + timeTable2Search + " ms");

        // Exibe a distribuição das colisões em cada índice da tabela
        printCollisionDistribution(table1);
        printCollisionDistribution(table2);
    }

    // Método para exibir a distribuição de colisões na tabela
    private static void printCollisionDistribution(HashTable table) {
        int[] distribution = new int[table.size]; // Array para contar colisões em cada índice

        // Conta o número de colisões para cada índice da tabela
        for (String name : table.getTable()) {
            if (name != null) {
                int index = table.hashFunction(name); // Obtém o índice do nome na tabela
                distribution[index]++; // Incrementa o contador para esse índice
            }
        }

        // Exibe apenas os índices com colisões
        System.out.println("\nDistribuição de colisões para a Tabela:");
        for (int i = 0; i < distribution.length; i++) {
            if (distribution[i] > 1) { // Se o índice tem mais de uma entrada, houve colisão
                System.out.println("Índice " + i + ": " + distribution[i] + " colisões");
            }
        }
    }
}
