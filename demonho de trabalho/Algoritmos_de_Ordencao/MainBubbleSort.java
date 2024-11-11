import java.text.DecimalFormat;

public class MainBubbleSort {
    public static void main(String[] args) {

        long tempoInicio = System.nanoTime();

        LerCSV leitor = new LerCSV("csv\\aleatorio_10000.csv");
        
        int[] numeros = leitor.lerNumeros();

        BubbleSort bubbleSort = new BubbleSort(numeros);
        
        bubbleSort.ordenar();

        bubbleSort.exibirVetor("Valores Ordenado:");

        long tempoFim = System.nanoTime();

        long tempoTotalNano = tempoFim - tempoInicio;

        DecimalFormat df_nanoSegundos = new DecimalFormat("#,###");

        System.out.println("Tempo de execução em nanosegundos: " + df_nanoSegundos.format(tempoTotalNano));
    }
}
