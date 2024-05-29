import java.util.HashMap;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        // Create a HashMap to store the numbers and their indices
        HashMap<Integer, Integer> map = new HashMap<>();

        // Iterate over the array
        for (int i = 0; i < nums.length; i++) {
            // Calculate the complement that we need to find in the map
            int complement = target - nums[i];

            // Check if the complement is already in the map
            if (map.containsKey(complement)) {
                // If it is, return the indices of the complement and the current number
                return new int[] { map.get(complement), i };
            }

            // If it's not, add the current number and its index to the map
            map.put(nums[i], i);
        }

        // If no solution is found, return null or throw an exception
        throw new IllegalArgumentException("No two sum solution");
    }

    public static void main(String[] args) {
        TwoSum solution = new TwoSum();

        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] result = solution.twoSum(nums, target);

        // Print the result
        System.out.println("Indices: " + result[0] + ", " + result[1]);
    }
}

