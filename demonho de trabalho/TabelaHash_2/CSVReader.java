import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CSVReader {
    public List<String> readCSV(String filePath) {
        List<String> names = new ArrayList<>();
        String line;

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            while ((line = br.readLine()) != null) {
                names.add(line.trim()); // Adiciona o nome lido à lista
            }
        } catch (IOException e) {
            System.err.println("Erro ao ler o arquivo: " + e.getMessage());
        }

        if (names.isEmpty()) {
            System.err.println("Nenhum nome foi lido do arquivo.");
        }

        return names;
    }
}
