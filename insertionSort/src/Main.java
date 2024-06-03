public class Main {
    public static void main(String[] args) {

        int[] arr = {23,26,27,28,29,29,29,30,31,37,48,50,0};

        for(int i : insertionSort(arr, 29)){
            System.out.print(i+"\t");
        }
    }

    public static int[] insertionSort(int[] arr, int num) {
        /*
        * ----> First, loop to find the position to insert the number.
        * ----> technique => binary search the position to insert the number.
        * */
        int len = arr.length-2, start = 0, mid = 0, insertionIndex;

        //start gives us the position where to insert the number.

        /* ++>  Time Complexity ==>O(log(n))<==*/
        while(start <= len) {
            mid = (start + len)/2;
            if(num == arr[mid]){
                break;
            } else if(num > arr[mid]){
                start = mid + 1;
            }else if (num < arr[mid]){
                len = mid -1;
            }
        }

        /*if(arr[mid] == num)
            start = mid;
*/
        System.out.println("start: " + start);
        System.out.println("mid: " + mid);

        //loop to create an empty slot for insertion of the number.
        for(int i = arr.length-1; i >= start; i--){
            arr[i] = arr[i-1];
        }

        arr[start] = num;

        return arr;
    }
}