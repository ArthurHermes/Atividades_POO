class HashTableFunction2 extends HashTable {
    // Construtor que recebe o tamanho da tabela e chama o construtor da classe HashTable
    public HashTableFunction2(int size) {
        super(size); // Chama o construtor da classe base (HashTable) para inicializar a tabela com o tamanho dado
    }

    // Implementação da função hash para esta tabela específica
    @Override
    protected int hashFunction(String key) {
        return (key.hashCode() & 0x7FFFFFFF) % size; // Calcula o índice usando o hashCode da chave
        // Aplica uma máscara para garantir que o valor seja positivo (0x7FFFFFFF)
        // O operador % assegura que o índice esteja dentro dos limites da tabela
    }
}
