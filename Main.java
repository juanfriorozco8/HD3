import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] arr = new int[1500];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(15000);
        }

        long startTime = System.nanoTime();
        radixSort(arr);
        long endTime = System.nanoTime();

        long duration = endTime - startTime;

        System.out.println("Tiempo de ejecución de Radix Sort: " + duration + " nanosegundos");
    }
    
    
}
