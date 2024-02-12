import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] array = new int[]{2,8,7,9,4,3,0,9,2,4,3,1,7,6,2,9,5,3,9,2,5,0};

        QuickSort quickSort = new QuickSort();

        //int[] result = quickSort.quickSort(array);

        QuickSort002 quickSort002 = new QuickSort002();

        quickSort002.quickSort(array,0, array.length -1);

        System.out.println(Arrays.toString(array));
    }

}