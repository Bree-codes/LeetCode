import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] array = new int[]{-90,-100,-3,-30,-500,-9,-4,-23};

        QuickSort quickSort = new QuickSort();

        //int[] result = quickSort.quickSort(array);

        QuickSort002 quickSort002 = new QuickSort002();

        quickSort002.quickSort(array,0, array.length -1);

        System.out.println(Arrays.toString(array));
    }

}