class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map1 = new HashMap<Integer,Integer>();
        int i=0;

        while(i<nums1.length){
            if(!map1.containsKey(nums1[i]))
            map1.put(nums1[i],1);
            i++;
        }

        List<Integer> list2 = new ArrayList<>();

        for( i=0;i<nums2.length;i++){
            if(map1.containsKey(nums2[i]) && map1.get(nums2[i])==1)
            map1.put(nums2[i],0);
            else if(! map1.containsKey(nums2[i])){
            list2.add(nums2[i]);
            map1.put(nums2[i],0);}
        }

        List<Integer> list1 = new ArrayList<>();

        for( i=0;i<nums1.length;i++){
            if(map1.containsKey(nums1[i]) && map1.get(nums1[i])==1){
            list1.add(nums1[i]);
            map1.put(nums1[i],0);}
        }

        List< List<Integer>> list = new ArrayList<>();
        list.add(list1);
        list.add(list2);
         return list;

    }
}