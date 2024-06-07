class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int sizeofMergedArrays = nums1.length + nums2.length;
        int pos1ofMedian = 0, pos2ofMedian = 0, posofMedian = 0, i = 0, j = 0, k;
        boolean even = false;

        if (sizeofMergedArrays % 2 == 0) {
            pos1ofMedian = (sizeofMergedArrays / 2);
            pos2ofMedian = (sizeofMergedArrays / 2) - 1;
            even = true;
        } else {
            posofMedian = sizeofMergedArrays / 2-1;
        }

        for (k = 0; k < sizeofMergedArrays-1; k++) {
            if (nums1[i] < nums2[j]) {
                System.out.print(nums1[i]+"\t");
                i++;
            } else {
                System.out.print(nums2[j]+"\t");
                j++;
            }
        }
        return 0.00;
    }
}