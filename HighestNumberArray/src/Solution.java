public class Solution {


    int[] nums = {10, 4, 3, 7, 8, 9, 1,20};
    int largest= 0 , smallest = 100;


    public void findLargest(){
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > largest) {
                largest = nums[i];
            }

        }
    }

    public void findsmallest(){
        for(int i = 0;i < nums.length;i++){
            if(nums[i] < smallest){
                smallest = nums[i];
            }

        }
    }

}
