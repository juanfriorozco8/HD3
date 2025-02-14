import java.util.Random;

public class RadixSort {
    public static void radixSort(int[] arr) {
        int max = getMax(arr); //agarra el numero mas grande del array

        //itera y ordena el arreglo segun el digito
        for (int exp = 1; max / exp > 0; exp *= 10) {
            countingSort(arr, exp);
        }
    }

    //retorna el valor maximo del arreglo
    private static int getMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    //ordena usando counting sort en un digito especifico
    private static void countingSort(int[] arr, int exp) {
        int n = arr.length;
        int[] output = new int[n]; 
        int[] count = new int[10];

        for (int i = 0; i < n; i++) {
            count[(arr[i] / exp) % 10]++;
        }


        for (int i = 1; i < 10; i++) {
            count[i] += count[i - 1];
        }


        for (int i = n - 1; i >= 0; i--) {
            output[count[(arr[i] / exp) % 10] - 1] = arr[i];
            count[(arr[i] / exp) % 10]--;
        }

        //copia los elementos ya ordenados en el arreglo principal
        System.arraycopy(output, 0, arr, 0, n);
    }

    public static void main(String[] args) {
        Random rand = new Random();
        int[] arr = new int[10000]; 
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(10000); 
        }

        long startTime = System.nanoTime(); 
        radixSort(arr);
        long endTime = System.nanoTime();

        long duration = endTime - startTime; 

        System.out.println("Tiempo de ejecución de Radix Sort: " + duration + " nanosegundos");
    }
}