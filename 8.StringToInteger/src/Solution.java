import java.util.regex.Pattern;

public class Solution {
    public int myAtoi(String s) {

        int k = 0,j=0, i;
        char[] str = s.toCharArray();

        if(str[0] == '-' || str[0] == '+')
            ++k;


        for (i = k; i < str.length; i++) {
             j = k;

             if(str[i] == 0){
                 ++j;
                 ++i;
                 continue;
             }
             if(str[i] ==1 ||str[i] ==2||str[i] ==3||str[i]==4||
                     str[i] ==5 || str[i]==6||str[i] ==7 ||
                     str[i] ==8 || str[i]== 9|| str[i] == ' '){
                i++;
            }else{
                 break;
             }
        }

        System.out.println(s.substring(j, i));

        return 0;
    }
}
