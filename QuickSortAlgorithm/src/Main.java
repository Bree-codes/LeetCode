import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] array = new int[]{1934,965,4956,687,235,9765,543,697,2456,295684,6975684,3496,485,5968,38586,485,697,245,
                486,595,876,4967,4968,50768,20450,49684,389504,5064,406846,45965,1023,59035,395385,4959305};

        QuickSort quickSort = new QuickSort();

        //int[] result = quickSort.quickSort(array);

        QuickSort002 quickSort002 = new QuickSort002();

        quickSort002.quickSort(array,0, array.length -1);

        System.out.println(Arrays.toString(array));
    }
}
