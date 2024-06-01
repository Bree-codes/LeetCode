public class Main {
    public static void main(String[] args) {

    }

    public static int[] insertionSort(int[] arr, int num) {

        /*
        * ----> First, loop to find the position to insert the number.
        * ----> technique => binary search the position to insert the number.
        * */
        int len = arr.length, start = 0, mid, insertionIndex;

        while(true){
            mid = start + len;

            if((arr[mid] < num && arr[mid+1] > num) || arr[mid] == num){
                insertionIndex = mid+1;
                break;
            }

            if((arr[mid] < num && !(arr[mid+1] > num))){
                start = mid+1;
            }

            if(((arr[mid] > num) && !(arr[mid-1] > num)) || arr[mid] == num){
                insertionIndex = mid-1;
                break;
            }

        }

        return null;
    }
}