class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        int n=candidates.length;

        List<List<Integer>> sol = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        backtrack( sol ,list,target,0,candidates);
        return sol;
       
    }

     void backtrack(List<List<Integer>> sol , List<Integer> list ,int target, int start, int[] candidates){
          
          if(target<0)
          return;
          else if(target==0)
          sol.add(new ArrayList<Integer>(list));
          else{
              for(int i=start;i<candidates.length;i++){
                  list.add(candidates[i]);
                  backtrack(sol,list,target-candidates[i],i,candidates);
                  list.remove(list.size()-1);
              }
          }
     }
}