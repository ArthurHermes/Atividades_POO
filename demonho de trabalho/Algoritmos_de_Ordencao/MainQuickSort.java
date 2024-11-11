import java.text.DecimalFormat;

public class MainQuickSort {
    public static void main(String[] args) {

        long tempoInicio = System.nanoTime();

        LerCSV leitor = new LerCSV("csv\\decrescente_10000.csv");
        
        int[] numeros = leitor.lerNumeros();

        QuickSort ordenador = new QuickSort(numeros);
        
        ordenador.ordenar();

        ordenador.exibirVetor("Valores ordenado:");

        long tempoFim = System.nanoTime();

        long tempoTotal = tempoFim - tempoInicio;

        DecimalFormat df_miliSegundos = new DecimalFormat("#,###");

        System.out.println("Tempo de execução em milisegundos: " + df_miliSegundos.format(tempoTotal));

    }
}
