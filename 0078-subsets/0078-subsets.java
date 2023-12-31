class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> sol = new ArrayList<>();
        List<Integer> list = new ArrayList<>();

        subset(sol,list,nums,0);
        return sol;
    }

    void subset( List<List<Integer>> sol, List<Integer> list, int[] nums, int start ){

        sol.add(new ArrayList<>(list) );

        for(int i=start;i<nums.length;i++){
            list.add(nums[i]);
            subset(sol,list,nums,i+1);
            list.remove(list.size()-1);
        }
    }
}