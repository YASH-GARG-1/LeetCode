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

// Optimized Approach:

class OptimnizedSolution {
  public boolean isValid(String s) {
    // Stack to store opening brackets
    Stack<Character> stack = new Stack<>();
    // Loop through the characters in the string
    for (char c : s.toCharArray()) {
      // Push opening brackets onto the stack
      if (c == '(' || c == '{' || c == '[') {
        stack.push(c);
      } else {
        // If the stack is empty or doesn't match, return false
        if (stack.isEmpty() ||
            (c == ')' && stack.pop() != '(') ||
            (c == '}' && stack.pop() != '{') ||
            (c == ']' && stack.pop() != '[')) {
          return false;
        }
      }
    }
    // Return true if the stack is empty
    return stack.isEmpty();
  }
}