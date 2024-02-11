import jdk.dynalink.linker.LinkerServices;

import java.util.List;

public class QuickSort {

    /*This method accepts a one dimensional array and sorts the data in ascending order*/

    public int[] quickSort(int[] array)
    {


        return null;
    }


    public List<int[]> partition(int[] array, int start, int end)
    {
        //pivot for centering the array
        int pivot = start;

        while(start < end) {
            while (start < array.length && end >= 0) {
                while (array[start] < pivot)
                    start++;

                while (array[end] > pivot)
                    end--;
            }
            //perform the swapping.
        }
        return null;
    }
}
