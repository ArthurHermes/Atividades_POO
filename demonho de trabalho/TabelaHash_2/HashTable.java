import java.util.Arrays;

abstract class HashTable {
    // Atributos protegidos da classe base HashTable
    protected String[] table; // Array para armazenar os elementos (nomes)
    protected int size; // Tamanho da tabela
    protected int count; // Contador de elementos inseridos na tabela
    protected int collisions; // Contador de colisões ocorridas na tabela

    // Construtor que inicializa a tabela com o tamanho especificado
    public HashTable(int size) {
        this.size = size;
        this.table = new String[size]; // Inicializa o array de strings com o tamanho fornecido
        this.collisions = 0; // Inicia o contador de colisões como zero
        this.count = 0; // Inicia o contador de elementos como zero
    }

    // Método abstrato da função hash que será implementado nas subclasses
    protected abstract int hashFunction(String key);

    // Método para inserir uma chave na tabela
    public void insert(String key) {
        // Verifica se 70% da tabela está preenchida, o que dispara o rehashing
        if (count >= size * 0.7) { // Rehash se mais de 70% da tabela está ocupada
            rehash();
        }
        
        int index = hashFunction(key); // Calcula o índice da chave com a função hash
        int originalIndex = index; // Salva o índice original para detectar ciclo completo

        // Verifica se o índice já está ocupado, indicando colisão
        if (table[index] != null) {
            collisions++; // Incrementa o contador de colisões
            index = (index + 1) % size; // Move para o próximo índice (endereçamento aberto)
            
            // Laço para resolver colisões, procurando o próximo índice vazio
            while (table[index] != null) {
                collisions++; // Incrementa o contador de colisões para cada tentativa
                index = (index + 1) % size; // Continua procurando no próximo índice
                
                // Se o índice retornar ao original, a tabela está cheia
                if (index == originalIndex) {
                    throw new RuntimeException("Table is full"); // Lança uma exceção se a tabela estiver cheia
                }
            }
        }

        table[index] = key; // Insere a chave no índice encontrado
        count++; // Incrementa o contador de elementos inseridos
    }

    // Método para buscar uma chave na tabela
    public boolean search(String key) {
        int index = hashFunction(key); // Calcula o índice da chave com a função hash
        int originalIndex = index; // Salva o índice original para detectar ciclo completo

        // Laço para buscar a chave na tabela
        while (table[index] != null) {
            // Se encontrar a chave, retorna verdadeiro
            if (table[index].equals(key)) {
                return true;
            }
            index = (index + 1) % size; // Move para o próximo índice (endereçamento aberto)
            
            // Se voltar ao índice original, a busca termina
            if (index == originalIndex) {
                break;
            }
        }
        return false; // Retorna falso se a chave não foi encontrada
    }

    // Método para redimensionar a tabela quando atingir 70% da capacidade
    protected void rehash() {
        String[] oldTable = table; // Armazena a tabela atual
        size *= 2; // Dobra o tamanho da tabela
        table = new String[size]; // Cria uma nova tabela com o dobro do tamanho
        count = 0; // Reseta o contador de elementos

        // Reinserir os elementos da tabela antiga na nova tabela
        for (String key : oldTable) {
            if (key != null) { // Ignora elementos nulos
                insert(key); // Reinsere cada chave na nova tabela
            }
        }
    }

    // Retorna o número total de colisões
    public int getCollisions() {
        return collisions;
    }

    // Retorna a tabela hash atual
    public String[] getTable() {
        return table;
    }
}
