package sorting.insertionsort;

public class Main {
    static void main() {
        InsertionSort insertionSort = new InsertionSort();


        int[] arr = {7,3,-9,1,6,7,123,37,23,1,2341};
        insertionSort.sort(arr);
        for (int num : arr){
            System.out.print(num + ", ");
        }
    }
}
