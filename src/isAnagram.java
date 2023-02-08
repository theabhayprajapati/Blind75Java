import java.util.Arrays;
import java.util.HashMap;

public class isAnagram {
    public static void main(String[] args) {
    String s  = "anagram";
    String t = "nagaram";
        System.out.println(checkIsAnagram(s, t));
    }
    public static boolean checkIsAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        boolean ans = true;
        HashMap<Character, Integer> sMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if(sMap.containsKey(s.charAt(i))){
                sMap.put(s.charAt(i), sMap.get(s.charAt(i))+1);
            }else{
                sMap.put(s.charAt(i), 1);
            }
        }
        // O(N)

        for (int i = 0; i < t.length(); i++) {
            if(sMap.containsKey(t.charAt(i)) &&  sMap.get(t.charAt(i))>0){
                sMap.put(t.charAt(i), sMap.get(t.charAt(i)) -1);
            }else{
                ans = false;
            }
        }

        // O(N)
        return ans;
    }

}
