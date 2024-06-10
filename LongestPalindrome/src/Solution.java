public class Solution {
    public String longestPalindrome(String s) {


        String palindrome = String.valueOf(s.charAt(0));

        if(s.length() == 1) return s;

        for (int i = 0; i < s.length(); i++) {
            int j = i+1;
            while (j < s.length()){
                if(s.charAt(i) == s.charAt(j)){
                    int k = i, h = j;
                    while (h >= k){
                        if(s.charAt(h) == s.charAt(k)){
                            k++; h--;
                        }else {
                            break;
                        }
                        if(k >= h){
                            String subString = s.substring(i, j+1);
                            if(subString.length() > palindrome.length()){
                                palindrome = subString;
                            }
                        }
                    }
                }
                j++;
            }
        }

        return palindrome;

    }
}