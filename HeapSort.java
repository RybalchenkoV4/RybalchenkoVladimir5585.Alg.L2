public class HeapSort {

    public static void sort(int[] array){
        for (int i = array.length/2 - 1; i >= 0; i--) {
            heapify(array, array.length, i);
        }

        for (int i = array.length - 1; i >= 0 ; i--) {
            int buf = array[0];
            array[0] = array[i];
            array[i] = buf;

            heapify(array, i, 0);
        }
    }

    private static void heapify(int[] array, int size, int root){
        int biggest = root;

        int left = 2 * root + 1;
        int right = 2 * root + 2;

        if(left  < size && array[left] > array[biggest]){
            biggest = left;
        }
        if(right < size && array[right] > array[biggest]){
            biggest = right;
        }
        if(biggest != root){
            int buf = array[root];
            array[root] = array[biggest];
            array[biggest] = buf;

            heapify(array, size, biggest);
        }
    }

}
