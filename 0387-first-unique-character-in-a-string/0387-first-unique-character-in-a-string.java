
class Solution {
    public int firstUniqChar(String s) {

        // int[] freq = new int[26];

        // // Step 1: Count frequency
        // for (int i = 0; i < s.length(); i++) {
        //     char ch = s.charAt(i);
        //     freq[ch - 'a']++;
        // }

        // // Step 2: Find first non-repeating character
        // for (int i = 0; i < s.length(); i++) {

        //     char ch = s.charAt(i);

        //     if (freq[ch - 'a'] == 1) {
        //         return i;
        //     }
        // }

        // return -1;

        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }

        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);

            if(map.get(ch) == 1){
                return i;
            }
        }
       return -1;
    }
}
