class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        HashSet<List<Integer>> list = new HashSet<>();
        for(int i=0;i<(1<<nums.length);i++){
            List<Integer> arr = new ArrayList<>();
            for(int x = 0;x<nums.length;x++){
            if((i &(1<<x)) != 0){
                arr.add(nums[x]);
            }
            list.add(arr);
            }
        }
        return new ArrayList<List<Integer>> (list);
    }
}
