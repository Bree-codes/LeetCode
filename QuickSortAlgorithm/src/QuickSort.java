import jdk.dynalink.linker.LinkerServices;

import java.util.ArrayList;
import java.util.List;

public class QuickSort {

    /*This method accepts a one dimensional array and sorts the data in ascending order*/

    public int[] quickSort(int[] array)
    {
        int start = 0;
        int end = array.length-1;
        List<int[]> list = partition(array, start, end);
        if(start < end)
        {
            partition(array, start, list.getFirst()[0]-1);
            partition(array, list.getFirst()[0]+1, end);
        }

        return array;
    }


    public List<int[]> partition(int[] array, int start, int end)
    {
        int temp;

        //pivot for centering the array
        int pivot = start;

        while(start < end) {
            while (start < array.length && end > 0) {
                while (array[start] < pivot)
                    start++;

                while (array[end] >= pivot)
                    end--;

                //perform the swapping.
                temp = array[start];
                array[start] = array[end];
                array[end] = temp;
            }

        }
        //place the pivot at it right full position.
        temp = array[pivot];
        array[pivot] = array[start];
        array[start] = temp;

        List<int[]> list = new ArrayList<>();

        list.add(new int[]{start});
        list.add(array);

        return list;
    }
}
