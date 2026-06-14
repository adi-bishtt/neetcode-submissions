class Solution {
    public int removeElement(int[] nums, int val) {
        List<Integer> arrK = new ArrayList<>();
        for(int num : nums){
            if(num != val){
                arrK.add(num);
            }
        }
        for(int i = 0;i<arrK.size();i++){
            nums[i]=arrK.get(i);
        }
        return arrK.size();
            
    }
}