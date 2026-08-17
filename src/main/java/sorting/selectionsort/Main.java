package sorting.selectionsort;

import sorting.insertionsort.InsertionSort;

public class Main {
    static void main() {
        SelectionSort selectionSort = new SelectionSort();


        int[] arr = {7,3,-900,1,6,7,123,37,23,1,-2341};
        selectionSort.sort(arr);
        for (int i : arr){
            System.out.print(i + ", ");
        }
    }
}
