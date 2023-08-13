class Solution {
    public int[] asteroidCollision(int[] asteroids) {
  Stack<Integer> st = new Stack<>();

    for (int e : asteroids) {
      if (e > 0) {
        st.push(e);
      } else {
        while (st.size() > 0 && st.peek() > 0 && st.peek() < -e)st.pop();
        if (st.size() > 0 && st.peek() == -e) {
          st.pop();
        } else if (st.size() > 0 && st.peek() > -e) {

        } else {
          st.push(e);
        }
      }
    }

    int ans[] = new int[st.size()];
    int i = ans.length - 1;
    while (i >= 0)ans[i--] = st.pop();
    return ans;
        
    }
}