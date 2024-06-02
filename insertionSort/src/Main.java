public class Main {
    public static void main(String[] args) {

        int[] arr = {23,26,27,28,29,30,31,37,48,50};

        insertionSort(arr, 390);
    }

    public static int[] insertionSort(int[] arr, int num) {
        /*
        * ----> First, loop to find the position to insert the number.
        * ----> technique => binary search the position to insert the number.
        * */
        int len = arr.length-1, start = 0, mid = 0, insertionIndex;

        while(start <= len) {
            mid = (start + len)/2;

            if(num == arr[mid]){
                System.out.println("mid = " + mid);
                break;
            } else if(num > arr[mid]){
                start = mid + 1;
            }else if (num < arr[mid]){
                len = mid -1;
            }
        }

        return null;
    }
}