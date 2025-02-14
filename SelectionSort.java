import java.util.Random;

public class SelectionSort {
    public static void selectionSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < n; j++) {
                //si hay un elemento menor poner el nuevo indice dle minimo
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = arr[minIndex]; //cambiar el minimo con la posicion actual
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        Random rand = new Random();
        int[] arr = new int[10000]; 
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(10000); 
        }

        long startTime = System.nanoTime();
        selectionSort(arr);
        long endTime = System.nanoTime();

        long duration = endTime - startTime;

        System.out.println("Tiempo de ejecución de Selection Sort: " + duration + " nanosegundos");
    }
}