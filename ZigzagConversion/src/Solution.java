import java.util.HashMap;

public class Solution {
    public String convert(String s, int numRows) {

        if (numRows == 1) return s; // Special case for single row

        HashMap<Integer, StringBuilder> hashmap = new HashMap<>();
        for (int i = 0; i < numRows; i++) {
            hashmap.put(i, new StringBuilder());
        }

        int row = 0; // Start from the first row
        boolean increase = true; // Initially moving down

        for (int i = 0; i < s.length(); i++) {
            StringBuilder curString = hashmap.get(row);
            curString.append(s.charAt(i));

            if (increase) {
                row++;
                if (row == numRows - 1) { // Change direction at the bottom
                    increase = false;
                }
            } else {
                row--;
                if (row == 0) { // Change direction at the top
                    increase = true;
                }
            }
        }

        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < numRows; i++) {
            ans.append(hashmap.get(i).toString());
        }

        return ans.toString();
    }
}