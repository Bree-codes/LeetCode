public class Solution {

    public int lengthOfLongestSubstring(String s) {

        int longestSubString = 0, i =0, j;
        //convert the string to a characters array.
        char[] subString = s.toCharArray();

        if(subString.length == 1){
            return 1;
        }

        for (j = 1; j < subString.length; j++) {
            for(int k = j-1; k >= i; k--){
                if(subString[k] == subString[j]){
                    int newLength = j - i;
                    if(newLength > longestSubString){
                        longestSubString = newLength;
                    }
                    i=k+1;
                    break;
                }
            }


            if(j == subString.length-1){
                int newLength = j+1 - i;
                if(newLength > longestSubString){
                    longestSubString = newLength;
                }
            }
        }

        return longestSubString;
    }
}
