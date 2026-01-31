import java.util.*;

class Solution {
    public String[] findWords(String[] words) {
        String row1 = "qwertyuiop";
        String row2 = "asdfghjkl";
        String row3 = "zxcvbnm";
        
        Set<Character> set1 = new HashSet<>();
        Set<Character> set2 = new HashSet<>();
        Set<Character> set3 = new HashSet<>();
        
        for (char c : row1.toCharArray()) set1.add(c);
        for (char c : row2.toCharArray()) set2.add(c);
        for (char c : row3.toCharArray()) set3.add(c);
        
        List<String> result = new ArrayList<>();
        
        for (String word : words) {
            String lower = word.toLowerCase();
            Set<Character> letters = new HashSet<>();
            for (char c : lower.toCharArray()) letters.add(c);
            
            if (set1.containsAll(letters) || set2.containsAll(letters) || set3.containsAll(letters)) {
                result.add(word);
            }
        }
        
        return result.toArray(new String[0]);
    }
}
