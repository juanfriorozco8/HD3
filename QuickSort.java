import java.util.Random;

public class QuickSort {

    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high); //posicion del pivote
            //ordena las sublistas que esten antes y despues del elemento pivote
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];  //usa el ultimo elemento como pivote
        int i = (low - 1); 

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                
                //cambiar array i con j si el elemento actual es menor que el pivote
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1; 
    }

    public static void main(String[] args) {
        Random rand = new Random();
        int[] arr = new int[10000]; 
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(10000); 
        }

        long startTime = System.nanoTime(); 
        quickSort(arr, 0, arr.length - 1);
        long endTime = System.nanoTime(); 

        long duration = endTime - startTime; 

        System.out.println("Tiempo de ejecución de Quick Sort: " + duration + " nanosegundos");
    }
    
}

