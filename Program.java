import java.util.Arrays;

public class Program {
    public static void main(String[] args) {

        int[] array = ArrayUtils.prepareArray();
        ArrayUtils.printArray(array);
        HeapSort.sort(array);
        ArrayUtils.printArray(array);

    }
}
