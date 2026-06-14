class Solution {
    public boolean hasDuplicate(int[] nums) {

    Set<Integer> twotime = new HashSet<>();

    for(int num : nums){
        if(twotime.contains(num)){
            return true;
        }
        twotime.add(num);
    }
    return false;
        
    }
}