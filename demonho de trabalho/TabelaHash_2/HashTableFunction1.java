class HashTableFunction1 extends HashTable {
    // Construtor que recebe o tamanho da tabela e chama o construtor da classe HashTable
    public HashTableFunction1(int size) {
        super(size); // Chama o construtor da classe base (HashTable) para inicializar a tabela com o tamanho dado
    }

    // Implementação da função hash para esta tabela específica
    @Override
    protected int hashFunction(String key) {
        return key.length() % size; // Calcula o índice com base no comprimento da chave (mod tamanho da tabela)
    }
}
