package sorting.quicksort;

public class QuickSort {

    public static void quickSort(int[] array, int inicio, int fim) {

        if (inicio < fim) {
            int posicaoPivo = partition(array, inicio, fim);

            quickSort(array, inicio, posicaoPivo - 1);
            quickSort(array, posicaoPivo + 1, fim);
        }
    }

    private static int partition(int[] array, int inicio, int fim) {

        int pivo = array[fim];
        int i = inicio - 1;

        for (int j = inicio; j < fim; j++) {

            if (array[j] <= pivo) {
                i++;

                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        int temp = array[i + 1];
        array[i + 1] = array[fim];
        array[fim] = temp;

        return i + 1;
    }

    public static void main(String[] args) {

        int[] array = {7, 2, 9, 4, 3, 8, 1};

        quickSort(array, 0, array.length - 1);

        for (int numero : array) {
            System.out.print(numero + " ");
        }
    }
}
