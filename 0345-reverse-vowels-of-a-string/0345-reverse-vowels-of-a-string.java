class Solution {
    public String reverseVowels(String s) {
        
        Stack vowels = new Stack();
        for(int i=0;i<s.length();i++){
            if(isVowel(s.charAt(i)))
            vowels.push(s.charAt(i));
        }
         String reversed = "";
         for(int i=0;i<s.length();i++){
            if(isVowel(s.charAt(i)))
            reversed = reversed+vowels.pop();
            else
            reversed = reversed + s.charAt(i);
        }

        return reversed ;
    }

     boolean isVowel(char c) {
        return c == 'a' || c == 'i' || c == 'e' || c == 'o' || c == 'u'
            || c == 'A' || c == 'I' || c == 'E' || c == 'O' || c == 'U';
    }
}