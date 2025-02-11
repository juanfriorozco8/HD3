import java.util.Arrays;
import java.util.Random;
public class InsertionSort {
    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        Random rand = new Random();
        int[] arr = new int[1500]; 
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(1500); 
        }

        long startTime = System.nanoTime(); 
        insertionSort(arr);
        long endTime = System.nanoTime(); 

        long duration = endTime - startTime; 

        System.out.println("Tiempo de ejecución de Insertion Sort: " + duration + " nanosegundos");
    }
    
}
