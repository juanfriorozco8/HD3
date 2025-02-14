import java.util.Random;

public class InsertionSort {
    /*
     * Metodo para ordenar el arreglo con insertion sort
     */
    public static void insertionSort(int[] arr) {
        int n = arr.length; 
        for (int i = 1; i < n; i++) {
            int key = arr[i]; //elemento que se tendrá que insertar
            int j = i - 1; //posicion anterior a la que se comparará

        
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j]; //mueve el elemento a la derecha
                j = j - 1; //resta uno al indice
            }
            arr[j + 1] = key; //insertar el elemento en su posicion
        }
    }

    public static void main(String[] args) {
        Random rand = new Random();
        int[] arr = new int[10000]; 
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(10000); 
        }

        long startTime = System.nanoTime(); 
        insertionSort(arr);
        long endTime = System.nanoTime(); 

        long duration = endTime - startTime; 

        System.out.println("Tiempo de ejecución de Insertion Sort: " + duration + " nanosegundos");
    }
    
}
