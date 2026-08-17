package sorting.selectionsort;

public class SelectionSort {

    public void sort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int menorIdx = i;

            for (int j = i+1; j < arr.length; j++) {
                if (arr[j] < arr[menorIdx]){
                    menorIdx = j;
                }
            }

             int aux = arr[i];
             arr[i] = arr[menorIdx];
             arr[menorIdx] = aux;
        }
    }
}
