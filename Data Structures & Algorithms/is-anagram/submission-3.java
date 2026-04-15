class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) {
            return false;
        }
        HashMap<Character, Integer> str1 = new HashMap<>();
        HashMap<Character, Integer> str2 = new HashMap<>();
        for(char ch : s.toCharArray()) {
            str1.put(ch, str1.getOrDefault(ch, 0) + 1);
        }
        for(char ch : t.toCharArray()) {
            str2.put(ch, str2.getOrDefault(ch, 0) + 1);
        }
        if(str1.equals(str2)) {
            return true;
        }
        return false;
    }
}
