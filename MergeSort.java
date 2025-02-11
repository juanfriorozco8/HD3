import java.util.Random;

public class MergeSort {
    public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;

           
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);

           
            merge(arr, left, mid, right);
        }
    }

    private static void merge(int[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] leftArr = new int[n1];
        int[] rightArr = new int[n2];

        
        for (int i = 0; i < n1; i++) leftArr[i] = arr[left + i];
        for (int j = 0; j < n2; j++) rightArr[j] = arr[mid + 1 + j];

        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2) {
            if (leftArr[i] <= rightArr[j]) {
                arr[k] = leftArr[i];
                i++;
            } else {
                arr[k] = rightArr[j];
                j++;
            }
            k++;
        }

        
        while (i < n1) arr[k++] = leftArr[i++];

        
        while (j < n2) arr[k++] = rightArr[j++];
    }

    public static void main(String[] args) {
        Random rand = new Random();
        int[] arr = new int[1500]; 
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(15000); 
        }

        long startTime = System.nanoTime(); 
        mergeSort(arr, 0, arr.length - 1);
        long endTime = System.nanoTime(); 

        long duration = endTime - startTime; 

        System.out.println("Tiempo de ejecución de Merge Sort: " + duration + " nanosegundos");
    }
}


