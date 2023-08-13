class Solution {
    public String removeStars(String s) {
        Stack<Character> stack = new Stack<Character>();

        for(int i=0;i<s.length();i++){
            if(!stack.isEmpty() && s.charAt(i)=='*')
            stack.pop();
            else
            stack.push(s.charAt(i));
        }

        String result = "";
        while(!stack.isEmpty()){
            result=stack.pop()+result;
        }

        return result;
    }
}