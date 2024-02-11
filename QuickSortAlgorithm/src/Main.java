import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] array = new int[3];

        QuickSort quickSort = new QuickSort();

        try {


            int[] result = quickSort.quickSort(array);
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("");
        }

        System.out.println(Arrays.toString(array));
    }

}