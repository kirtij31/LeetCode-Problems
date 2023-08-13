class Solution {
    public String reverseWords(String s) {
        
        Stack words = new Stack();

        int st=0;
        int i=0;
        while(i<s.length()){
            while(i<s.length() && s.charAt(i)==' '){
            st++;
            i++;
            }
            while( i<s.length() && s.charAt(i)!=' '){
            i++;    
            }

            if(i!=st){
            words.push(s.substring(st,i));
            st=i;
            }
        }

        String reversed = "";
         reversed = reversed + words.pop();
        while(!words.isEmpty()){
            reversed = reversed + " " +words.pop();
        }

        return reversed;
    }
}