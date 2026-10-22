package sorting.mergesort;

public class MergeSort {

    public static void mergeSort(int[] array, int inicio, int fim) {

        if (inicio < fim) {

            int meio = inicio + (fim - inicio) / 2;

            mergeSort(array, inicio, meio);
            mergeSort(array, meio + 1, fim);

            merge(array, inicio, meio, fim);
        }
    }

    public static void merge(int[] array, int inicio, int meio, int fim) {

        int[] temp = new int[fim - inicio + 1];

        int i = inicio;
        int j = meio + 1;
        int k = 0;

        while (i <= meio && j <= fim) {

            if (array[i] <= array[j]) {
                temp[k] = array[i];
                i++;
            } else {
                temp[k] = array[j];
                j++;
            }

            k++;
        }

        while (i <= meio) {
            temp[k] = array[i];
            i++;
            k++;
        }

        while (j <= fim) {
            temp[k] = array[j];
            j++;
            k++;
        }

        for (int x = 0; x < temp.length; x++) {
            array[inicio + x] = temp[x];
        }
    }

    public static void main(String[] args) {

        int[] array = {8, 3, 5, 1, 7, 2};

        mergeSort(array, 0, array.length - 1);

        for (int numero : array) {
            System.out.print(numero + " ");
        }
    }
}
