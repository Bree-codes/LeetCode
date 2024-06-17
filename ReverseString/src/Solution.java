public class Solution {

    String word = "Hello People!";

    //create a new instance of string builder to store the reversed string
    StringBuilder reversedString = new StringBuilder();

    //method to reverse string
    public void reverseString(){
    for(int i = word.length()-1 ; i>=0 ; i--) {
        reversedString.append(word.charAt(i));
      }
    }
}
