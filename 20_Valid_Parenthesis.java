import java.util.Stack;

class Solution {
  public boolean isValid(String s) {

    Stack<Character> st = new Stack<>();
    for (int i = 0; i < s.length(); i++) {
      char ch = s.charAt(i);
      if (st.isEmpty()) {
        st.push(ch);
        continue;
      }
      char topElement = st.pop();
      if (topElement == '(' && ch == ')') {
        continue;
      } else if (topElement == '{' && ch == '}') {
        continue;
      } else if (topElement == '[' && ch == ']') {
        continue;
      } else {
        st.push(topElement);
        st.push(ch);
      }
    }

    if (st.size() == 0) {
      return true;
    }

    return false;
  }
}