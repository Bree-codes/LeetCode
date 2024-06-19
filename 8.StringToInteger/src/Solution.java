public class Solution {
    public int myAtoi(String s) {

        char[] chars = s.toCharArray();
        int j =0,i;
        char c = '+';


        for (i = 0; i < chars.length; i++) {

            if((chars[i] == '-' || chars[i] == '+') && j == i) {
                if(chars[i-1] != ' ')
                    break;
                c = chars[i];
                ++j;
                continue;
            }

            if((chars[i] == ' ' || chars[i] == '0') && j == i){
                ++j;
                continue;
            }


            if(!(chars[i] >= '0' && chars[i] <= '9'))
                break;

        }

        if(j == i)
            return 0;

        try {
            i = Integer.parseInt(c+s.substring(j, i));
        }catch (NumberFormatException e){
            if(c == '-') return -2147483648;
            return 2147483647;
        }

        return i;
    }
}
