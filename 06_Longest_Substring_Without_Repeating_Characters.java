// LeetCode 3 — Longest Substring Without Repeating Characters
public static int lengthOfLongestSubstring(String s) {
    int i = 0; int j =0; int maxLength= 0;
    Set<Character> set = new HashSet<>();
    while(j<s.length()){
        if(set.contains(s.charAt(j))){
            while(set.contains(s.charAt(j))){
                set.remove(s.charAt(i));
                i++;
            }
        }
        set.add(s.charAt(j));
        j++;
        if (maxLength < (j - i)) {
            maxLength = (j - i);
        }
    }
    return maxLength;
}
