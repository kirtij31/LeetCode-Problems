class Solution {
    public boolean closeStrings(String word1, String word2) {
        
        // HashSet<Character> set = new HashSet<Character>();
        // HashMap<Character,Integer> map1 = new HashMap<Character,Integer>();


        // for(int i=0; i<word1.length();i++){
        //     set.add(word1.charAt(i));
        //     if(map1.containsKey(word1.charAt(i))){
        //         int value = map1.get(word1.charAt(i));
        //         map1.put(word1.charAt(i),value++));
        //     }else
        //        map1.put(word1.charAt(i),1);
        // }

        //  HashMap<Character,Integer> map2 = new HashMap<Character,Integer>();


        // for(int i=0; i<word2.length();i++){
        //     if(!set.has(word2.charAt(i)))
        //     return false;

        //      if(map2.containsKey(word1.charAt(i))){
        //         int value = map2.get(word1.charAt(i));
        //         map2.put(word1.charAt(i),value++));
        //     }else
        //        map2.put(word1.charAt(i),1);
            
        // }

        if(word1.length() != word2.length()){
            return false;
        }
        HashMap<Character, Integer> map = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();
        
        for(int i = 0 ; i < word1.length() ; i++){
            map.put(word1.charAt(i), map.getOrDefault(word1.charAt(i), 0)+1);
            map2.put(word2.charAt(i), map2.getOrDefault(word2.charAt(i), 0)+1);
        }        
        for(int j= 0 ; j < word2.length() ;j++ ){
            if(!map.containsKey(word2.charAt(j))){
                return false;
            }
            if(!map2.containsKey(word1.charAt(j))){
                return false;
            }
        }
        ArrayList<Integer> list1 = new  ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        
        for(Map.Entry<Character,Integer> entry : map.entrySet()){
            list1.add(entry.getValue());
        }
        for(Map.Entry<Character,Integer> entry : map2.entrySet()){
            list2.add(entry.getValue());
        }
                                                                 
        Collections.sort(list1);
        Collections.sort(list2);
                                                                 
        return list1.equals(list2); 


    }
}