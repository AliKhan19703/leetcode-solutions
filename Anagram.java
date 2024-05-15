import java.util.Arrays;
class Solution {
    public boolean isAnagram(String s, String t) {
        int count = 0;
        if (s.length() != t.length()) {  //if the length of the s and t are not equal it means they are not anagram.
            return false;
        }
        char[] sArray = s.toCharArray();//change both strings to character arrays.
        char[] tArray = t.toCharArray();

        Arrays.sort(sArray);//Sort the arrays to compare.
        Arrays.sort(tArray);
        for(int i =0;i<sArray.length;i++){
            if (sArray[i] == tArray[i]) {  //Here i am comparing character of both arrays with each other
                count++;    //if the character are same the increment counter.
            }
        }
        if(count == sArray.length){ //if the counter and the length of sArray are same it means they are anagram.
            return true;
        }
        return false;
    }
}
public class Anagram{
    public static void main(String[] args){
        Solution s = new Solution();
        System.out.println(s.isAnagram("anagram","nagaram"));
    }
}