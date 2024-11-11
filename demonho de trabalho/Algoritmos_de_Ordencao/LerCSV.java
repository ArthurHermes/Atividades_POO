import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LerCSV {
    private final String arquivoCSV;

    public LerCSV(String arquivoCSV) {
        this.arquivoCSV = arquivoCSV;
    }

    public int[] lerNumeros() {
        List<Integer> numeros = new ArrayList<>();
        String linha;

        try (BufferedReader br = new BufferedReader(new FileReader(arquivoCSV))) {
            while ((linha = br.readLine()) != null) {
                try {
                    int numero = Integer.parseInt(linha.trim());
                    numeros.add(numero);
                } catch (NumberFormatException e) {
                    System.out.println("Linha inválida: " + linha);
                }
            }
        } catch (IOException e) {
            System.out.println(e);
        }

        // Convertendo a lista para um array de inteiros
        return numeros.stream().mapToInt(i -> i).toArray();
    }
}
