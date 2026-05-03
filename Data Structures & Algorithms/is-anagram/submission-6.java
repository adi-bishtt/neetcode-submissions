class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length()){
            return false;
        }

        char[] SORT1 = s.toCharArray();
        char[] SORT2 = t.toCharArray();

        Arrays.sort(SORT1);
        Arrays.sort(SORT2);

        return Arrays.equals(SORT1 , SORT2);
        

        
    }
}