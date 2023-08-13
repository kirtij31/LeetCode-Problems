class Solution {
    public int maxVowels(String s, int k) {
        int i=0;
        char[] arr = s.toCharArray();
        int[] value = new int[arr.length];
        while(i<arr.length){
            if(arr[i]=='a' || arr[i]=='e' || arr[i]=='i' || arr[i]=='o' || arr[i]=='u'){
              value[i]=1;
            }else
              value[i]=0;

             i++;
        }
        i=0;
        int sum=0;
        int maxsum = 0;
        while(i<k){
          sum+=value[i];
          i++;
        }
        System.out.print(sum);
        maxsum = Math.max(maxsum,sum);
        int j=0;
        while(i<value.length){
            sum = sum+value[i]-value[j];
             maxsum = Math.max(maxsum,sum);
             i++;
             j++;
        }

        return maxsum;
    }
}