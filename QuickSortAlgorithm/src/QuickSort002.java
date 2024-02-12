public class QuickSort002 {

    public int[] quickSort(int[] array, int start, int end)
    {

        if(end<=start) return array;

        int pivot = partition(array, start, end);

        quickSort(array, start, pivot-1);
        quickSort(array, pivot+1, end);

        return array;
    }

    private int partition(int[] array, int start, int end) {
        int pointer1 = start -1;
        int pointer2;
        int temp;


        for(pointer2=start;pointer2 < array.length;pointer2++)
        {
            if(array[pointer2] < array[end]){
                pointer1++;
                temp = array[pointer1];
                array[pointer1] = array[pointer2];
                array[pointer2] = temp;
            }
        }
        pointer1++;
        temp = array[pointer1];
        array[pointer1] = array[end];
        array[end] = temp;

        return pointer1;
    }
}
