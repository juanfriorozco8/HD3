import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.Arrays;

class SortTests {
    
    private int[] generateRandomArray(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = (int) (Math.random() * 10000);
        }
        return arr;
    }

    private boolean isSorted(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }
    
    @Test
    void testInsertionSort() {
        int[] arr = generateRandomArray(100);
        InsertionSort.insertionSort(arr);
        assertTrue(isSorted(arr));
    }
    
    @Test
    void testQuickSort() {
        int[] arr = generateRandomArray(100);
        QuickSort.quickSort(arr, 0, arr.length - 1);
        assertTrue(isSorted(arr));
    }
    
    @Test
    void testRadixSort() {
        int[] arr = generateRandomArray(100);
        RadixSort.radixSort(arr);
        assertTrue(isSorted(arr));
    }
    
    @Test
    void testMergeSort() {
        int[] arr = generateRandomArray(100);
        MergeSort.mergeSort(arr, 0, arr.length - 1);
        assertTrue(isSorted(arr));
    }
    
    @Test
    void testSelectionSort() {
        int[] arr = generateRandomArray(100);
        SelectionSort.selectionSort(arr);
        assertTrue(isSorted(arr));
    }
}
