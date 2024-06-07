public class Main {
    public static void main(String[] args){

        Solution solution = new Solution();

        int[] nums1 = {2,3,5,7,8,9};
        int[] nums2 = {0,1,4,6};

        double median = solution.findMedianSortedArrays(nums1,nums2);

        System.out.println(median);

    }
}