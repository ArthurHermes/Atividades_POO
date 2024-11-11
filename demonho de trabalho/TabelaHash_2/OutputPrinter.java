public class OutputPrinter {
    public void printInsertionTimes(long insertionTime1, long insertionTime2) {
        System.out.println("Tempo total de inserção na Tabela 1 (Função Hash 1): " + insertionTime1 + " ns");
        System.out.println("Tempo total de inserção na Tabela 2 (Função Hash 2): " + insertionTime2 + " ns");
    }

    public void printEfficiency(HashTable table1, HashTable table2, long time1, long time2) {
        System.out.println("\nTabela 1 (Função Hash 1):");
        System.out.println("Número de colisões: " + table1.getCollisions());
        System.out.println("Tempo total de busca: " + time1 + " ns");

        System.out.println("\nTabela 2 (Função Hash 2):");
        System.out.println("Número de colisões: " + table2.getCollisions());
        System.out.println("Tempo total de busca: " + time2 + " ns");
    }

    public void printKeyDistribution(HashTable table) {
        int[] distribution = new int[table.size];
        for (String name : table.getTable()) {
            if (name != null) {
                int index = table.hashFunction(name);
                distribution[index]++;
            }
        }

        System.out.println("\nDistribuição de chaves:");
        for (int i = 0; i < distribution.length; i++) {
            System.out.println("Índice " + i + ": " + distribution[i] + " chaves");
        }
    }
}
