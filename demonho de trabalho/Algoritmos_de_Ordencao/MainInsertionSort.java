import java.text.DecimalFormat;

public class MainInsertionSort {
    public static void main(String[] args) {
        long tempoInicio = System.nanoTime();


        LerCSV leitor = new LerCSV("csv\\aleatorio_100.csv");

        int[] numeros = leitor.lerNumeros();

        numeros = InsertionSort.insertionSort(numeros);

        InsertionSort.exibirVetor(" Valores Ordenado:", numeros);

        long tempoFim = System.nanoTime();

        long tempoTotal = tempoFim - tempoInicio;

        DecimalFormat df_miliSegundos = new DecimalFormat("#,###");

        System.out.println("Tempo de execução em milisegundos: " + df_miliSegundos.format(tempoTotal));
        
    }
}
