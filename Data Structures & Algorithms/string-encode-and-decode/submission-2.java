class Solution {

    public String encode(List<String> strs) {
        if(strs.isEmpty()) {
            return "";
        }
        StringBuilder encoded = new StringBuilder();
        for(String str : strs) {
            encoded.append(str.length()).append("@").append(str);
        }
        return encoded.toString();
    }

    public List<String> decode(String str) {
        if(str.length() == 0) {
            return new ArrayList<>();
        }
        ArrayList<String> decoded = new ArrayList<>();
        int i = 0;
        while(i < str.length()) {
            int endIndex = i;
            while(str.charAt(endIndex) != '@') {
                endIndex++;
            }
            int len = Integer.parseInt(str.substring(i, endIndex));
            i = endIndex + 1;
            endIndex = i + len;
            decoded.add(str.substring(i, endIndex));
            i = endIndex;
        }
        return decoded;
    }
}
